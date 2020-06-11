package vn.foo.foogroovy.repo.solr

import org.springframework.data.solr.repository.SolrCrudRepository
import vn.foo.foogroovy.domain.Product

interface ProductRepo extends SolrCrudRepository<Product, String> {
}