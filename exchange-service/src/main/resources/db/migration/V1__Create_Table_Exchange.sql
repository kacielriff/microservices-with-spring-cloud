CREATE EXTENSION IF NOT EXISTS pgcrypto;

CREATE TABLE exchanges (
    exchange_id UUID PRIMARY KEY,

    currency_from VARCHAR(255) NOT NULL,
    currency_to VARCHAR(255) NOT NULL,

    conversion_factor NUMERIC(19,6) NOT NULL
);