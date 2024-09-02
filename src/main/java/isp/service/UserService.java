package isp.service;

import org.springframework.stereotype.Service;

@Service
public class UserService implements UserActions {
    @Override
    public void login() {
        System.out.println("User logged in.");
    }

    @Override
    public void viewProfile() {
        System.out.println("Viewing user profile.");
    }
}
