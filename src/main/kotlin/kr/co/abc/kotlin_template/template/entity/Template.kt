package kr.co.abc.kotlin_template.template.entity

import java.util.Date
import javax.persistence.*

@Entity
@Table(name = "template_table")
data class Template(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long? = null,
    var title: String? = null,
    var content: String? = null,
    var author: String? = null,
    var create_date: Date? = null,
    var modified_date: Date? = null
)


