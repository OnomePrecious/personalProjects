package phoneBook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Contacts>  contacts;
    public PhoneBook(){
        contacts = new ArrayList<Contacts>();
    }
    public void addContact(String name, String phoneNumber, String address){
        contacts.add(new Contacts(name, phoneNumber, address));
    }
    public Contacts searchContacts(String name){
        for(Contacts contact : contacts){
            if(contact.getName().equalsIgnoreCase(name)){
                return contact;

            }
        }

        return null;
    }

    public void deleteContact(String name){
        contacts.removeIf(contact ->contact.getName().equalsIgnoreCase(name));
    }
    public List<Contacts> getAllContacts() {
        return new ArrayList<>(contacts);

    }
}
