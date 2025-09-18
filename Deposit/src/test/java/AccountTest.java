import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account account;
//  Tests by Patrik Granström
    @Test
    void testDeposit() {
        Account account = new Account();
        account.deposit(100);
        assertEquals(100, account.getBalance());
        account.deposit(200);
        assertEquals(300, account.getBalance());
    }

    @Test
    void testWithdraw() {
        Account account = new Account();
        account.withdraw(100.1);
        assertEquals(0, account.getBalance());
        account.deposit(200);
        account.withdraw(100.1);
        assertEquals(99.9, account.getBalance());
    }

    @Test
    void testGetBalance() {
        Account account = new Account();
        assertEquals(0, account.getBalance());
    }
}