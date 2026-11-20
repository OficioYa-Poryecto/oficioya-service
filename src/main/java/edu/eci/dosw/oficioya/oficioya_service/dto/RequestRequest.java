package edu.eci.dosw.oficioya.oficioya_service.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import edu.eci.dosw.oficioya.oficioya_service.model.document.ImageDocument;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record RequestRequest (
    @NotEmpty List<UUID> workersId, 
    @NotBlank String description,
    @NotBlank String neighborhood,
    @NotBlank String exactAddress,
    @NotNull LocalDateTime scheduledDateTime,
    List<ImageDocument> images
    ){
    
}