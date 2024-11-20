package tech.lastbox.dtos;

import java.time.LocalDateTime;

public record BookDTO(
        long id,
        String name,
        String author,
        boolean isAvailable,
        LocalDateTime updatedAt)
{}
