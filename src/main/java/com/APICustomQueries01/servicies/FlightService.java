package com.APICustomQueries01.servicies;

import com.APICustomQueries01.entities.Flight;
import com.APICustomQueries01.entities.StatusEnum;
import com.APICustomQueries01.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

@Service
public class FlightService {
    @Autowired
    private FlightRepository repo;

    public Flight createFlight(){
        Random random = new Random();
        Flight flight = new Flight();
        flight.setDescription("description");
        flight.setFromAirport("from airport" + random.nextInt(100));
        flight.setToAirport("to airport" + random.nextInt(100));
        flight.setStatus(StatusEnum.ONTIME);
        return flight;
    }
    public List<Flight> save50Flights(){
        ArrayList<Flight> flightList = new ArrayList<>();
        IntStream.range(0, 50).forEach(i -> flightList.add(createFlight()));
        return repo.saveAll(flightList);
    }
    public List<Flight> getAllFlights(){
        return repo.findAll();
    }
}
