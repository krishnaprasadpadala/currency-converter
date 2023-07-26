package com.currency.exchange.controller;

import com.currency.exchange.currencies.*;
import com.currency.exchange.dto.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class CurrencyConverterController {

    @GetMapping("/v1/convert/from/{from}/to/{to}")
    public ResponseEntity<ConversionResponseDto> convert(@PathVariable("from") Currency from, @PathVariable("to") Currency to,
                                                         @RequestParam("value") Float value) {
        ConversionResponseDto response = ConversionResponseDto.builder()
                .fromCurrency(from)
                .toCurrency(to)
                .fromValue(value)
                .convertedValue((value * 100))
                .build();
        return ResponseEntity.ok(response);
    }
}
