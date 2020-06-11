package vn.foo.foogroovy.config

import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import javax.sql.DataSource

@Configuration
class DbConfig {

    @Bean
    DataSource getDataSource() {
        HikariConfig hikariConfig = new HikariConfig()
        hikariConfig.setJdbcUrl("jdbc:mysql://localhost:3306/groovy_db?useSSL=false&useUnicode=true&characterEncoding=utf-8")
        hikariConfig.setUsername("root")
        hikariConfig.setPassword("root")
        hikariConfig.addDataSourceProperty("cachePrepStmts", "true")
        hikariConfig.addDataSourceProperty("prepStmtCacheSize", "250")
        hikariConfig.addDataSourceProperty("prepStmtCacheSqlLimit", "2048")
        hikariConfig.setLeakDetectionThreshold(60 * 1000)
        hikariConfig.setMinimumIdle(5)
        new HikariDataSource(hikariConfig)
    }
}
