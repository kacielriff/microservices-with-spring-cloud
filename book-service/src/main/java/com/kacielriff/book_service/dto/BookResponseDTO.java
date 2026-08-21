package com.kacielriff.book_service.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public record BookResponseDTO(

        UUID bookId,

        String author,

        LocalDateTime launchDate,

        BigDecimal convertedValue,

        String title,

        String environment
) {
}
