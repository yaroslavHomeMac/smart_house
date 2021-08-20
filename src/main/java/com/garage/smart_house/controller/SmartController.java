package com.garage.smart_house.controller;

import com.garage.smart_house.dto.HumidityDto;
import org.springframework.web.bind.annotation.*;

/**
 * @author Vladyka Stanislau
 * @since 13.08.2021
 */
@RestController
@RequestMapping("/api")
public class SmartController {
    @PostMapping("/sensors/humidity")
    public void postPlain(@RequestBody HumidityDto body) {
        System.out.println(body);
    }

    @GetMapping("/test")
    public String test() {
        return "Hi";
    }

}
