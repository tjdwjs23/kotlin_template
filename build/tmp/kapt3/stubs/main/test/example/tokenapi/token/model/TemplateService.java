package test.example.tokenapi.token.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0017R\u0010\u0010\u0002\u001a\u00020\u00038\u0012X\u0093\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Ltest/example/tokenapi/token/model/TemplateService;", "", "entityManager", "Ljavax/persistence/EntityManager;", "(Ljavax/persistence/EntityManager;)V", "getAllTemplates", "", "Ltest/example/tokenapi/token/entity/Template;", "save", "", "template", "kotlinTokenApi"})
@org.springframework.stereotype.Service()
public class TemplateService {
    @javax.persistence.PersistenceContext()
    private final javax.persistence.EntityManager entityManager = null;
    
    public TemplateService(@org.jetbrains.annotations.NotNull()
    javax.persistence.EntityManager entityManager) {
        super();
    }
    
    @javax.transaction.Transactional()
    public void save(@org.jetbrains.annotations.NotNull()
    test.example.tokenapi.token.entity.Template template) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<test.example.tokenapi.token.entity.Template> getAllTemplates() {
        return null;
    }
}