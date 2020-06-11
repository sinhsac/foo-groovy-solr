package vn.foo.foogroovy.api

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import vn.foo.foogroovy.domain.User
import vn.foo.foogroovy.repo.solr.UserRepo

@RestController
@RequestMapping("/solr/users")
class GetUser {

    @Autowired
    UserRepo userRepo;

    @GetMapping
    List<User> allUsers() {
        userRepo.findAll().asList()
    }

    @GetMapping("/_add")
    User addNew() {
        User solrUser = new User();
        solrUser.id = UUID.randomUUID().toString()
        solrUser.name = UUID.randomUUID().toString()
        userRepo.save(solrUser);
    }
}
