package com.kacielriff.book_service.service;

import com.kacielriff.book_service.domain.Book;
import com.kacielriff.book_service.dto.BookResponseDTO;
import com.kacielriff.book_service.dto.ExchangeDTO;
import com.kacielriff.book_service.environment.InstanceInformationService;
import com.kacielriff.book_service.exception.ResourceNotFoundException;
import com.kacielriff.book_service.proxy.ExchangeProxy;
import com.kacielriff.book_service.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    private final ExchangeProxy proxy;

    private final InstanceInformationService informationService;

    public BookResponseDTO findBook(UUID id, String currency) {
        Book book = this.getById(id);

        ExchangeDTO exchange = proxy.getExchange(
                book.getPrice(),
                "USD",
                currency
        ).getBody();

        return new BookResponseDTO(
                book.getBookId(),
                book.getAuthor(),
                book.getLaunchDate(),
                exchange.convertedValue(),
                book.getTitle(),
                "[FEIGN] PORT " + informationService.retrieveServerPort()
                        + " | [EXCHANGE] " + exchange.environment()
        );
    }

    private Book getById(UUID bookId) throws ResourceNotFoundException {
        return bookRepository.findById(bookId)
                .orElseThrow(() -> new ResourceNotFoundException("Book not found"));
    }
}
