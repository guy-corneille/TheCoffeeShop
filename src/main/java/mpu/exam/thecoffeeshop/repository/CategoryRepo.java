package mpu.exam.thecoffeeshop.repository;

import mpu.exam.thecoffeeshop.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category,Integer> {
}
