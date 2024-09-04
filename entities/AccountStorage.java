package entities;

import java.util.List;

public class AccountStorage {
    private List<Account> accounts;

    public AccountStorage(List<Account> accounts) {
        this.accounts = accounts;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "AccountStorage{" +
                "accounts=" + accounts +
                '}';
    }
}
