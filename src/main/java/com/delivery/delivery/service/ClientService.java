package com.delivery.delivery.service;



import com.delivery.delivery.dao.IClientDAO;
import com.delivery.delivery.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private IClientDAO dao;

    public Client save(Client p) {return dao.save(p);}
    public Client update(Client p) {return dao.save(p);}
    public void delete(Client p) {dao.delete(p);}
    public Iterable<Client> list(){return dao.findAll();}
    public Optional<Client> listId(long id){return dao.findById(id);}


}
