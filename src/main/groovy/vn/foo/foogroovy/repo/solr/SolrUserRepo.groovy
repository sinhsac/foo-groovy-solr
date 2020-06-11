package vn.foo.foogroovy.repo.solr

import org.springframework.data.solr.repository.SolrCrudRepository

interface SolrUserRepo extends SolrCrudRepository<SolrUser, String> {
}
