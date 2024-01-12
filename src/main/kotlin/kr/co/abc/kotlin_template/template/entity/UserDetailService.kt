package kr.co.abc.kotlin_template.template.entity

import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service

@Service
class UserDetailService(private val userRepository: UserRepository): UserDetailsService {
    override fun loadUserByUsername(username: String): User? {
        return userRepository.findByEmail(username)}
}
