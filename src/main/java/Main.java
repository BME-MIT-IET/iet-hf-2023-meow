package main.java;

import main.java.view.WelcomeForm;

public class Main {

    /**
     * This is the main method. It is the entry point of the program. It is the first method called when the program
     * is run. It handles the test selection and the test execution. First all the test classes are loaded using the
     * class loader. Then the user is asked to select a test to run. The test is then executed. This is done until the
     * user enters "-1" as the test id, which is the exit command.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WelcomeForm welcomeForm = new WelcomeForm();
        welcomeForm.setVisible(true);
    }
}
