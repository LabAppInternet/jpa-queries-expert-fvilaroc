package cat.tecnocampus.fgcstations.application.DTOs;

public record JourneyDTO(String origin, String destination) {
    public JourneyDTO {
        if (origin == null || origin.isBlank()) {
            throw new IllegalArgumentException("Origin cannot be null or blank");
        }
        if (destination == null || destination.isBlank()) {
            throw new IllegalArgumentException("Destination cannot be null or blank");
        }
    }
}
