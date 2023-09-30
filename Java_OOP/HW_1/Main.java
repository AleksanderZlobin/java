package Java_OOP.HW_1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Shop shop = new Shop();

        Category category1 = new Category("Электроника");

        category1.addProduct(new Product("Ноутбук", 1500.0, 4));

        category1.addProduct(new Product("Смартфон", 750.0, 5));

        Category category2 = new Category("Посуда");

        category2.addProduct(new Product("Кастрюля", 20.0, 3));

        category2.addProduct(new Product("Тарелки", 50.0, 4));

        shop.addCategory(category1);

        shop.addCategory(category2);

        shop.printCatalog();

        User user1 = new User("user1", "password1");

        User user2 = new User("user2", "password2");

        user1.getBasket().addProduct(category1.getProducts().get(0));

        user2.getBasket().addProduct(category2.getProducts().get(1));

        category1.getProducts().remove(0);

        category2.getProducts().remove(1);

        System.out.println(user1.getLogin() + " - Покупки:");

        ArrayList<Product> user1Products = user1.getBasket().getProducts();

        for (Product product : user1Products) {

            System.out.println("- " + product.getName() + " - " + product.getPrice() + " - " + product.getRating());

        }

        System.out.println(user2.getLogin() + " - Покупки:");

        ArrayList<Product> user2Products = user2.getBasket().getProducts();

        for (Product product : user2Products) {

            System.out.println("- " + product.getName() + " - " + product.getPrice() + " - " + product.getRating());

        }

    }

}
