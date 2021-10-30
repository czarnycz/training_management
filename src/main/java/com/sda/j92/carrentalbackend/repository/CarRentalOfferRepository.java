package com.sda.j92.carrentalbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sda.j92.carrentalbackend.model.CarRentalOffer;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRentalOfferRepository extends JpaRepository<CarRentalOffer, Long> {
}
