package dawissem.Spring_Boot_CRUD.service;

import dawissem.Spring_Boot_CRUD.entity.Product;
import dawissem.Spring_Boot_CRUD.repository.ProductRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Data
@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;
    public Product saveProduct(Product product){
        return repository.save(product);
    }


    public List<Product>  saveProducts(List<Product> products){
        return repository.saveAll(products);
    }


    public  List<Product> getProducts(){
        return repository.findAll();
    }


    public Product getProductById(int id){
        return repository.findById(id).orElse(null);
    }

    public Product getProductByNom(String nom){
        return repository.findByName(nom);
    }

    public String deleteProduct(int id){
        repository.deleteById(id);
        return "produit supprimé" +id ;
    }
    public Product updateProduct(Product product){
    Product existingProduct = repository.findById(product.getId()).orElse(null);

        assert existingProduct != null;
        existingProduct.setName(product.getName());
        existingProduct.setPrix(product.getPrix());
        existingProduct.setQuantite((product.getQuantite()));
        return repository.save(existingProduct);
    }




}
