package com.delivery.delivery.dao;

import com.delivery.delivery.model.Delivery;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDeliveryDAO extends CrudRepository<Delivery,Long> {
}