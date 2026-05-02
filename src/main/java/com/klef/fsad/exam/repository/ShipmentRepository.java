package com.klef.fsad.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klef.fsad.exam.model.Shipment;

public interface ShipmentRepository extends JpaRepository<Shipment, Long> 
{
}