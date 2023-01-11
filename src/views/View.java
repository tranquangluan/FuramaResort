package views;

import controllers.FuramaController;
import models.person.Employee;
import models.person.Enum;
import models.person.Person;

public class View {
    public static void main(String[] args) {
        FuramaController furamaController = new FuramaController();
        furamaController.displayMainMenu();
    }
}
