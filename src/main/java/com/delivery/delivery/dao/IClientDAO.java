package com.delivery.delivery.dao;


import com.delivery.delivery.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClientDAO extends CrudRepository<Client,Long> {
}