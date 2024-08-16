package basicauth.springsecuriytokenbased.dto;

public record AuthRequest(
        String username,
        String password
) {


}
