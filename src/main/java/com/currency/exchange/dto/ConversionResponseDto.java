package com.currency.exchange.dto;


import com.currency.exchange.currencies.*;
import lombok.*;

@Data
@Builder
public class ConversionResponseDto {
    
    private Currency fromCurrency;
    private Currency toCurrency;
    private Float fromValue;
    private Float convertedValue;
}
