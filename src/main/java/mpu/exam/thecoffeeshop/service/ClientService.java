package mpu.exam.ShopCoffee.service;

import mpu.exam.ShopCoffee.model.ClientTable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientService {
    List<ClientTable> findAllClientTables();
    void saveClientTable(ClientTable clientTable);
    ClientTable findByID(int clientID);
    void updateClientTable(int clientID, ClientTable updatedClientTable);
    void deleteClientTable(int clientID);
}
