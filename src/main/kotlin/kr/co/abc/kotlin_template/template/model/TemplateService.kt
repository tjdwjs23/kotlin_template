package test.example.tokenapi.token.model

import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.stereotype.Service
import test.example.tokenapi.token.entity.QTemplate
import test.example.tokenapi.token.entity.Template
import javax.persistence.EntityManager
import javax.persistence.Id
import javax.persistence.PersistenceContext
import javax.transaction.Transactional


@Service
class TemplateService() {

    @PersistenceContext
    private lateinit var entityManager: EntityManager

    fun getAllTemplates(): List<Template> {
        val builder = JPAQueryFactory(entityManager)
        val template = QTemplate.template
        val query = builder.selectFrom(template)

        return query.fetch()
    }

    fun getTemplate(id : Long): Template? {
        val builder = JPAQueryFactory(entityManager)
        val template = QTemplate.template
        val query = builder.selectFrom(template).where(template.id.eq(id))

        return query.fetchOne()
    }

    @Transactional
    fun save(template: Template) {
        entityManager.persist(template)
        entityManager.flush()
    }

    @Transactional
    fun update(template: Template) {
        val existingTemplate = entityManager.find(Template::class.java, template.id)

        if (existingTemplate != null) {
            var isChanged = false

            if (existingTemplate.title != template.title) {
                existingTemplate.title = template.title
                isChanged = true
            }

            if (existingTemplate.content != template.content) {
                existingTemplate.content = template.content
                isChanged = true
            }

            if (isChanged) {
                entityManager.merge(existingTemplate)
                entityManager.flush()
            }
        }
    }

}
