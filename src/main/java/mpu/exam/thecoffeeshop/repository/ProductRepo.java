package mpu.exam.thecoffeeshop.repository;

import mpu.exam.thecoffeeshop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Long> {
    List<Product> findAllByCategory_id(int id);
}
