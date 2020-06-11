package vn.foo.foogroovy.api

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import vn.foo.foogroovy.repo.solr.SolrProduct
import vn.foo.foogroovy.repo.solr.SolrProductRepo
import vn.foo.foogroovy.repo.solr.SolrUser

@RestController
@RequestMapping("/solr/products")
class GetSolrProduct {
    @Autowired
    SolrProductRepo productRepo

    @GetMapping
    List<SolrProduct> allUsers() {
        productRepo.findAll().asList()
    }

    @GetMapping("/_add")
    SolrProduct addNew() {
        SolrProduct solrProduct = new SolrProduct();
        solrProduct.id = UUID.randomUUID().toString()
        solrProduct.name = UUID.randomUUID().toString()
        productRepo.save solrProduct
    }
}