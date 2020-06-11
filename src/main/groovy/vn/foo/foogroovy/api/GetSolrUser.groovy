package vn.foo.foogroovy.api

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import vn.foo.foogroovy.repo.solr.SolrUser
import vn.foo.foogroovy.repo.solr.SolrUserRepo

@RestController
@RequestMapping("/solr/users")
class GetSolrUser {

    @Autowired
    SolrUserRepo userRepo;

    @GetMapping
    List<SolrUser> allUsers() {
        userRepo.findAll().asList()
    }

    @GetMapping("/_add")
    SolrUser addNew() {
        SolrUser solrUser = new SolrUser();
        solrUser.id = UUID.randomUUID().toString()
        solrUser.name = UUID.randomUUID().toString()
        userRepo.save(solrUser);
    }
}
