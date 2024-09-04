import entities.Account;
import entities.AccountStorage;
import view.Menu1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        AccountStorage accountStorage = new AccountStorage(accounts);
        Menu1 menu1 = new Menu1();

        menu1.Menu1Display(accounts);

    }
}
