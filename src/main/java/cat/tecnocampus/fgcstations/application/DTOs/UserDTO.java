package cat.tecnocampus.fgcstations.application.DTOs;

import java.util.List;

public record UserDTO(String username, String name, String secondName, String email, List<FavoriteJourneyDTO> favoriteJourneyList) {
    public UserDTO {
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("Username cannot be null or blank");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }
        if (secondName == null || secondName.isBlank()) {
            throw new IllegalArgumentException("Second name cannot be null or blank");
        }
        if (email == null || email.isBlank() || !email.contains("@")) {
            throw new IllegalArgumentException("Email must be valid and cannot be null or blank");
        }
        if (favoriteJourneyList == null) {
            throw new IllegalArgumentException("Favorite journey list cannot be null");
        }
    }
}
