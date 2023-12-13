package mpu.exam.thecoffeeshop.controller;

import mpu.exam.thecoffeeshop.model.ClientTable;
import mpu.exam.thecoffeeshop.service.ClientTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/clientTable")
public class ClientTableController {
    private final ClientTableService clientTableService;
    @Autowired
    public ClientTableController(ClientTableService clientTableService) {
        this.clientTableService = clientTableService;
    }
    @GetMapping("/clientList")
    public ResponseEntity<List<ClientTable>> getClientTables(){

    return clientTableService.getClientTables();
    }
    @PostMapping("/add")
    public ResponseEntity<String> addTable(@RequestBody ClientTable clientTable){

       return clientTableService.addNewClientTable(clientTable);
    }
    //forms
    @GetMapping("/add")
    public String showAddForm(Model model) {
        ClientTable clientTable = new ClientTable();
        model.addAttribute("clientTable", clientTable);
        return "clientForm";
    }
    @PutMapping(path = "/update")
    public ResponseEntity<String> updateClientTable(@RequestBody ClientTable clientTable) {
        return clientTableService.updateClientTable(clientTable);

    }
    //forms
    @GetMapping(path = "/update/{clientId}")
    public String showUpdateForm(@PathVariable int clientId, Model model) {
        ResponseEntity<ClientTable> response = clientTableService.getClientTableById(clientId);

        if (response.getStatusCode() == HttpStatus.OK) {
            model.addAttribute("clientTable", response.getBody());
            return "updateClientForm"; // Assuming you have an "updateClientForm.html" Thymeleaf template
        } else {
            return "error";
        }
    }
/*    @DeleteMapping("/delete/{clientId}")
    public ResponseEntity<String> deleteClientTable(@PathVariable int clientId) {
        return clientTableService.deleteClientTable(clientId);
    }
}*/

}





