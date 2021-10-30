package com.sda.j92.carrentalbackend.controller;

import com.sda.j92.carrentalbackend.model.CarRentalOffer;
import com.sda.j92.carrentalbackend.service.CarRentalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://*", maxAge = 3600)
@RestController
@RequestMapping("/offers")
@RequiredArgsConstructor
public class CarRentalController {
    private final CarRentalService carRentalService;

    @GetMapping("")
    public List<CarRentalOffer> get(){
        return carRentalService.findAll();
    }

    @PostMapping("")
    public void add(CarRentalOffer offer){
        carRentalService.add(offer);
    }

    @DeleteMapping("/{id}")
    public void add(@PathVariable Long id){
        carRentalService.delete(id);
    }

}
