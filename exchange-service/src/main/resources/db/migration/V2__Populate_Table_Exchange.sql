INSERT INTO exchanges (
    exchange_id,
    currency_from,
    currency_to,
    conversion_factor
) VALUES

(gen_random_uuid(), 'USD', 'BRL', 5.420000),
(gen_random_uuid(), 'USD', 'EUR', 0.920000),
(gen_random_uuid(), 'USD', 'GBP', 0.780000),
(gen_random_uuid(), 'USD', 'CNY', 7.150000),
(gen_random_uuid(), 'USD', 'JPY', 149.500000),

(gen_random_uuid(), 'BRL', 'USD', 0.184500),
(gen_random_uuid(), 'BRL', 'EUR', 0.170000),
(gen_random_uuid(), 'BRL', 'GBP', 0.144000),
(gen_random_uuid(), 'BRL', 'CNY', 1.320000),
(gen_random_uuid(), 'BRL', 'JPY', 27.600000),

(gen_random_uuid(), 'EUR', 'USD', 1.087000),
(gen_random_uuid(), 'EUR', 'BRL', 5.890000),
(gen_random_uuid(), 'EUR', 'GBP', 0.850000),
(gen_random_uuid(), 'EUR', 'CNY', 7.770000),
(gen_random_uuid(), 'EUR', 'JPY', 162.500000),

(gen_random_uuid(), 'GBP', 'USD', 1.280000),
(gen_random_uuid(), 'GBP', 'BRL', 6.950000),
(gen_random_uuid(), 'GBP', 'EUR', 1.180000),
(gen_random_uuid(), 'GBP', 'CNY', 9.150000),
(gen_random_uuid(), 'GBP', 'JPY', 191.200000),

(gen_random_uuid(), 'CNY', 'USD', 0.140000),
(gen_random_uuid(), 'CNY', 'BRL', 0.760000),
(gen_random_uuid(), 'CNY', 'EUR', 0.129000),
(gen_random_uuid(), 'CNY', 'GBP', 0.109000),
(gen_random_uuid(), 'CNY', 'JPY', 20.900000),

(gen_random_uuid(), 'JPY', 'USD', 0.006700),
(gen_random_uuid(), 'JPY', 'BRL', 0.036200),
(gen_random_uuid(), 'JPY', 'EUR', 0.006150),
(gen_random_uuid(), 'JPY', 'GBP', 0.005230),
(gen_random_uuid(), 'JPY', 'CNY', 0.047800);