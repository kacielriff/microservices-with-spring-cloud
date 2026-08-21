package com.kacielriff.exchange_service.service;

import com.kacielriff.exchange_service.domain.Exchange;
import com.kacielriff.exchange_service.dto.ExchangeResponseDTO;
import com.kacielriff.exchange_service.environment.InstanceInformationService;
import com.kacielriff.exchange_service.exception.CurrencyUnsupportedException;
import com.kacielriff.exchange_service.repository.ExchangeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class ExchangeService {

    private final ExchangeRepository exchangeRepository;

    private final InstanceInformationService informationService;

    public ExchangeResponseDTO getExchange(BigDecimal amount, String from, String to) {
        Exchange exchange =
                exchangeRepository.findByFromAndTo(from, to)
                        .orElseThrow(() -> new CurrencyUnsupportedException("Currency Unsupported"));

        return new ExchangeResponseDTO(
                exchange.getFrom(),
                exchange.getTo(),
                exchange.getConversionFactor(),
                amount.multiply(exchange.getConversionFactor()),
                "PORT " + informationService.retrieveServerPort()
        );
    }
}
