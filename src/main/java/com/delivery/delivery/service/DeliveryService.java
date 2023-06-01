package com.delivery.delivery.service;

import com.delivery.delivery.dao.IDeliveryDAO;
import com.delivery.delivery.model.Delivery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class DeliveryService {

    @Autowired
    private IDeliveryDAO dao;

    public Delivery save(Delivery p) {return dao.save(p);}
    public Delivery update(Delivery p) {return dao.save(p);}
    public void delete(Delivery p) {dao.delete(p);}
    public Iterable<Delivery> list(){return dao.findAll();}
    public Optional<Delivery> listId(long id){return dao.findById(id);}


}