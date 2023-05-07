package com.example.dividend.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/finances")
public class FinancesController {
    @GetMapping("/finances/dividend/{companyName}")
    public ResponseEntity<?> searchFinances(@PathVariable String companyName){
        return null;

    }

}
