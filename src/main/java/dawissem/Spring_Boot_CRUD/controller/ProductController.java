package dawissem.Spring_Boot_CRUD.controller;


import dawissem.Spring_Boot_CRUD.entity.Product;
import dawissem.Spring_Boot_CRUD.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired

    private ProductService service;

    @PostMapping("/addproduct")
    public Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    @PostMapping("/addproducts")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return service.saveProducts(products);
    }
    @GetMapping("/products")

    public List<Product> findAllProducts() {
        return service.getProducts();
    }
@GetMapping("/productById/{id}")
    public Product findProductById(@PathVariable int id) {
        return service.getProductById(id);

    }
    @GetMapping("/product/{name}")

    public Product findProductByName(@PathVariable String name) {
        return service.getProductByNom(name);
    }


   @PostMapping("/updateproduct")
    public Product updateProduct(@RequestBody Product product) {
        return service.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }


}
