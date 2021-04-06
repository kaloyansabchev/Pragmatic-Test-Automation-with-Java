package users.implementations;

import database.DataBase;
import user.abstractions.AbstractUser;
import user.abstractions.AdminUser;
import user.abstractions.User;


public class AdminUserImpl extends AbstractUser implements AdminUser {
    private static final int ARRAY_LENGTH = 10;

    private final DataBase database = new DataBase(ARRAY_LENGTH);

    public AdminUserImpl(String userName) {
        super(userName, true);
        System.out.println("Admin user '" + userName + "' is created.");
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
        System.out.println("The name '" + userName + "' does not exist in the database, there is nothing to delete.");
    }


    @Override
    public User createUser(String userName, boolean isAdmin) {
        User[] allUsers = database.getDataBase();

        if (isAdmin) {
            AdminUser adminUser = null;

            //finding if that user already exists anywhere in the database, if it does no need to continue try adding it
            if (checkIfUserExists(userName)) {
                System.out.println("There is already a admin user registered with username: " + userName);
                return null;
            }

            //finding the first empty slot in the database to create a new user into it
            for (int i = 0; i < allUsers.length; i++) {
                if (allUsers[i] == null) {
                    adminUser = new AdminUserImpl(userName);
                    allUsers[i] = adminUser;
                    return adminUser;
                }
            }

            //returning null, because there are no empty slots, the database is full already
            System.out.println("Database is full no more place for users.\n");
            return null;
        } else {
            User normalUser = null;

            //finding if that user already exists anywhere in the database, if it does no need to continue try adding it
            if (checkIfUserExists(userName)) {
                System.out.println("There is already a user registered with username: " + userName);
                return null;
            }

            //finding the first empty slot in the database to create a new user into it
            for (int i = 0; i < allUsers.length; i++) {
                if (allUsers[i] == null) {
                    normalUser = new UserImpl(userName);
                    allUsers[i] = normalUser;
                    System.out.println("User '" + userName + "' is created.");
                    return normalUser;
                }
            }

            System.out.println("Database is full no more place for new users.\n");
            return null;
        }
    }


    @Override
    public void viewAllUsers() {
        User[] allUsers = database.getDataBase();

        for (int i = 0; i < allUsers.length; i++) {
            if (allUsers[i] != null) {
                System.out.println(allUsers[i].toString());
            }
        }
        System.out.println("");
    }


    //private method for re-usability to check if a user with specific name already exists
    private boolean checkIfUserExists(String userName) {
        User[] allUsers = database.getDataBase();

        for (int i = 0; i < allUsers.length; i++) {
            if (allUsers[i] != null) {
                if (allUsers[i].getUserName().equalsIgnoreCase(userName)) {
                    return true;
                }
            }
        }

        // there was no such user, we can continue with adding it
        return false;
    }
}
