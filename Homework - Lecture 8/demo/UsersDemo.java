package demo;

import user.abstractions.AdminUser;
import user.abstractions.User;
import users.implementations.AdminUserImpl;

public class UsersDemo {

    public static void main(String[] args) {
        AdminUser milen = new AdminUserImpl("milen");

        milen.createUser("gosho", true);
        milen.createUser("stoyan", false);
        milen.createUser("stoyan", false);
        milen.createUser("kaloyan", false);
        milen.createUser("kaloqn", false);
        milen.createUser("kaloqn", false);
        User ivan = milen.createUser("ivan", false);
        milen.createUser("stefan", false);
        milen.createUser("milena", false);
        milen.createUser("maria", false);
        milen.createUser("lora", false);
        milen.createUser("vasil", false);
        milen.createUser("vasileta", false);

        ivan.logout();
        milen.login();

        System.out.println();
        milen.viewAllUsers();

        milen.deleteUser("kaloyan");
        milen.deleteUser("miladin");

        milen.viewAllUsers();

    }
}
