package mpu.exam.thecoffeeshop.repository;

import mpu.exam.thecoffeeshop.model.ClientTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientTableRepo extends JpaRepository<ClientTable,Integer> {
}
