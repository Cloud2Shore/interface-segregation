package isp.service;

import org.springframework.stereotype.Service;

@Service
public class AdminService implements AdminActions {
    @Override
    public void manageUsers() {
        System.out.println("Managing users.");
    }

    @Override
    public void manageSettings() {
        System.out.println("Managing settings.");
    }
}
