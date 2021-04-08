package users.implementations;

import database.DataBase;
import user.abstractions.AbstractUser;
import user.abstractions.AdminUser;
import user.abstractions.User;


public class AdminUserImpl extends AbstractUser implements AdminUser {
//    private static final int ARRAY_LENGTH = 10;

    private final DataBase database = new DataBase(10);

    public AdminUserImpl(String userName) {
        super(userName, true);
        System.out.println("Admin user '" + userName + "' is created.");
    }

    @Override
    public User createUser(String userName, boolean isAdmin) {
        User[] allUsers = database.getDataBase();

        if (isAdmin) {
            AdminUser adminUser = null;
            if (checkIfUserExists(userName)) {
                System.out.println("There is already a admin user registered with username: " + userName);
                return null;
            }

            for (int i = 0; i < allUsers.length; i++) {
                if (allUsers[i] == null) {
                    adminUser = new AdminUserImpl(userName);
                    allUsers[i] = adminUser;
                    return adminUser;
                }
            }

            System.out.println("!DATABASE IS FULL - no more free places for users!\n");
            return null;
        } else {
            User normalUser = null;

            if (checkIfUserExists(userName)) {
                System.out.println("There is already a user registered with username: " + userName);
                return null;
            }

            for (int i = 0; i < allUsers.length; i++) {
                if (allUsers[i] == null) {
                    normalUser = new UserImpl(userName);
                    allUsers[i] = normalUser;
                    System.out.println("User '" + userName + "' is created.");
                    return normalUser;
                }
            }

            System.out.println("!DATABASE IS FULL - no more free places for users!\n");
            return null;
        }
    }

    @Override
    public void deleteUser(String userName) {

        User[] allUsers = database.getDataBase();

        for (int i = 0; i < allUsers.length; i++) {
            if (allUsers[i] != null) {
                if (allUsers[i].getUserName().equalsIgnoreCase(userName)) {
                    allUsers[i] = null;
                    System.out.println("The user '" + userName + "' is deleted from the database.");
                    return;
                }
            }
        }
        System.out.println("The user '" + userName + "' does not exist in the database, there is nothing to delete.");
    }


    @Override
    public void viewAllUsers() {
        User[] allUsers = database.getDataBase();
        System.out.println("--------------- ALl USERS ---------------");
        for (int i = 0; i < allUsers.length; i++) {
            if (allUsers[i] != null) {
                System.out.println(allUsers[i].toString());
            }
        }

    }

    private boolean checkIfUserExists(String userName) {
        User[] allUsers = database.getDataBase();

        for (int i = 0; i < allUsers.length; i++) {
            if (allUsers[i] != null) {
                if (allUsers[i].getUserName().equalsIgnoreCase(userName)) {
                    return true;
                }
            }
        }


        return false;
    }
}
