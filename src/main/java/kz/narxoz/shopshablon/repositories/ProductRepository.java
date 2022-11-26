package kz.narxoz.shopshablon.repositories;

import kz.narxoz.shopshablon.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    List<Product> findByTitle(String title);
}
