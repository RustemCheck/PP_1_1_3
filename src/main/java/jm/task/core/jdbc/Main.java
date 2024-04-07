package jm.task.core.jdbc;



import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Rustem", "Integer", (byte) 26);
        userService.saveUser("Анна", "Double", (byte) 21);
        userService.removeUserById(1);
        userService.saveUser("Kostya", "Long", (byte) 23);
        userService.saveUser("Daniil", "Byte", (byte) 32);
        userService.saveUser("Sanya", "Boolean", (byte) 18);
        userService.saveUser("Ilfat", "Short", (byte) 34);
        userService.saveUser("Leha", "Megabyte", (byte) 43);
        userService.saveUser("Toha", "Spring", (byte) 21);
        userService.saveUser("Misha", "Static", (byte) 34);
        userService.saveUser("Vova", "Stream", (byte) 54);
        System.out.println("---------------------------------------------");
        for (User user : userService.getAllUsers()) {
            System.out.println(user);
        }

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
