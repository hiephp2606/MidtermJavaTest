package service;

import entities.Account;

import java.util.Scanner;

public class RegisterService {
    public Account register (Scanner sc) {
        System.out.printf("Username: ");
        String username = sc.nextLine();
        System.out.printf("Password: ");
        String password = sc.nextLine();
        System.out.printf("Email: ");
        String email = sc.nextLine();

        return new Account(username, password, email);
    }
}
