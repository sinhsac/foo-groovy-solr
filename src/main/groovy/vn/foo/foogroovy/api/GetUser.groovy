package vn.foo.foogroovy.api


import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import vn.foo.foogroovy.domain.User
import vn.foo.foogroovy.domain.UserRepo

@RestController
@RequestMapping("/api/users")
class GetUser {

    @Autowired
    UserRepo userRepo;

    @GetMapping
    List<User> allUsers() {
        userRepo.findAll()
    }

    @GetMapping("/{id}")
    User getById(@PathVariable("id") Integer id) {
        userRepo.findById id;
    }
}
