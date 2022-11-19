package AccountOperations;

import Adresses.Address;
import Adresses.HomeAddress;
import UserOperations.User;
import exception.InvalidAuthenticationException;

import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;
import java.util.TreeSet;

public class AccountManager {

    TreeSet<Account> users = new TreeSet<>();

    public void addUsers() throws ClassCastException {
        Address address = new HomeAddress("Yozgat", "Merkez", "Selami Sokak", "Cami karşısı.");
        User user1 = new User("Ahmet", "Mehmet", "ahmet@gmail.com", "123", "Dev", 25, address, "Individual");
        Account account = new Individual(user1);

        Address address2 = new HomeAddress("Burdur", "Merkez", "Elami Sokak", "Caminin arka tarafı.");
        User user2 = new User("Mehmet", "Ahmet", "mehmet@gmail.com", "123", "Mit", 43, address2, "Enterprise");
        Account account2 = new Enterprise(user2);
        users.add(account);
        users.add(account2);
    }

    public Account login(String email, String password) {
        addUsers();
        try {
            for (Account acc : users) {
                if (acc.getUser().getEmail().equals(email) && acc.getUser().getPassword().equals(password)) {
                    acc.login(email, password, acc);
                    return acc;
                }
            }
            throw new InvalidAuthenticationException("Şifre veya email yanlış girildi!");

        } catch (InvalidAuthenticationException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}
