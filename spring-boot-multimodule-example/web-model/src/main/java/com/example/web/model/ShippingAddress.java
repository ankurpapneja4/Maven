package com.example.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor @Builder
public class ShippingAddress {

    private String postOfficeBox;
    private String extendedAddress;
    private String streetAddress;
    private String locality;
    private String region;
    private String postalCode;
    private String countryName;

}
