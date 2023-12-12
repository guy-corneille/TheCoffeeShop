package mpu.exam.ShopCoffee.repository;

import mpu.exam.ShopCoffee.model.ClientTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientTableRepo extends JpaRepository<ClientTable,Integer> {
}
