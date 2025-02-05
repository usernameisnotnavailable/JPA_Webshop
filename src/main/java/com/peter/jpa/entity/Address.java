package com.peter.jpa.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Address {
    private int houseNumber;
    private String streetName;
    private int postCode;
    private String city;
    private String country;
}
