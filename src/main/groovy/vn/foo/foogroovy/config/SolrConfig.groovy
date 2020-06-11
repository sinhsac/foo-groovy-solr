package vn.foo.foogroovy.config


import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.solr.core.SolrTemplate
import org.springframework.data.solr.repository.config.EnableSolrRepositories
import org.springframework.data.solr.server.support.EmbeddedSolrServerFactoryBean

@EnableSolrRepositories(basePackages ="vn.foo.foogroovy.repo",
        solrTemplateRef = "solrTemplate",
        schemaCreationSupport = true
)
@Configuration
class SolrConfig {
    String homeSolr = "solr_home/";

    @Bean
    EmbeddedSolrServerFactoryBean solrServerFactoryBean() {
        EmbeddedSolrServerFactoryBean factory = new EmbeddedSolrServerFactoryBean()
        factory.setSolrHome homeSolr
        factory
    }

    @Bean
    SolrTemplate solrTemplate() throws Exception {
        new SolrTemplate(solrServerFactoryBean().getObject());
    }
}
