package test.example.tokenapi.token.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0017R\u0012\u0010\u0003\u001a\u00020\u00048\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Ltest/example/tokenapi/token/model/TemplateService;", "", "()V", "entityManager", "Ljavax/persistence/EntityManager;", "getAllTemplates", "", "Ltest/example/tokenapi/token/entity/Template;", "save", "", "template", "kotlinTokenApi"})
@org.springframework.stereotype.Service()
public class TemplateService {
    @javax.persistence.PersistenceContext()
    private javax.persistence.EntityManager entityManager;
    
    public TemplateService() {
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