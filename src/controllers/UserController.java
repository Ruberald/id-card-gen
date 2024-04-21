package controllers;

import java.util.ArrayList;
import java.util.List;
import models.User;

import java.util.Scanner;

public class UserController {
    private List<User> users;

    public UserController() {
        this.users = new ArrayList<>();
    }

    public void createUser(String name, String email, String idNumber) {
        User newUser = new User(name, email, idNumber);
        users.add(newUser);
        System.out.println("User created successfully:");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("ID Number: " + idNumber);
    }

    public void createUserFromCLI() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter user details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("ID Number: ");
        String idNumber = scanner.nextLine();

        scanner.close();

        createUser(name, email, idNumber);

        // Call IDCardController to generate ID card
        IDCardController idCardController = new IDCardController();
        idCardController.generateIDCard(users.get(users.size() - 1));
    }
    // Additional methods can be added for managing users, such as retrieving, updating, or deleting users
}

