package com.personalapps.ecommerce.RestAPI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ecommerce")
public class EcommerceRestAPI {

    @RequestMapping(path = "/healthcheck", method= RequestMethod.GET)
    private ResponseEntity testAPI(){
        return ResponseEntity.ok().body("App is working!");
    }
}
