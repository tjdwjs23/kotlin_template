package kr.co.abc.kotlin_template.template.entity

import org.springframework.http.HttpStatus


data class UserLoginResponse(
    val jwtToken:String?=null,
)