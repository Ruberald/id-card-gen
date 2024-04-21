package views;

import controllers.UserController;

public class Main {
    public static void main(String[] args) {
        UserController userController = new UserController();
        userController.createUserFromCLI();
    }
}

