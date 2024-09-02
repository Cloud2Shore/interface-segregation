package isp.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class AdminServiceTest {

    private final AdminService adminService = new AdminService();

    @Test
    void shouldManageUsersWithoutExceptions() {
        assertDoesNotThrow(adminService::manageUsers);
    }

    @Test
    void shouldManageSettingsWithoutExceptions() {
        assertDoesNotThrow(adminService::manageSettings);
    }
}
