package com.sda.j92.carrentalbackend.service;

import com.sda.j92.carrentalbackend.model.CarRentalOffer;
import com.sda.j92.carrentalbackend.repository.CarRentalOfferRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class CarRentalService {
    private final CarRentalOfferRepository carRentalOfferRepository;

    public List<CarRentalOffer> findAll(){
        List<CarRentalOffer> offers = carRentalOfferRepository.findAll();
        log.info("GetAll : " + offers);
        return offers;
    }

    public void add(CarRentalOffer offerToAdd){
        log.info("Add : " + offerToAdd);
        carRentalOfferRepository.save(offerToAdd);
    }

    public void delete(Long id){
        log.info("Remove : " + id);
        carRentalOfferRepository.deleteById(id);
    }
}
