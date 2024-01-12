package kr.co.abc.kotlin_template.template.entity

import kr.co.abc.kotlin_template.config.common.BaseTime
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.GrantedAuthority
import javax.persistence.*

@Entity
@Table(name = "user")
class User(
    name: String,
    email: String,
    m_password: String
) : BaseTime(), UserDetails {

    @Id
    @GeneratedValue
    var id: Long? = null

    var name: String? = name

    @Column(nullable = false, unique = true)
    var email: String = email

    @Column(nullable = false)
    var m_password: String = m_password

    constructor() : this("", "", "") // 기본 생성자

    override fun getAuthorities(): MutableCollection<out GrantedAuthority>? {
        return null
    }

    override fun getPassword(): String {
        return m_password
    }

    override fun getUsername(): String {
        return email
    }

    override fun isAccountNonExpired(): Boolean {
        return true
    }

    override fun isAccountNonLocked(): Boolean {
        return true
    }

    override fun isCredentialsNonExpired(): Boolean {
        return true
    }

    override fun isEnabled(): Boolean {
        return true
    }
}
