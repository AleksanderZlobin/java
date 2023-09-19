public class HW_5 {
    public static void main(String[] args) {
        Phonebook phoneBook = new Phonebook();
        phoneBook.add("123456789", "Иван");
        phoneBook.add("987654321", "Иван");
        phoneBook.add("456789123", "Анатолий");
        phoneBook.add("321654987", "Арсений");
        phoneBook.add("789123456", "Саша");
        phoneBook.add("654987321", "Сергей");
        phoneBook.add("234567891", "Иван");
        phoneBook.add("876543219", "Пётр");
        phoneBook.add("345678912", "Александра");
        phoneBook.add("432165498", "Андрей");
        phoneBook.add("876543219", "Степан");
        phoneBook.add("234567891", "Сергей");
        phoneBook.add("654987321", "Владимир");
        phoneBook.add("435455423", "Владимир");
        phoneBook.add("789123446", "Вика");
        phoneBook.add("321654987", "Сергей");
        phoneBook.add("321654987", "Толян");
        phoneBook.add("321654987", "Толян");
        System.out.println(phoneBook.getPhoneNum("654987321"));
        System.out.println(phoneBook.getByName("Давид"));
        System.out.println(phoneBook.getAll());
    }
}
