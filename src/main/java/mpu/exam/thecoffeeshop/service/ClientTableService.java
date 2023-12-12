package mpu.exam.ShopCoffee.service;

import mpu.exam.ShopCoffee.model.ClientTable;
import mpu.exam.ShopCoffee.repository.ClientTableRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientTableService {
    private ClientTableRepo clientTableRepo;
@Autowired
    public ClientTableService(ClientTableRepo clientTableRepo) {
        this.clientTableRepo = clientTableRepo;
    }

    public ResponseEntity<List<ClientTable>>  getClientTables(){
    try {
        return new ResponseEntity<>(clientTableRepo.findAll(), HttpStatus.OK);

    }catch (Exception ex){
        ex.printStackTrace();
    }
        return new ResponseEntity<>(clientTableRepo.findAll(), HttpStatus.BAD_REQUEST );
    }


    public ResponseEntity<String> addNewClientTable(ClientTable clientTable) {

    try {
        clientTableRepo.save(clientTable);
        return new ResponseEntity<>("success", HttpStatus.CREATED);

    }catch (Exception e){

    }
        return new ResponseEntity<>("Failed", HttpStatus.BAD_REQUEST);
    }
    public ResponseEntity<String> updateClientTable(ClientTable clientTable) {
        try {
            if (clientTableRepo.existsById(clientTable.getClient_id())) {
                clientTableRepo.save(clientTable);
                return new ResponseEntity<>("Success", HttpStatus.OK);
            } else {
                return new ResponseEntity<>("ClientTable not found", HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>("Failed to update", HttpStatus.BAD_REQUEST);
        }
    }
    public ResponseEntity<ClientTable> getClientTableById(int clientId) {
        try {
            Optional<ClientTable> clientTableOptional = clientTableRepo.findById(clientId);
            return clientTableOptional.map(clientTable -> new ResponseEntity<>(clientTable, HttpStatus.OK))
                    .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
