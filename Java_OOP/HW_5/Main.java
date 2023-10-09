package Java_OOP.HW_5;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        AddressBook addressBook = new AddressBook();
        addressBook.addRecord("123-11-32", "Сергей Иванов", "ул. Новоселов, 3");
        addressBook.addRecord("883-47-21", "Петр Ломоносов", "пр. Мира, 5");
        addressBook.addRecord("919-41-85", "Николай Галустян", "пер. Лесоповала, 8");
        System.out.println(addressBook.allRecords());
    }
}