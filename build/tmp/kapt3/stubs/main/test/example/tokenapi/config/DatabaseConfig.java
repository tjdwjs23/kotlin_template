package test.example.tokenapi.config;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0017J\b\u0010\u0005\u001a\u00020\u0006H\u0017J\b\u0010\u0007\u001a\u00020\bH\u0017\u00a8\u0006\t"}, d2 = {"Ltest/example/tokenapi/config/DatabaseConfig;", "", "()V", "dataSource", "Ljavax/sql/DataSource;", "dataSourceProperties", "Lorg/springframework/boot/autoconfigure/jdbc/DataSourceProperties;", "transactionManager", "Lorg/springframework/transaction/PlatformTransactionManager;", "kotlinTokenApi"})
@org.springframework.context.annotation.Configuration()
public class DatabaseConfig {
    
    public DatabaseConfig() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.boot.context.properties.ConfigurationProperties(prefix = "spring.datasource")
    @org.springframework.context.annotation.Primary()
    @org.springframework.context.annotation.Bean()
    public org.springframework.boot.autoconfigure.jdbc.DataSourceProperties dataSourceProperties() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Primary()
    @org.springframework.context.annotation.Bean()
    public javax.sql.DataSource dataSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.context.annotation.Bean()
    public org.springframework.transaction.PlatformTransactionManager transactionManager() {
        return null;
    }
}