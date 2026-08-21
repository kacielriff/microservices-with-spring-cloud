package com.kacielriff.exchange_service.domain;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "exchanges")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "exchangeId")
public class Exchange implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID exchangeId;

    @Column(name = "currency_from", nullable = false)
    private String from;

    @Column(name = "currency_to", nullable = false)
    private String to;

    @Column(nullable = false, precision = 19, scale = 6)
    private BigDecimal conversionFactor;
}
