package service;


import entities.Account;
import entities.AccountStorage;

import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.Scanner;

public class AccountService {
    RegisterService registerService = new RegisterService();
    LoginService loginService = new LoginService();

    public AccountStorage RegisterAccount (Scanner scanner, List<Account> accounts) {
        Account registedAccount = registerService.register(scanner);
        int size = accounts.size();
        for (int i = 0; i < size; i++) {
            if (registedAccount.getUserName().equals(accounts.get(i).getUserName()) && registedAccount.getEmail().equals(accounts.get(i).getEmail()) ) {
                System.out.println("Username nay da ton tai, xin vui long nhap Username khac!");
                break;
            }
            else if (registedAccount.getUserName().equals(accounts.get(i).getUserName()) ) {
                System.out.println("Username nay da ton tai, xin vui long nhap Username khac!");
                break;
            }
            else if (registedAccount.getEmail().equals(accounts.get(i).getEmail())) {
                System.out.println("Email nay da duoc su dung, xin vui long nhap Email khac: ");
                break;
            }
            else if (i == size -1) {
                System.out.println("Tao tai khoan thanh cong!");
            }
        }

        return new AccountStorage(accounts);
    }

    public AccountStorage Login (Scanner scanner, List<Account> accounts) {
        Account loginAccount = loginService.login(scanner);
        int size = accounts.size();
        for (int i = 0; i < size; i++) {
            if (loginAccount.getPassword().equals(accounts.get(i).getPassword()) && loginAccount.getUserName().equals(accounts.get(i).getUserName())) {
                System.out.println("Dang nhap thanh cong!");
            }
            else if (loginAccount.getUserName().equals(accounts.get(i).getUserName())) {
                System.out.println("Password sai!");
            }
            else if (i == size -1) {
                System.out.println("Usernam khong ton tai!");
            }
        }

        return new AccountStorage(accounts);

    }
}
