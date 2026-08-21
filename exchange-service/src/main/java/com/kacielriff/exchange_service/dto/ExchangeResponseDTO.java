package com.kacielriff.exchange_service.dto;

import java.math.BigDecimal;

public record ExchangeResponseDTO(

        String from,

        String to,

        BigDecimal conversionFactor,

        BigDecimal convertedValue,

        String environment
) {
}
