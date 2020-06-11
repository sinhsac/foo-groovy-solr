package vn.foo.foogroovy.repo.solr

import org.springframework.data.annotation.Id
import org.springframework.data.solr.core.mapping.Indexed
import org.springframework.data.solr.core.mapping.SolrDocument

@SolrDocument(collection = "products")
class SolrProduct {
    @Id
    @Indexed(name = "id", type = "integer")
    String id;

    @Indexed(name = "productName", type = "string")
    String name;

    @Indexed(name = "createdAt", type = "date")
    Date createdAt;

    SolrProduct() {
        createdAt = new Date()
    }
}
