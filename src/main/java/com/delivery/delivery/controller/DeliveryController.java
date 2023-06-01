package com.delivery.delivery.controller;

import com.delivery.delivery.exception.ModelNotFoundException;
import com.delivery.delivery.model.Delivery;
import com.delivery.delivery.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/delivery")
@CrossOrigin("*")
public class DeliveryController {

    @Autowired
    DeliveryService deliveryService;

    @PostMapping("/save")
    public long save(@RequestBody Delivery client){
        deliveryService.save(client);
        return client.getIdDelivery();
    }

    @GetMapping("/listAll")
    public Iterable<Delivery> listAllPersons(){return deliveryService.list();}

    @GetMapping("/list/{id}")
    public Delivery listPersonById(@PathVariable("id") int id){
        Optional<Delivery> delivery = deliveryService.listId(id);
        if(delivery.isPresent()){
            return delivery.get();
        }

        throw new ModelNotFoundException("Id de persona invalido");
    }


}
