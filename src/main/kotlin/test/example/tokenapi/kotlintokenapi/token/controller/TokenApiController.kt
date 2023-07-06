package test.example.tokenapi.token.controller

import kotlinx.coroutines.*
import test.example.tokenapi.token.model.TokenService
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class TokenApiController(private val tokenService: TokenService) {

    /**
     * index()
     *
     * @return
     */
    @GetMapping("/")
    fun index(): String {
        return "index"
    }

    /**
     * Token list search
     */
    @GetMapping("/token")
    @ResponseBody
    suspend fun token(token_type: String, token_name: String): String = withContext(Dispatchers.IO) {
        val result = async { tokenService.findToken(token_type, token_name) }
        ApiResponse("OK", result.await())
    }.toJson()

    /**
     * Token contract inquiry
     */
    @GetMapping("/tokenAdd")
    @ResponseBody
    suspend fun tokenAdd(token_type: String, token_name: String): String = withContext(Dispatchers.IO) {
        val result = async { tokenService.findTokenContract(token_type, token_name) }
        ApiResponse("OK", result.await() ?: "Token not found")
    }.toJson()

    data class ApiResponse(val result: String, val value: Any) {
        fun toJson(): String = ObjectMapper().writeValueAsString(this)
    }
}
