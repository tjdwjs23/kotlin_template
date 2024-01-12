package kr.co.abc.kotlin_template.template.entity

import kr.co.abc.kotlin_template.template.entity.Template
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TemplateRepository : JpaRepository<Template, Long>
