package com.klef.fsad.exam.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.klef.fsad.exam.model.Shipment;
import com.klef.fsad.exam.repository.ShipmentRepository;

@Service
public class ShipmentService 
{
    @Autowired
    private ShipmentRepository repository;

    // POST → Add Shipment
    public Shipment addShipment(Shipment shipment) {
        if (shipment.getShipmentId() == null) {
            throw new RuntimeException("Shipment ID must not be null");
        }
        return repository.save(shipment);
    }

    // PUT → Update Shipment
    public Shipment updateShipment(Long id, Shipment updatedShipment) {
        Optional<Shipment> optional = repository.findById(id);

        if (optional.isPresent()) {
            Shipment shipment = optional.get();
            shipment.setName(updatedShipment.getName());
            shipment.setDate(updatedShipment.getDate());
            shipment.setStatus(updatedShipment.getStatus());
            shipment.setOrigin(updatedShipment.getOrigin());
            shipment.setDestination(updatedShipment.getDestination());
            return repository.save(shipment);
        } else {
            throw new RuntimeException("Shipment not found");
        }
    }
}