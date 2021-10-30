package com.sda.j92.carrentalbackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarRentalOffer {
    private Long id;
    private String make;
    private String model;
    private CarBodyType type;
    private double economy;
    private double price;
}
