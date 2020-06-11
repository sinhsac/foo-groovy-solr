package vn.foo.foogroovy.repo.solr

import org.springframework.data.solr.repository.SolrCrudRepository
import vn.foo.foogroovy.domain.User

interface UserRepo extends SolrCrudRepository<User, String> {
}
