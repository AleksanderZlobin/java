package Laptop;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Laptop hp_pavilion_g6 = new Laptop("hp_pavilion_g6", 16, "4k",
                true, 500, "16", "Windows", "black");
        Laptop hp_galaxy_x64 = new Laptop("hp_galaxy_x64", 14, "FullHD",
                true, 500, "8", "Windows", "white");
        Laptop samsung_a52 = new Laptop("samsung_a52", 18, "FullHD",
                true, 750, "8", "noOS", "black");
        Laptop samsung_m31s = new Laptop("samsung_m31s", 16, "4k",
                false, 1000, "16", "Linux", "black");
        Laptop lenovo_gtx76 = new Laptop("lenovo_gtx76", 16, "FullHD",
                true, 750, "8", "Windows", "silver");
        Laptop macbook_pro = new Laptop("macbook_pro", 14, "4k",
                false, 1000, "16", "MacOS", "white");
        Laptop asus_x515 = new Laptop("asus_x515", 17, "FullHD",
                true, 500, "4", "Windows", "silver");
        Laptop acer_air5 = new Laptop("acer_air5", 13, "FullHD",
                true, 750, "8", "Windows", "black");
        Laptop acer_air6 = new Laptop("acer_air6", 14, "4k",
                false, 500, "16", "noOS", "black");
        Laptop acer_a313 = new Laptop("acer_a313", 16, "FullHD",
                true, 1000, "16", "Linux", "silver");

        Set<Laptop> laptop = new HashSet<>();
        laptop.add(hp_pavilion_g6);
        laptop.add(hp_galaxy_x64);
        laptop.add(samsung_a52);
        laptop.add(samsung_m31s);
        laptop.add(lenovo_gtx76);
        laptop.add(macbook_pro);
        laptop.add(asus_x515);
        laptop.add(acer_air5);
        laptop.add(acer_air6);
        laptop.add(acer_a313);

        Laptop FilterLaptop = new Laptop();

        // System.out.println(FilterLaptop.newFilter(laptop));

        System.out.println("по вашему запросу найдено: " + FilterLaptop.filter(laptop));
    }
}