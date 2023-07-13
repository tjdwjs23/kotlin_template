package test.example.tokenapi.token.controller

import com.fasterxml.jackson.databind.ObjectMapper
import kotlinx.coroutines.*
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*
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
    fun index(model: Model): String {
        val templates = templateService.getAllTemplates();
        model.addAttribute("templates", templates)
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

    /**
     * /api/v1/posts
     *
     * @return
     */
    @GetMapping("/posts/{id}")
    fun postsSavePost(@PathVariable("id") id:Long, model: Model): String? {
        val template = templateService.getTemplate(id);
        println(template)
        model.addAttribute("template", template)
        return "posts-detail"
    }

}
