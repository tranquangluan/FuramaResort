package controllers;

import java.util.Scanner;

public class FuramaController {
    public void displayMainMenu() {
        boolean flag = true;
        do {
            System.out.println("Chức năng của hệ thống " +
                    "\n 1. Employee Management" +
                    "\n 2. Customer Management" +
                    "\n 3. Facility Management" +
                    "\n 4. Booking Management" +
                    "\n 5. Promotion Management" +
                    "\n 6. Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng:");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Quản lí employee");
                    managerEmployee();
                    break;
                case 2:
                    managerCustomer();
                    break;
                case 3:
                    managerFacility();
                    break;
                case 4:
                    managerBooking();
                    break;
                case 5:
                    managerPromotion();
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }

    public void managerEmployee() {
        boolean flag = true;
        do {
            System.out.println("Chức năng của hệ thống " +
                    "\n 1 Display list employees" +
                    "\n 2 Add new employee" +
                    "\n 3 Edit employee" +
                    "\n 4 Return main menu");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng:");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    displayMainMenu();
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }

    public void managerCustomer() {
        boolean flag = true;
        do {
            System.out.println("Chức năng của hệ thống " +
                    "\n 1. Display list customers" +
                    "\n 2. Add new customer" +
                    "\n 3. Edit customer" +
                    "\n 4. Return main menu");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    displayMainMenu();
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }

    public void managerFacility() {
        boolean flag = true;
        do {
            System.out.println("Chức năng của hệ thống " +
                    "\n 1 Display list facility" +
                    "\n 2 Add new facility" +
                    "\n 3 Display list facility maintenance" +
                    "\n 4 Return main menu");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    displayMainMenu();
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }

    public void managerBooking() {
        boolean flag = true;
        do {
            System.out.println("Chức năng của hệ thống " +
                    "\n 1. Add new booking" +
                    "\n 2. Display list booking" +
                    "\n 3. Create new constracts" +
                    "\n 4. Display list contracts" +
                    "\n 5. Edit contracts" +
                    "\n 6. Return main menu");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    displayMainMenu();
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }

    public void managerPromotion() {
        boolean flag = true;
        do {
            System.out.println("Chức năng của hệ thống " +
                    "\n 1. Display list customers use service" +
                    "\n 2. Display list customers get voucher" +
                    "\n 3. Return main menu");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    displayMainMenu();
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }
}
