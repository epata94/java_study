package chapter10;

public class AddressBook {
    private Contact[] contacts;
    private int numContacts;

    public AddressBook(int maxNumContacts) {
        contacts = new Contact[maxNumContacts];
        numContacts = 0;
    }

    public void addContact(String name, String phone, String email) {
        if (numContacts < contacts.length) {
            contacts[numContacts] = new Contact(name, phone, email);
            numContacts++;
        }
    }

    public void printAddressBook() {
        for (int i = 0; i < numContacts; i++) {
            System.out.println("이름: " + contacts[i].getName() + ", 전화번호: " + contacts[i].getPhone() + ", 이메일: " + contacts[i].getEmail());
        }
    }

    public static void main(String[] args) {
        AddressBook book = new AddressBook(3);

        book.addContact("앨리스", "010-1234-5678", "alice@example.com");
        book.addContact("밥", "010-4321-9876", "bob@example.com");
        book.addContact("찰리", "010-1111-2222", "charlie@example.com");

        book.printAddressBook();
    }
}

class Contact {
    private String name;
    private String phone;
    private String email;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}