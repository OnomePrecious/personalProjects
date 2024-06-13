package phoneBook;

import java.util.Scanner;

public class PhoneBookApp {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to my phone book Application\n what would you like to do?");
        System.out.println("================================================");
        System.out.println("1. Add contact");
        System.out.println("2. Search contacts");
        System.out.println("3. Delete contact");
        System.out.println("4. View all contacts");
        System.out.println("5. Exit application");
        System.out.println("================================================");

        System.out.println("Enter option");
        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {
            case 1:
                System.out.println("Enter name");
                String name = scanner.nextLine();

                System.out.println("Enter your phone number");
                String number = scanner.nextLine();

                System.out.println("Enter your address");
                String address = scanner.nextLine();
phoneBook.addContact(name, number, address);
                System.out.println("Contact added");
                break;

            case 2:
                System.out.println("Enter name to search");
                String nameToSearch = scanner.nextLine();

               Contacts contacts = phoneBook.searchContacts(nameToSearch);
               if(contacts != null){
                   System.out.println("Contact found:" + contacts);
               }else{
                   System.out.println("Contact not found");
                   break;
               }

               case 3:
                   System.out.println("Enter name of contact to delete");
                   String nameToDelete = scanner.nextLine();
                   phoneBook.deleteContact(nameToDelete);

                   System.out.println("Contact successfully deleted");
                   break;

                   case 4:
                       System.out.println("All saved contacts");
                       for(Contacts contacts1: phoneBook.getAllContacts()) {
                           System.out.println(contacts1);
                       }
                       break;
            default:
                           System.out.println("Invalid input, try again");}
    }
}
