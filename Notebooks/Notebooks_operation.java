package Notebooks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Notebooks_operation {

    public static void showCatalog(HashSet<Notebooks_catalog> notebooks) {
        System.out.println();
        System.out.println("Полный каталог ноутбуков: ");
        System.out.println();
        for (Notebooks_catalog laptop : notebooks) {
            laptop.info();
        }
    }

    public static void menu() {
        Notebooks_catalog laptop = new Notebooks_catalog("LENOVO", "Legion 5 pro", 15.6, "Windows 11 pro", 32, 1024,
                "DDR5",
                "Intel",
                "Core i9 13900HX", "Nvidia 4060", "black", 160_000, "new", "Russian");
        Notebooks_catalog laptop1 = new Notebooks_catalog("HUAWEI", "MateBook 16S", 16.0, "Windows 11 home", 16, 1024,
                "LPDDR5",
                "Intel", "Core i9 13900h", "Intel Iris Xe graphics", "grey", 133_000, "new", "Russian");
        Notebooks_catalog laptop2 = new Notebooks_catalog("HUAWEI", "MateBook D 15", 15.6, "Windows 11 home", 8, 256,
                "DDR4", "Intel",
                "Core i5 1135G7", "Intel Iris Xe graphics", "silver", 47_000, "new", "Russian");
        Notebooks_catalog laptop3 = new Notebooks_catalog("LENOVO", "IdeaPad 5 pro", 16.0, "Windows 11 home", 16, 512,
                "LPDDR5",
                "AMD", "Ryzen 5 6600HS", "AMD Radeon", "grey", 94_000, "new", "English");
        Notebooks_catalog laptop4 = new Notebooks_catalog("APPLE", "MacBook pro 16", 16.2, "MacOS", 32, 1024, "LPDDR5",
                "Apple",
                "M2 max", "Apple graphics", "silver", 395_000, "new", "English");
        Notebooks_catalog laptop5 = new Notebooks_catalog("APPLE", "Macbook Air 15", 15.3, "MacOS", 8, 256, "LPDDR5",
                "Apple", "M2",
                "Apple graphics", "grey", 187_000, "new", "English");
        Notebooks_catalog laptop6 = new Notebooks_catalog("ASUS", "VivoBook 16X", 16.0, "Without OS", 16, 512, "DDR4",
                "AMD",
                "Ryzen 7 5800H", "AMD Radeon", "grey", 51_000, "new", "Russian");
        Notebooks_catalog laptop7 = new Notebooks_catalog("ASUS", "ROG Strix G18", 18.0, "Windows 11 pro", 16, 1024,
                "DDR5", "Intel",
                "Core i7 13650HX", "Nvidia 4060", "black", 123_000, "used", "Russian");
        Notebooks_catalog laptop8 = new Notebooks_catalog("MSI", "Stealth GS66", 15.6, "Windows 11 home", 32, 1024,
                "DDR5", "Intel",
                "Core i7 12700H", "Nvidia 3070 Ti", "black", 184_000, "new", "Russian");
        Notebooks_catalog laptop9 = new Notebooks_catalog("MSI", "GF63 Thin", 15.6, "Windows 11 home", 16, 512, "DDR4",
                "Intel",
                "Core i5 11400H", "Nvidia 3050 Ti", "black", 36_000, "used", "Russian");
        Notebooks_catalog laptop10 = new Notebooks_catalog("SAMSUNG", "Galaxy Book 3 Pro 360", 16.0, "Windows 11 home",
                16, 512,
                "LPDDR5", "Intel", "Core i5 1340P", "Intel Iris Xe graphics", "dark-grey", 196_000, "new", "Russian");
        Notebooks_catalog laptop11 = new Notebooks_catalog("SAMSUNG", "Galaxy book NP750", 15.6, "Windows 10 pro", 16,
                256, "LPDDR4x",
                "Intel", "Core i7 1165G7", "Intel Iris Xe graphics", "silver", 84_000, "new", "Russian");
        Notebooks_catalog laptop12 = new Notebooks_catalog("GIGABYTE", "Aero 16 XE5", 16.0, "Windows 11 pro", 32, 1024,
                "DDR5",
                "Intel", "Core i7 12700H", "Nvidia 3070 Ti", "grey", 178_000, "new", "Russian");
        Notebooks_catalog laptop13 = new Notebooks_catalog("RAZER", "Blade 17", 17.3, "Windows 11 pro", 32, 1024,
                "DDR5", "Intel",
                "Core i9 12900H", "Nvidia 3070 Ti ", "black", 350_000, "used", "English");
        Notebooks_catalog laptop14 = new Notebooks_catalog("DELL", "Latitude  7320", 13.3, "Windows 11 pro", 16, 256,
                "LPDDR4x",
                "Intel", "Core i5 1145G7", "Intel Iris Xe graphics ", "black", 103_000, "new", "English");
        Notebooks_catalog laptop15 = new Notebooks_catalog("DELL", "XPS 15", 15.6, "Windows 11 pro", 32, 1024, "DDR4",
                "Intel",
                "Core i9 11900H", "Nvidia 3050 Ti", "silver", 165_000, "new", "English");
        Notebooks_catalog laptop16 = new Notebooks_catalog("ACER", "Predator Helios 300", 15.6, "Windows 10 home", 16,
                512, "DDR4",
                "Intel", "Core i7 10750H", "Nvidia 1660 Ti", "black", 92_000, "used", "English");
        Notebooks_catalog laptop17 = new Notebooks_catalog("ACER", "Swift 3", 14.0, "Windows 11 home", 8, 256,
                "LPDDR4x", "Intel",
                "Core i5 1135G7", "Intel Iris Xe graphics", "silver", 49_000, "new", "Russian");
        Notebooks_catalog laptop18 = new Notebooks_catalog("LENOVO", "ThinkPad X1 Carbon", 14.0, "Windows 11 pro", 16,
                512, "LPDDR3",
                "Intel", "Core i7 1165G7", "Intel Iris Xe graphics", "black", 191_000, "new", "English");
        Notebooks_catalog laptop19 = new Notebooks_catalog("HP", "Spectre x360", 15.6, "Windows 10 home", 16, 1024,
                "DDR4", "Intel",
                "Core i7 1165G7", "Intel Iris Xe graphics", "silver", 136_000, "used", "English");
        Notebooks_catalog laptop20 = new Notebooks_catalog("HP", "Pavilion Gaming 15", 15.6, "Windows 11 home", 8, 256,
                "DDR4", "AMD",
                "Ryzen 5 5600H", "Nvidia 1650", "black", 61_000, "new", "Russian");
        Notebooks_catalog laptop21 = new Notebooks_catalog("ASUS", "ZenBook 14", 14.0, "Windows 11 pro", 16, 512,
                "LPDDR4x", "Intel",
                "Core i7 1165G7", "Intel Iris Xe graphics", "white", 112_000, "new", "English");
        Notebooks_catalog laptop22 = new Notebooks_catalog("ASUS", "TUF Gaming F17", 17.3, "Windows 11 home", 16, 512,
                "DDR4",
                "Intel", "Core i7 11800H", "Nvidia 3050 Ti", "black", 108_000, "new", "Russian");
        Notebooks_catalog laptop23 = new Notebooks_catalog("MSI", "Creator Z16", 16.0, "Windows 10 home", 32, 1024,
                "DDR4", "Intel",
                "Core i7 11800H", "Nvidia 3060", "silver", 213_000, "new", "Russian");
        Notebooks_catalog laptop24 = new Notebooks_catalog("MSI", "Modern 14", 14.0, "Windows 11 home", 16, 512,
                "LPDDR4x", "Intel",
                "Core i5 1135G7", "Intel Iris Xe graphics", "silver", 71_000, "new", "Russian");
        Notebooks_catalog laptop25 = new Notebooks_catalog("SAMSUNG", "Galaxy Book S", 13.3, "Windows 10 pro", 8, 256,
                "LPDDR4x",
                "Intel", "Core i5 1135G7", "Intel Iris Xe graphics", "grey", 94_000, "new", "Russian");
        Notebooks_catalog laptop26 = new Notebooks_catalog("SAMSUNG", "Chromebook Plus V2", 12.2, "ChromeOS", 4, 64,
                "LPDDR3",
                "Intel", "Celeron 3965Y", "Intel HD Graphics", "silver", 42_000, "used", "English");
        Notebooks_catalog laptop27 = new Notebooks_catalog("GIGABYTE", "Aorus 15P", 15.6, "Windows 10 home", 16, 1024,
                "DDR4",
                "Intel", "Core i7 10750H", "Nvidia 1660 Ti", "black", 105_000, "new", "Russian");
        Notebooks_catalog laptop28 = new Notebooks_catalog("GIGABYTE", "Aero 17 HDR", 17.3, "Windows 11 pro", 32, 1024,
                "DDR4",
                "Intel", "Core i9 11900H", "Nvidia 3080", "black", 370_000, "new", "Russian");
        Notebooks_catalog laptop29 = new Notebooks_catalog("RAZER", "Book 13", 13.4, "Windows 11 home", 16, 512, "DDR4",
                "Intel",
                "Core i7 1165G7", "Intel Iris Xe graphics", "black", 192_000, "new", "English");
        Notebooks_catalog laptop30 = new Notebooks_catalog("RAZER", "Blade Stealth 13", 13.3, "Windows 10 pro", 16, 512,
                "DDR4",
                "Intel", "Core i7 1165G7", "Nvidia 1650Ti", "black", 140_000, "used", "Russian");
        Notebooks_catalog laptop31 = new Notebooks_catalog("HP", "Spectre x360", 13.3, "Windows 11 home", 8, 256,
                "LPDDR4x", "Intel",
                "Core i7 1165G7", "Intel Iris Xe graphics", "black", 160_000, "new", "English");
        Notebooks_catalog laptop32 = new Notebooks_catalog("HP", "ENVY x360", 15.6, "Windows 11 home", 16, 512, "DDR4",
                "AMD",
                "Ryzen 7 5800U", "AMD Radeon", "silver", 110_000, "new", "English");
        Notebooks_catalog laptop33 = new Notebooks_catalog("ACER", "Predator Triton 500", 15.6, "Windows 11 pro", 32,
                1024, "DDR4",
                "Intel", "Core i7 11800H", "Nvidia 3080", "black", 275_000, "new", "English");
        Notebooks_catalog laptop34 = new Notebooks_catalog("ACER", "Aspire 5 slim", 15.6, "Windows 10 home", 8, 256,
                "LPDDR4x", "AMD",
                "Ryzen 5 5500U", "AMD Radeon", "silver", 50_000, "used", "Russian");
        Notebooks_catalog laptop35 = new Notebooks_catalog("HUAWEI", "MateBook X pro", 13.9, "Windows 10 home", 16, 512,
                "LPDDR4x",
                "Intel", "Core i7 1165G7", "Intel Iris Xe graphics", "grey", 180_000, "new", "English");
        Notebooks_catalog laptop36 = new Notebooks_catalog("APPLE", "MacBook pro 13", 13.3, "MacOS", 8, 256, "LPDDR4x",
                "Apple", "M1",
                "Apple graphics", "grey", 145_000, "new", "English");
        Notebooks_catalog laptop37 = new Notebooks_catalog("ASUS", "ZenBook Duo", 14.0, "Windows 11 home", 16, 512,
                "LPDDR4x",
                "Intel", "Core i5 1135G7", "Intel Iris Xe graphics", "white", 120_000, "new", "Russian");
        Notebooks_catalog laptop38 = new Notebooks_catalog("MSI", "GE66 Raider", 15.6, "Windows 11 home", 32, 1024,
                "DDR4", "Intel",
                "Core i9 11980HK", "Nvidia 3080", "black", 300_000, "used", "Russian");
        Notebooks_catalog laptop39 = new Notebooks_catalog("SAMSUNG", "Galaxy Book Flex 2", 15.6, "Windows 11 home", 16,
                512,
                "LPDDR4x", "Intel", "Core i7 1165G7", "Intel Iris Xe graphics", "Mystic Bronze", 165_000, "new",
                "English");
        Notebooks_catalog laptop40 = new Notebooks_catalog("GIGABYTE", "Aero 17", 17.3, "Windows 11 pro", 64, 2048,
                "DDR4", "Intel",
                "Core i9 11900H", "Nvidia 3080", "black", 380_000, "new", "English");
        Notebooks_catalog laptop41 = new Notebooks_catalog("DELL", "Inspiron 15", 15.6, "Windows 11 home", 8, 256,
                "LPDDR4x", "Intel",
                "Core i7 1165G7", "Intel Iris Xe graphics", "black", 75_000, "used", "English");
        Notebooks_catalog laptop42 = new Notebooks_catalog("HP", "Pavilion Gaming", 15.6, "Windows 11 home", 16, 512,
                "DDR4", "AMD",
                "Ryzen 9 5900HX", "Nvidia 3050", "black", 110_000, "new", "Russian");

        HashSet<Notebooks_catalog> laptops = new HashSet<Notebooks_catalog>(
                Arrays.asList(laptop, laptop1, laptop2, laptop3, laptop4, laptop5, laptop6, laptop7, laptop8, laptop9,
                        laptop10, laptop11, laptop12, laptop13, laptop14, laptop15, laptop16, laptop17, laptop18,
                        laptop19, laptop20, laptop21, laptop22, laptop23, laptop24, laptop25, laptop26, laptop27,
                        laptop28, laptop29, laptop30, laptop31, laptop32, laptop33, laptop34, laptop35, laptop36,
                        laptop37, laptop38, laptop39, laptop40, laptop41, laptop42));

        Notebooks_operation op = new Notebooks_operation();
        boolean fl = true;
        Scanner scanner = new Scanner(System.in, "cp866");
        while (fl) {
            System.out.println(
                    "Выберите:\n1. Вывести весь каталог ноутбуков \n2. Оперативная память \n3. Размер SSD \n4. Тип памяти \n5. Производитель \n6. Операционная система \n7. Диагональ экрана \n8. Цвет \n9. Раскладка клавиатуры \n10. Производитель процессора \n11. Цена \n12. Cостояние \n13. Закончить");
            System.out.print("Введите: ");
            int choice = scanner.nextInt();

            if (choice == 1) {

                op.showCatalog(laptops);
                break;
            } else if (choice == 2) {
                filterRAM(laptops, scanner);
                break;

            } else if (choice == 3) {
                filterSSD(laptops, scanner);
                break;

            } else if (choice == 4) {
                filterTypeSSD(laptops, scanner);
                break;

            } else if (choice == 5) {
                filterBrand(laptops, scanner);
                break;
            } else if (choice == 6) {
                filterOS(laptops, scanner);
                break;
            } else if (choice == 7) {
                filterScreenResolution(laptops, scanner);
                break;
            } else if (choice == 8) {
                filterColor(laptops, scanner);
                break;
            } else if (choice == 9) {
                filterKeyboard(laptops, scanner);
                break;
            } else if (choice == 10) {
                filterCpuBrand(laptops, scanner);
                break;
            } else if (choice == 11) {
                filterPrice(laptops, scanner);
                break;
            } else if (choice == 12) {
                filterState(laptops, scanner);
                break;
            } else if (choice == 13) {
                break;
            } else {
                System.out.println("Такой команды не существует");
            }

        }

    }

    static void filterRAM(HashSet<Notebooks_catalog> laptops, Scanner scanner) {
        TreeSet<Integer> RAM = new TreeSet<>();
        for (Notebooks_catalog laptop : laptops) {
            RAM.add(laptop.getRAM());
        }
        String error = scanner.nextLine(); // строка помогает с ошибкой вызванной первоначальным вводом
        System.out.println();
        System.out.println("Введите от какого размера памяти фильтровать:");
        int minRAM = scanner.nextInt();

        System.out.println("Введите до какого размера памяти фильтровать:");
        int maxRAM = scanner.nextInt();

        boolean isLaptopFound = false;

        for (Notebooks_catalog laptop : laptops) {
            int laptopRAM = laptop.getRAM();
            if (laptopRAM >= minRAM && laptopRAM <= maxRAM) {
                laptop.info();
                isLaptopFound = true;
            }
        }

        if (!isLaptopFound) {
            System.out.println(
                    "К сожалению, у нас нет товаров указанной оперативной памятью, повторите(нажмите на Enter)");
            filterRAM(laptops, scanner);
        }
    }

    static void filterSSD(HashSet<Notebooks_catalog> laptops, Scanner scanner) {
        TreeSet<Integer> SSD = new TreeSet<>();
        for (Notebooks_catalog laptop : laptops) {
            SSD.add(laptop.getSSD());
        }
        String error = scanner.nextLine(); // строка помогает с ошибкой вызванной первоначальным вводом
        System.out.println();
        System.out.println("Введите от какого размера памяти фильтровать:");
        int minSSD = scanner.nextInt();

        System.out.println("Введите до какого размера памяти фильтровать:");
        int maxSSD = scanner.nextInt();

        boolean isLaptopFound = false;

        for (Notebooks_catalog laptop : laptops) {
            int laptopSSD = laptop.getSSD();
            if (laptopSSD >= minSSD && laptopSSD <= maxSSD) {
                laptop.info();
                isLaptopFound = true;
            }
        }

        if (!isLaptopFound) {
            System.out.println("К сожалению, у нас нет товаров указанным размером SSD, повторите(нажмите на Enter)");
            filterSSD(laptops, scanner);
        }
    }

    static void filterTypeSSD(HashSet<Notebooks_catalog> laptops, Scanner scanner) {
        TreeSet<String> typeSSD = new TreeSet<>();
        for (Notebooks_catalog laptop : laptops) {
            typeSSD.add(laptop.getTypeSSD());
        }
        String error = scanner.nextLine(); // строка помогает с ошибкой вызванной первоначальным вводом
        System.out.println();
        System.out.println("Введите нужный вам тип памяти:");

        String filter = scanner.nextLine();
        if (typeSSD.contains(filter)) {
            System.out.println();
            for (Notebooks_catalog laptop : laptops) {
                if (laptop.getTypeSSD().equals(filter)) {
                    laptop.info();
                }
            }
        } else {
            System.out.println("К сожалению, у нас нет товаров указанным типом памяти, повторите(нажмите на Enter)");
            filterTypeSSD(laptops, scanner);
        }

    }

    static void filterBrand(HashSet<Notebooks_catalog> laptops, Scanner scanner) {
        TreeSet<String> brand = new TreeSet<>();
        for (Notebooks_catalog laptop : laptops) {
            brand.add(laptop.getBrand().toUpperCase());
        }
        String error = scanner.nextLine(); // строка помогает с ошибкой вызванной первоначальным вводом
        System.out.println();
        System.out.println("Введите нужного вам производителя:");

        String oper = scanner.nextLine().toUpperCase();
        String filter = oper;
        if (brand.contains(filter)) {
            System.out.println();
            for (Notebooks_catalog laptop : laptops) {
                if (laptop.getBrand().equals(oper)) {
                    laptop.info();
                }
            }
        } else {
            System.out.println("К сожалению, у нас нет товаров указанного производителя, повторите(нажмите на Enter)");
            filterBrand(laptops, scanner);
        }

    }

    static void filterOS(HashSet<Notebooks_catalog> laptops, Scanner scanner) {
        TreeSet<String> OS = new TreeSet<>();
        for (Notebooks_catalog laptop : laptops) {
            OS.add(laptop.getOS());
        }
        String error = scanner.nextLine(); // строка помогает с ошибкой вызванной первоначальным вводом
        System.out.println();
        System.out.println("Введите нужную вам операционную систему:");

        String oper = scanner.nextLine();
        if (OS.contains(oper)) {
            System.out.println();
            for (Notebooks_catalog laptop : laptops) {
                if (laptop.getOS().equals(oper)) {
                    laptop.info();
                }
            }
        } else {
            System.out.println(
                    "К сожалению, у нас нет товаров указанной операционной системой, повторите(нажмите на Enter)");
            filterOS(laptops, scanner);
        }
    }

    static void filterScreenResolution(HashSet<Notebooks_catalog> laptops, Scanner scanner) {
        TreeSet<Double> sr = new TreeSet<>();
        for (Notebooks_catalog laptop : laptops) {
            sr.add(laptop.getScreenResolution());
        }
        String error = scanner.nextLine(); // строка помогает с ошибкой вызванной первоначальным вводом
        System.out.println();
        System.out.println("Введите от какой диагонали экрана фильтровать:");
        double minSr = scanner.nextDouble();

        System.out.println("Введите до какой диагонали экрана фильтровать:");
        double maxSr = scanner.nextDouble();

        boolean isLaptopFound = false;

        for (Notebooks_catalog laptop : laptops) {
            double laptopSr = laptop.getScreenResolution();
            if (laptopSr >= minSr && laptopSr <= maxSr) {
                laptop.info();
                isLaptopFound = true;
            }
        }

        if (!isLaptopFound) {
            System.out
                    .println("К сожалению, у нас нет товаров указанной диагональю экрана, повторите(нажмите на Enter.");
            filterScreenResolution(laptops, scanner);
        }
    }

    static void filterColor(HashSet<Notebooks_catalog> laptops, Scanner scanner) {
        TreeSet<String> colors = new TreeSet<>();
        for (Notebooks_catalog laptop : laptops) {
            colors.add(laptop.getColor().toLowerCase());
        }
        String error = scanner.nextLine(); // строка помогает с ошибкой вызванной первоначальным вводом
        System.out.println();
        System.out.println("Введите нужный вам цвет:");
        String oper = scanner.nextLine().toLowerCase();
        if (colors.contains(oper)) {
            System.out.println();
            for (Notebooks_catalog laptop : laptops) {
                if (laptop.getColor().toLowerCase().equals(oper)) {
                    laptop.info();
                }
            }
        } else {
            System.out.println("К сожалению, у нас нет товаров указанным цветом, повторите(нажмите на Enter)");
            filterColor(laptops, scanner);
        }
    }

    static void filterKeyboard(HashSet<Notebooks_catalog> laptops, Scanner scanner) {
        TreeSet<String> keyboard = new TreeSet<>();
        for (Notebooks_catalog laptop : laptops) {
            keyboard.add(laptop.getKeyboard());
        }
        String error = scanner.nextLine(); // строка помогает с ошибкой вызванной первоначальным вводом
        System.out.println();
        System.out.println("Введите нужную вам раскладку клавиатуры:");
        String oper = scanner.nextLine();
        if (keyboard.contains(oper)) {
            System.out.println();
            for (Notebooks_catalog laptop : laptops) {
                if (laptop.getKeyboard().equals(oper)) {
                    laptop.info();
                }
            }
        } else {
            System.out.println(
                    "К сожалению, у нас нет товаров указанной раскладкой клавиатуры, повторите(нажмите на Enter)");
            filterKeyboard(laptops, scanner);
        }
    }

    static void filterCpuBrand(HashSet<Notebooks_catalog> laptops, Scanner scanner) {
        TreeSet<String> cpuBrand = new TreeSet<>();
        for (Notebooks_catalog laptop : laptops) {
            cpuBrand.add(laptop.getCpuBrand());
        }
        String error = scanner.nextLine(); // строка помогает с ошибкой вызванной первоначальным вводом
        System.out.println();
        System.out.println("Введите нужного производителя процессоров:");
        String oper = scanner.nextLine();
        if (cpuBrand.contains(oper)) {
            System.out.println();
            for (Notebooks_catalog laptop : laptops) {
                if (laptop.getCpuBrand().equals(oper)) {
                    laptop.info();
                }
            }
        } else {
            System.out.println(
                    "К сожалению, у нас нет товаров указанным производителем процессоров, повторите(нажмите на Enter)");
            filterCpuBrand(laptops, scanner);
        }
    }

    static void filterPrice(HashSet<Notebooks_catalog> laptops, Scanner scanner) {
        TreeSet<Integer> price = new TreeSet<>();
        for (Notebooks_catalog laptop : laptops) {
            price.add(laptop.getPrice());
        }
        String error = scanner.nextLine(); // строка помогает с ошибкой вызванной первоначальным вводом
        System.out.println();
        System.out.println("Введите от какой цены фильтровать:");
        int minPrice = scanner.nextInt();

        System.out.println("Введите до какой цены фильтровать:");
        int maxPrice = scanner.nextInt();

        boolean isLaptopFound = false;

        for (Notebooks_catalog laptop : laptops) {
            int laptopPrice = laptop.getPrice();
            if (laptopPrice >= minPrice && laptopPrice <= maxPrice) {
                laptop.info();
                isLaptopFound = true;
            }
        }

        if (!isLaptopFound) {
            System.out.println("К сожалению, у нас нет товаров указанной ценой, повторите(нажмите на Enter)");
            filterPrice(laptops, scanner);
        }
    }

    static void filterState(HashSet<Notebooks_catalog> laptops, Scanner scanner) {
        TreeSet<String> state = new TreeSet<>();
        for (Notebooks_catalog laptop : laptops) {
            state.add(laptop.getState());
        }
        String error = scanner.nextLine(); // строка помогает с ошибкой вызванной первоначальным вводом
        System.out.println();
        System.out.println("Введите нужное вам состояние ноутбука:");
        String oper = scanner.nextLine();
        if (state.contains(oper)) {
            System.out.println();
            for (Notebooks_catalog laptop : laptops) {
                if (laptop.getState().equals(oper)) {
                    laptop.info();
                }
            }
        } else {
            System.out.println("К сожалению, у нас нет товаров указанным состоянием, повторите(нажмите на Enter)");
            filterState(laptops, scanner);
        }

    }

}