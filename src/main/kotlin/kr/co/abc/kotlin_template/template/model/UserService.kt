package kr.co.abc.kotlin_template.template.model

import kr.co.abc.kotlin_template.config.jwt.JwtTokenProvider
import kr.co.abc.kotlin_template.template.entity.CommonResponse
import kr.co.abc.kotlin_template.template.entity.User
import kr.co.abc.kotlin_template.template.entity.UserRepository
import kr.co.abc.kotlin_template.template.entity.UserLoginResponse
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
class UserService(
    val userRepository: UserRepository,
    private val jwtTokenProvider: JwtTokenProvider,
) {
    @Transactional
    fun saveUser(user: User): CommonResponse<Any, String> {
        if (checkDuplicateUser(user.email) != null) {
            return CommonResponse("fail", "이미 가입된 회원입니다.")
        } else {
            userRepository.save(user)
            return CommonResponse("success", "회원가입 되었습니다.")
        }
    }

    @Transactional
    fun checkDuplicateUser(email: String): User? {
        return userRepository.findByEmail(email)
    }

    @Transactional
    fun login(user: User): UserLoginResponse? {
        return UserLoginResponse(jwtToken = jwtTokenProvider.createToken(user.email))
    }
}