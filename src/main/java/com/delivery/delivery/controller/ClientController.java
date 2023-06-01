package com.delivery.delivery.controller;



import com.delivery.delivery.exception.ModelNotFoundException;
import com.delivery.delivery.model.Client;
import com.delivery.delivery.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

        import java.util.Optional;

@RestController
@RequestMapping("/client")
@CrossOrigin("*")
public class ClientController {

    @Autowired
    ClientService clientService;

    @PostMapping("/save")
    public long save(@RequestBody Client client){
        clientService.save(client);
        return client.getIdClient();
    }

    @GetMapping("/listAll")
    public Iterable<Client> listAllPersons(){return clientService.list();}

    @GetMapping("/list/{id}")
    public Client listPersonById(@PathVariable("id") int id){
        Optional<Client> client = clientService.listId(id);
        if(client.isPresent()){
            return client.get();
        }

        throw new ModelNotFoundException("Id de persona invalido");
    }




}