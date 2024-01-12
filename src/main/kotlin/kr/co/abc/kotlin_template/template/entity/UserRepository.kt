package kr.co.abc.kotlin_template.template.entity

import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Long> {
    fun findByEmail(email: String): User?
}