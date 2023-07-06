package test.example.tokenapi.token.controller

import com.fasterxml.jackson.databind.ObjectMapper
import kotlinx.coroutines.*
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseBody
import test.example.tokenapi.token.entity.Template
import test.example.tokenapi.token.model.TemplateService

@Controller
class TemplateController(private val templateService: TemplateService) {

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
     * /posts/save
     *
     * @return
     */
    @GetMapping("/posts/save")
    fun postsSave(): String? {
        return "posts-save"
    }

    /**
     * /api/v1/posts
     *
     * @return
     */
    @PostMapping("/api/v1/posts")
    fun postsSavePost(@RequestBody template: Template): String? {
        templateService.save(template)
        return "redirect:/"
    }

}
