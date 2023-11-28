package com.example.web.controller;

import com.example.web.model.ShippingAddress;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/")
    public ResponseEntity<ShippingAddress> getShippingAddress(){
        return ResponseEntity.ok( ShippingAddress.builder().build() );
    }
}
