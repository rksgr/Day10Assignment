import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// Desirable changes to be made in code, see the comments
public class AddressBookMain {

    static List<AddressBookMain> addressList = new ArrayList();

    public static void addAddress(AddressBookMain address) {
        for (AddressBookMain book : addressList) {
            if (book.getFirstName().equals(address.getFirstName()) && (book.getLastName().equals(address.getLastName()))) {
                return;
            }
        }
        addressList.add(address);
        System.out.println("address " + address + "added successfully");
    }

    private Object getLastName() {
    final Object o = null;
        final Object o1 = null;
        return o1;
    }


    private Object getFirstName() {
        final Object o = null;
        return null;
    }

    public static void editAddress(String name, AddressBookMain addressBook) {
        String names[] = name.split(" ");
        String firstName = names[0];
        String lastName = names[1];
        for (AddressBookMain book : addressList) {
            if (book.getFirstName().equals(firstName) && book.getLastName().equals(lastName)) {
                book = addressBook;
                System.out.println("address with name " + name + "after editing " + book);
                break;
            }
        }

    }

    public static AddressBookMain searchAnAddress(String name) {
        String names[] = name.split(" ");
        String firstName = names[0];
        String lastName = names[1];
        for (AddressBookMain book : addressList) {
            if (book.getFirstName().equals(firstName) && book.getLastName().equals(lastName)) {

                return book;
            }
        }
        return null;
    }

    public static void deleteAddress(String name) {
        String names[] = name.split(" ");
        String firstName = names[0];
        String lastName = names[1];
        for (AddressBookMain book : addressList) {
            if (book.getFirstName().equals(firstName) && book.getLastName().equals(lastName)) {
                addressList.remove(book);
                System.out.println("address with name " + name + "removed successfully");
                break;
            }
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        AddressBookMain addressBookscn = new AddressBookMain();
        System.out.println("Enter First Name");
        addressBookscn.setFirstName(scn.nextLine());
        System.out.println("Enter Last Name");
        addressBookscn.setLastName(scn.nextLine());
        addressBookscn.setAddress("Indra Nagar");
        addressBookscn.setEmail("rahul.dravid@bcici.com");
        addressBookscn.setCity("Bangalore");
        addressBookscn.setState("Karnataka");
        addressBookscn.setPhoneNo(1235L);
        addressBookscn.setZip(560038L);

        addAddress(addressBookscn);
        System.out.println(addressList);
    }

    private void setZip(long l) {
    }

    private void setState(String karnataka) {
    }

    private void setPhoneNo(long l) {
    }

    private void setCity(String bangalore) {
    }

    private void setEmail(String s) {
    }

    private void setLastName(String nextLine) {

    }

    private void setFirstName(String nextLine) {

    }

    private void setAddress(String nextLine) {

    }
}
