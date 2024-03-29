package kr.co.abc.kotlin_template.template.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*
import kr.co.abc.kotlin_template.template.entity.Template
import kr.co.abc.kotlin_template.template.model.TemplateService

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

    @PatchMapping("/api/v1/posts/{id}")
    fun patchUpdatePatch(@PathVariable id: Long, @RequestBody template: Template): String? {
        template.id = id // Assuming the Template entity has a mutable id property
        templateService.update(template)
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
