package com.kacielriff.exchange_service.repository;

import com.kacielriff.exchange_service.domain.Exchange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ExchangeRepository extends JpaRepository<Exchange, UUID> {

    Optional<Exchange> findByFromAndTo(String from, String to);
}
