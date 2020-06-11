package vn.foo.foogroovy.domain

import org.springframework.data.annotation.Id
import org.springframework.data.solr.core.mapping.Indexed
import org.springframework.data.solr.core.mapping.SolrDocument

@SolrDocument(collection = "users")
class User {

    @Id
    @Indexed(name = "id", type = "integer")
    String id;

    @Indexed(name = "userName", type = "string")
    String name;

    @Indexed(name = "createdAt", type = "date")
    Date createdAt;

    User() {
        createdAt = new Date()
    }
}
