package kedaiseblak;

import java.util.Scanner;

import menu.*;

public class SeblakStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuStore;

        while (true) {
            System.out.println("====================================");
            System.out.println("          Seblak Store Menu         ");
            System.out.println("====================================");
            System.out.println("1. Add Spicy Seblak");
            System.out.println("2. Add Cheese Seblak");
            System.out.println("3. Remove Spicy Seblak");
            System.out.println("4. Remove Cheese Seblak");
            System.out.println("5. Print All Seblak");
            System.out.println("6. Print Spicy Seblak");
            System.out.println("7. Print Cheese Seblak");
            System.out.println("8. Update Spicy Seblak");
            System.out.println("9. Update Cheese Seblak");
            System.out.println("10. Exit");
            System.out.println("====================================");
            System.out.print("Choose your menu: ");
            menuStore = scanner.nextInt();
            scanner.nextLine();

            switch (menuStore) {
                case 1:
                    System.out.println("====================================");
                    System.out.println("            Spicy Seblak            ");
                    System.out.println("====================================");
                    System.out.print("> ID: ");
                    String idSpicy = scanner.nextLine();
                    System.out.print("> Name: ");
                    String nameSpicy = scanner.nextLine();
                    System.out.print("> Price: ");
                    int priceSpicy = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("> Level Spicy: ");
                    String levelSpicy = scanner.nextLine();
                    Menu.addSpicySeblak(new SpicySeblak(idSpicy, nameSpicy, priceSpicy, levelSpicy));
                    break;
                case 2:
                    System.out.println("====================================");
                    System.out.println("            Cheese Seblak           ");
                    System.out.println("====================================");
                    System.out.print("> ID: ");
                    String idCheese = scanner.nextLine();
                    System.out.print("> Name: ");
                    String nameCheese = scanner.nextLine();
                    System.out.print("> Price: ");
                    int priceCheese = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("> Cheese Type: ");
                    String cheeseType = scanner.nextLine();
                    Menu.addCheeseSeblak(new CheeseSeblak(idCheese, nameCheese, priceCheese, cheeseType));
                    break;
                case 3:
                    System.out.println("====================================");
                    System.out.println("            Spicy Seblak            ");
                    System.out.println("====================================");
                    System.out.print("> ID: ");
                    String idRemoveSpicy = scanner.nextLine();
                    if (!Menu.checkIdSpicy(idRemoveSpicy)) {
                        System.out.println("ID not found!");
                        break;
                    }
                    Menu.removeSpicySeblak(idRemoveSpicy);
                    System.out.println("Spicy Seblak with ID " + idRemoveSpicy + " has been removed!");
                    break;
                case 4:
                    System.out.println("====================================");
                    System.out.println("            Cheese Seblak           ");
                    System.out.println("====================================");
                    System.out.print("> ID: ");
                    String idRemoveCheese = scanner.nextLine();
                    if (!Menu.checkIdCheese(idRemoveCheese)) {
                        System.out.println("ID not found!");
                        break;
                    }
                    Menu.removeCheeseSeblak(idRemoveCheese);
                    System.out.println("Cheese Seblak with ID " + idRemoveCheese + " has been removed!");
                    break;
                case 5:
                    Menu.printAllMenu();
                    break;
                case 6:
                    Menu.printSpicySeblak();
                    break;
                case 7:
                    Menu.printCheeseSeblak();
                    break;
                case 8:
                    System.out.println("====================================");
                    System.out.println("            Spicy Seblak            ");
                    System.out.println("====================================");
                    System.out.print("> ID: ");
                    String idUpdateSpicy = scanner.nextLine();
                    if (!Menu.checkIdSpicy(idUpdateSpicy)) {
                        System.out.println("ID not found!");
                        break;
                    }
                    System.out.print("> Name: ");
                    String nameUpdateSpicy = scanner.nextLine();
                    System.out.print("> Price: ");
                    int priceUpdateSpicy = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("> Level Spicy: ");
                    String levelUpdateSpicy = scanner.nextLine();
                    Menu.updateSpicySeblak(idUpdateSpicy, nameUpdateSpicy, priceUpdateSpicy, levelUpdateSpicy);
                    break;
                case 9:
                    System.out.println("====================================");
                    System.out.println("            Cheese Seblak           ");
                    System.out.println("====================================");
                    System.out.print("> ID: ");
                    String idUpdateCheese = scanner.nextLine();
                    if (!Menu.checkIdCheese(idUpdateCheese)) {
                        System.out.println("ID not found!");
                        break;
                    }
                    System.out.print("> Name: ");
                    String nameUpdateCheese = scanner.nextLine();
                    System.out.print("> Price: ");
                    int priceUpdateCheese = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("> Cheese Type: ");
                    String cheeseUpdateType = scanner.nextLine();
                    Menu.updateCheeseSeblak(idUpdateCheese, nameUpdateCheese, priceUpdateCheese, cheeseUpdateType);
                    break;
                case 10:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong input!");
                    break;
            }
        }
    }
}
