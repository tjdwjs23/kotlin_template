package test.example.tokenapi.token.model

import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.stereotype.Service
import test.example.tokenapi.token.entity.QTemplate
import test.example.tokenapi.token.entity.Template
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext
import javax.transaction.Transactional


@Service
class TemplateService() {

    @PersistenceContext
    private lateinit var entityManager: EntityManager

    @Transactional
    fun save(template: Template) {
        entityManager.persist(template)
        entityManager.flush()
    }

    fun getAllTemplates(): List<Template> {
        val builder = JPAQueryFactory(entityManager)
        val template = QTemplate.template
        val query = builder.selectFrom(template)

        return query.fetch()
    }


}
