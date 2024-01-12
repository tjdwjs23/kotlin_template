package kr.co.abc.kotlin_template.template.controller

import kr.co.abc.kotlin_template.template.entity.User
import kr.co.abc.kotlin_template.template.entity.UserLoginResponse
import kr.co.abc.kotlin_template.template.model.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController(val userService: UserService, val passwordEncoder: PasswordEncoder) {

    @PostMapping("/join")
    fun join(@RequestBody user: User): ResponseEntity<Any> {
        if (userService.checkDuplicateUser(user.email) != null) {
            return ResponseEntity.ok("이미 등록된 이메일입니다")
        }

        // 비밀번호를 BCrypt로 해싱하여 저장
        user.m_password = passwordEncoder.encode(user.m_password)
        userService.saveUser(user)

        return ResponseEntity.ok(user)
    }

    @PostMapping("/login")
    fun login(@RequestBody userReq: User): ResponseEntity<UserLoginResponse?> {
        val existingUser: User? = userService.checkDuplicateUser(userReq.email)
        println("existingUser: $existingUser")

        if (existingUser != null) {
            // 비밀번호 일치 여부를 BCrypt로 확인
            if (passwordEncoder.matches(userReq.m_password, existingUser.m_password)) {
                val userLoginResponse = UserLoginResponse(
                    jwtToken = userService.login(userReq)?.jwtToken ?: ""
                )
                return ResponseEntity.ok(userLoginResponse)
            }
        }

        // 기존 사용자가 없거나 비밀번호가 일치하지 않는 경우
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null)
    }
}
