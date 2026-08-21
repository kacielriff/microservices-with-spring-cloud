package com.kacielriff.book_service.repository;

import com.kacielriff.book_service.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookRepository extends JpaRepository<Book, UUID> {
}
