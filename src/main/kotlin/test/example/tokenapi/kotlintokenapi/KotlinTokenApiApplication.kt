package test.example.tokenapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import org.springframework.boot.runApplication

@SpringBootApplication
class tokenapiApplication : SpringBootServletInitializer() {
    override fun configure(application: SpringApplicationBuilder): SpringApplicationBuilder {
        return application.sources(tokenapiApplication::class.java)
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            runApplication<tokenapiApplication>(*args)
        }
    }
}
