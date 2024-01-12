package kr.co.abc.kotlin_template

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer
import org.springframework.boot.runApplication

@SpringBootApplication
class kotlinTemplateApplication : SpringBootServletInitializer() {
    override fun configure(application: SpringApplicationBuilder): SpringApplicationBuilder {
        return application.sources(kotlinTemplateApplication::class.java)
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            runApplication<kotlinTemplateApplication>(*args)
        }
    }
}
