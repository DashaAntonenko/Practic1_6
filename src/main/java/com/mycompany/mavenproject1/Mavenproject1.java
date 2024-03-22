package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Mavenproject1 {

    public static void main(String[] args) {
        System.out.println("Практика1.8 Антоненко Дарья РИБО-04-22 Вариант2");
        List<Telephone> phoneList = new ArrayList<>();
        phoneList.add(new Telephone("OnePlus 12PRO", "F235255LOL", "white", false));
        phoneList.add(new Telephone("Samsung S5", "GGEZ2004Valorant", "green", true));
        phoneList.add(new Telephone("Iphone 15PROMAX", "O765TO777", "black", true));

        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        while (choice != 4) {
            System.out.println("Choose an option:");
            System.out.println("1. Add a telephone");
            System.out.println("2. Remove a telephone by serial number");
            System.out.println("3. Remove all telephones");
            System.out.println("4. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter model:");
                    String model = scanner.next();
                    System.out.println("Enter serial number:");
                    String serialNumber = scanner.next();
                    System.out.println("Enter color:");
                    String color = scanner.next();
                    System.out.println("Is it a mobile phone? (true/false)");
                    boolean isMobile = scanner.nextBoolean();

                    Telephone newPhone = new Telephone(model, serialNumber, color, isMobile);
                    if (phoneList.stream().anyMatch(phone -> phone.getSerialNumber().equals(serialNumber))) {
                        System.out.println("Phone with this serial number already exists");
                    } else {
                        phoneList.add(newPhone);
                        System.out.println("Phone successfully added");
                    }
                    break;
                case 2:
                    System.out.println("Enter the serial number of the phone to remove:");
                    String serialToRemove = scanner.next();
                    phoneList.removeIf(phone -> phone.getSerialNumber().equals(serialToRemove));
                    System.out.println("Phone removed");
                    break;
                case 3:
                    phoneList.clear();
                    System.out.println("All phones removed");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println("Current phone list:");
            phoneList.forEach(System.out::println);
        }
    }
}
