package service;

import entities.Account;

import java.util.Scanner;

public class LoginService {
    public Account login (Scanner sc) {
        System.out.printf("Username: ");
        String username = sc.nextLine();
        System.out.printf("Password: ");
        String password = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();

        return new Account(username, password, email);
    }
}
