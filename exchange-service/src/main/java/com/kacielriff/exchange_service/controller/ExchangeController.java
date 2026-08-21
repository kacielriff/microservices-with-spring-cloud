package com.kacielriff.exchange_service.controller;

import com.kacielriff.exchange_service.dto.ExchangeResponseDTO;
import com.kacielriff.exchange_service.service.ExchangeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@Tag(name = "Exchange Service")
@RestController
@RequestMapping("/exchange-service")
@RequiredArgsConstructor
public class ExchangeController {
    private final ExchangeService exchangeService;

    @GetMapping("/{amount}/{currencyFrom}/{currencyTo}")
    @Operation(description = "Realiza conversão")
    public ResponseEntity<ExchangeResponseDTO> getExchange(
            @PathVariable BigDecimal amount,
            @PathVariable String currencyFrom,
            @PathVariable String currencyTo
    ) {

        return ResponseEntity.ok(exchangeService.getExchange(amount, currencyFrom, currencyTo));
    }
}
