package guru.springframework.springboot.controllers;

import guru.springframework.model.ShippingAddress;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MinRestController {
    @RequestMapping("/")
    public ShippingAddress getShipingAddress(){
        ShippingAddress adr = new ShippingAddress();
        adr.setCountryName("Norway");
        adr.setStreetAddress("Gjettumkollen 16 E");
        adr.setPostalCode("1346");
        adr.setLocality("Gjettum");

        return adr;
    }
}
