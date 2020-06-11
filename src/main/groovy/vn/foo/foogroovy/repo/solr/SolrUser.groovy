package vn.foo.foogroovy.repo.solr

import org.springframework.data.annotation.Id
import org.springframework.data.solr.core.mapping.Indexed
import org.springframework.data.solr.core.mapping.SolrDocument

@SolrDocument(collection = "users")
class SolrUser {

    @Id
    @Indexed(name = "id", type = "integer")
    String id;

    @Indexed(name = "userName", type = "string")
    String name;

    @Indexed(name = "createdAt", type = "date")
    Date createdAt;

    SolrUser() {
        createdAt = new Date()
    }
}
