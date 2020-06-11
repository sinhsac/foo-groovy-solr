package vn.foo.foogroovy.repo.solr

import org.springframework.data.solr.repository.SolrCrudRepository

interface SolrProductRepo extends SolrCrudRepository<SolrProduct, String> {
}