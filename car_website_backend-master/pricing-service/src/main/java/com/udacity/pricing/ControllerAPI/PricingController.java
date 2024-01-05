package com.udacity.pricing.ControllerAPI;

import com.udacity.pricing.Service.PricingService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/services/price")
public class PricingController {

    /**
     * Gets the price for a requested vehicle.
     * @return price of the vehicle, or error that it was not found.
     */

    @GetMapping
    public Price get(@RequestParam Long vehicleID)
    {
        try {
            return PricingService.getPrice(vehicleID);
        }
        catch (PriceException ex) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND,"Price Unavailable", ex);
            )
        }
    }
}
