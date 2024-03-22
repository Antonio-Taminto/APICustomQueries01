package com.APICustomQueries01.controllers;

import com.APICustomQueries01.entities.Flight;
import com.APICustomQueries01.servicies.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
    @Autowired
    private FlightService service;
    @PostMapping("/create50")
    public ResponseEntity<List<Flight>> post50Flights(){
        return ResponseEntity.ok().body(service.save50Flights());
    }
    @GetMapping("/getall")
    public ResponseEntity<List<Flight>> getAllFlights(){
        return ResponseEntity.ok().body(service.getAllFlights());
    }

}
