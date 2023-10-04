package Notebooks;

import com.sun.source.tree.VariableTree;

import java.util.HashSet;

public class Notebooks_catalog {
    private int RAM;
    private int SSD;
    private String typeSSD;
    private String brand;
    private String model;
    private double screenResolution;
    private String CPU;
    private String color;
    private String OS;
    private String videoCard;
    private int price;
    private String state;
    private String keyboard;
    private String cpuBrand;

    public Notebooks_catalog(String brand, String model, double screenResolution, String OS, int RAM, int SSD,
            String typeSSD, String cpuBrand, String CPU, String videoCard, String color, int price, String state,
            String keyboard) {
        this.brand = brand;
        this.model = model;
        this.screenResolution = screenResolution;
        this.OS = OS;
        this.RAM = RAM;
        this.SSD = SSD;
        this.typeSSD = typeSSD;
        this.CPU = CPU;
        this.videoCard = videoCard;
        this.color = color;
        this.price = price;
        this.state = state;
        this.keyboard = keyboard;
        this.cpuBrand = cpuBrand;
    }

    public String getCpuBrand() {
        return this.cpuBrand;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public double getScreenResolution() {
        return this.screenResolution;
    }

    public String getOS() {
        return this.OS;
    }

    public int getRAM() {
        return this.RAM;
    }

    public int getSSD() {
        return this.SSD;
    }

    public String getTypeSSD() {
        return this.typeSSD;
    }

    public String getCPU() {
        return this.CPU;
    }

    public String getVideoCard() {
        return this.videoCard;
    }

    public String getColor() {
        return this.color;
    }

    public int getPrice() {
        return this.price;
    }

    public String getState() {
        return this.state;
    }

    public String getKeyboard() {
        return this.keyboard;
    }

    public static void showCatalog(HashSet<Notebooks_catalog> notebooks) {
        System.out.println();
        System.out.println("Полный каталог ноутбуков: ");
        System.out.println();
        for (Notebooks_catalog note : notebooks) {
            note.info();
        }
    }

    void info() {
        System.out.println(String.format(
                "Производитель: %s\nМодель: %s\nОперационная система: %s\nДиагональ экрана: %f\nОЗУ: %d Гб\nОбъем жесткого диска: %d Гб\nТип памяти: %s\nПроцессор: %s %s\nВидеокарта: %s\nЦвет: %s\nЦена: %d рублей\nCостояние: %s\nРаскладка клавиатуры: %s\n",
                this.brand, this.model, this.OS, this.screenResolution, this.RAM, this.SSD, this.typeSSD, this.cpuBrand,
                this.CPU, this.videoCard, this.color, this.price, this.state, this.keyboard));
    }

}