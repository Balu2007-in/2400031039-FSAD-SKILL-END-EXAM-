package com.klef.fsad.exam.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
public class Shipment 
{
    @Id
    private Long shipmentId;   // Manual ID (NOT auto-generated)

    private String name;
    private LocalDate date;
    private String status;
    private String origin;
    private String destination;

    // Constructors
    public Shipment() {}

    public Shipment(Long shipmentId, String name, LocalDate date, String status, String origin, String destination) {
        this.shipmentId = shipmentId;
        this.name = name;
        this.date = date;
        this.status = status;
        this.origin = origin;
        this.destination = destination;
    }

    // Getters & Setters
    public Long getShipmentId() { return shipmentId; }
    public void setShipmentId(Long shipmentId) { this.shipmentId = shipmentId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getOrigin() { return origin; }
    public void setOrigin(String origin) { this.origin = origin; }

    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }
}