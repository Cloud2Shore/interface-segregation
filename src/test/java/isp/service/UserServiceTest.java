package isp.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class UserServiceTest {

    private final UserService userService = new UserService();

    @Test
    void shouldLoginWithoutExceptions() {
        assertDoesNotThrow(userService::login);
    }

    @Test
    void shouldViewProfileWithoutExceptions() {
        assertDoesNotThrow(userService::viewProfile);
    }
}
