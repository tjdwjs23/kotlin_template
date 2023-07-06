package test.example.tokenapi.config

import javax.sql.DataSource

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import org.springframework.jdbc.datasource.DataSourceTransactionManager
import org.springframework.transaction.PlatformTransactionManager

import com.zaxxer.hikari.HikariDataSource

@Configuration
class DatabaseConfig {

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource")
    fun dataSourceProperties(): DataSourceProperties {
        return DataSourceProperties()
    }

    @Bean
    @Primary
    fun dataSource(): DataSource {
        return dataSourceProperties().initializeDataSourceBuilder()
            .type(HikariDataSource::class.java).build()
    }

    @Bean
    fun transactionManager(): PlatformTransactionManager {
        return DataSourceTransactionManager(dataSource())
    }
}
