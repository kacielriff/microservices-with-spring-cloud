package com.kacielriff.book_service.exception;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Schema(name = "ApiError", description = "Standard error response returned by the API")
public class ApiError {

    @Schema(
            description = "Timestamp when the error occurred (UTC)",
            example = "2026-06-20T12:00:00Z"
    )
    private final LocalDateTime timestamp;

    @Schema(
            description = "HTTP status code",
            example = "400"
    )
    private final int status;

    @Schema(
            description = "Error message describing what went wrong",
            example = "Invalid request payload"
    )
    private final String message;

    public ApiError(int status, String message) {
        this.timestamp = LocalDateTime.now();
        this.status = status;
        this.message = message;
    }

}