package dawissem.Spring_Boot_CRUD.repository;

import dawissem.Spring_Boot_CRUD.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
