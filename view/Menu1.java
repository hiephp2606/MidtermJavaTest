package view;

import entities.Account;
import entities.AccountStorage;
import service.AccountService;

import java.util.List;
import java.util.Scanner;

public class Menu1 {
    Scanner scanner = new Scanner(System.in);
    AccountService accountService = new AccountService();
    public void Menu1Display (List<Account> accounts) {
        System.out.println("=========TechMaster=========");
        System.out.println("1. Dang nhap");
        System.out.println("2. Dang ky");
        do {
            System.out.printf("Nhap lua chon: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    AccountStorage loginAccount = accountService.Login(scanner, accounts);
                    break;
                case 2:
                    AccountStorage registerAccount = accountService.RegisterAccount(scanner, accounts);
                    break;
            }
            System.out.println(accounts);
        }while (true);


    }
}
