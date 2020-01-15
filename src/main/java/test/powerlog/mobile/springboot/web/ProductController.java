package test.powerlog.mobile.springboot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import test.powerlog.mobile.springboot.domain.posts.Product;
import test.powerlog.mobile.springboot.domain.posts.ProductRepository;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/hello2")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/create")
    public void create(Product product) {
        productRepository.save(product);
    }

    @GetMapping("/readOne")
    public Optional readOne(String id) {
        return productRepository.findById(id);
    }

    @GetMapping("/readAll")
    public List readAll() {
        return productRepository.findAll();
    }

    @GetMapping("/update")
    public void update(Product product, String id) {
        productRepository.update(product, id);
    }

    @GetMapping("/delete")
    public void delete(String id) {
        productRepository.deleteById(id);
    }
}
