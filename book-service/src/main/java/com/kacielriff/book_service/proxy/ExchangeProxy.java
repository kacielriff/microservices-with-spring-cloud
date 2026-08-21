package com.kacielriff.book_service.proxy;

import com.kacielriff.book_service.dto.ExchangeDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.math.BigDecimal;

@FeignClient(name = "exchange-service")
public interface ExchangeProxy {

    @GetMapping("/exchange-service/{amount}/{currencyFrom}/{currencyTo}")
    public ResponseEntity<ExchangeDTO> getExchange(
            @PathVariable BigDecimal amount,
            @PathVariable String currencyFrom,
            @PathVariable String currencyTo
    );
}
