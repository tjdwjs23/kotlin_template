package test.example.tokenapi.token.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0017J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\t\u001a\u00020\nH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Ltest/example/tokenapi/token/controller/TemplateController;", "", "templateService", "Ltest/example/tokenapi/token/model/TemplateService;", "(Ltest/example/tokenapi/token/model/TemplateService;)V", "index", "", "postsSave", "postsSavePost", "template", "Ltest/example/tokenapi/token/entity/Template;", "kotlinTokenApi"})
@org.springframework.stereotype.Controller()
public class TemplateController {
    private final test.example.tokenapi.token.model.TemplateService templateService = null;
    
    public TemplateController(@org.jetbrains.annotations.NotNull()
    test.example.tokenapi.token.model.TemplateService templateService) {
        super();
    }
    
    /**
     * index()
     *
     * @return
     */
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/"})
    public java.lang.String index() {
        return null;
    }
    
    /**
     * /posts/save
     *
     * @return
     */
    @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.GetMapping(value = {"/posts/save"})
    public java.lang.String postsSave() {
        return null;
    }
    
    /**
     * /api/v1/posts
     *
     * @return
     */
    @org.jetbrains.annotations.Nullable()
    @org.springframework.web.bind.annotation.PostMapping(value = {"/api/v1/posts"})
    public java.lang.String postsSavePost(@org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.RequestBody()
    test.example.tokenapi.token.entity.Template template) {
        return null;
    }
}