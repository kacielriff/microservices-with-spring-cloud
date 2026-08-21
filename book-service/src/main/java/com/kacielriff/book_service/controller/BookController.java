package com.kacielriff.book_service.controller;

import com.kacielriff.book_service.dto.BookResponseDTO;
import com.kacielriff.book_service.service.BookService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Tag(name = "Book Service")
@RestController
@RequestMapping("/book-service")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("/{id}/{currency}")
    @Operation(description = "Busca valor do livro")
    public ResponseEntity<BookResponseDTO> findBook(
            @PathVariable UUID id,
            @PathVariable String currency
    ) {
        return ResponseEntity.ok(bookService.findBook(id, currency));
    }
}
