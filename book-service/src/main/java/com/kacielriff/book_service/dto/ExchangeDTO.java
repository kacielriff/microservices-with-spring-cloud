package com.kacielriff.book_service.dto;

import java.math.BigDecimal;

public record ExchangeDTO(

        String from,

        String to,

        BigDecimal conversionFactor,

        BigDecimal convertedValue,

        String environment
) {
}
