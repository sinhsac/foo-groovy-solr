package vn.foo.foogroovy.api

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import vn.foo.foogroovy.domain.Product
import vn.foo.foogroovy.repo.solr.ProductRepo

@RestController
@RequestMapping("/solr/products")
class GetProduct {
    @Autowired
    ProductRepo productRepo

    @GetMapping
    List<Product> allUsers() {
        productRepo.findAll().asList()
    }

    @GetMapping("/_add")
    Product addNew() {
        Product solrProduct = new Product();
        solrProduct.id = UUID.randomUUID().toString()
        solrProduct.name = UUID.randomUUID().toString()
        productRepo.save solrProduct
    }
}