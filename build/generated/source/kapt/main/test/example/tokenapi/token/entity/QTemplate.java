package test.example.tokenapi.token.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTemplate is a Querydsl query type for Template
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTemplate extends EntityPathBase<Template> {

    private static final long serialVersionUID = 1791626627L;

    public static final QTemplate template = new QTemplate("template");

    public final StringPath author = createString("author");

    public final StringPath content = createString("content");

    public final DateTimePath<java.util.Date> create_date = createDateTime("create_date", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.util.Date> modified_date = createDateTime("modified_date", java.util.Date.class);

    public final StringPath title = createString("title");

    public QTemplate(String variable) {
        super(Template.class, forVariable(variable));
    }

    public QTemplate(Path<Template> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTemplate(PathMetadata metadata) {
        super(Template.class, metadata);
    }

}

