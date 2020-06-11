package vn.foo.foogroovy.domain

import org.springframework.data.annotation.Id
import org.springframework.data.solr.core.mapping.Indexed
import org.springframework.data.solr.core.mapping.SolrDocument

@SolrDocument(collection = "products")
class Product {
    @Id
    @Indexed(name = "id", type = "integer")
    String id;

    @Indexed(name = "productName", type = "string")
    String name;

    @Indexed(name = "createdAt", type = "date")
    Date createdAt;

    Product() {
        createdAt = new Date()
    }
}
