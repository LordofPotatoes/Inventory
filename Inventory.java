package inventory;

import java.util.*;


public class Inventory {

    private String manufacturer;
    private String name;
    private double calibre;
    private int ammocount;
    private boolean used;

    public Inventory(String manufacturer, String name, double calibre, int ammocount, boolean used) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.calibre = calibre;
        this.ammocount = ammocount;
        this.used = used;
    }

    public static void main(String[] args) {
        String i;
        Scanner keyboard = new Scanner(System.in);
        Inventory weapon1 = new Inventory("Kalashnikov", "AK-74M", 5.45, 30, false);
        Inventory weapon2 = new Inventory("Heckler & Koch", "MP5A4", 9, 30, true);
        Inventory weapon3 = new Inventory("FN Herstal", "M249 SAW", 5.56, 200, true);
        Inventory weapon4 = new Inventory("John T. Thompson", "Thompson", 11.43, 20, false);
        System.out.println("pick a number from one to four");
        i = keyboard.next();
        if (i.equals("1")) {
            weapon1.print();
        } else if (i.equals("2")) {
            weapon2.print();
        } else if (i.equals("3")) {
            weapon3.print();
        } else if (i.equals("4")) {
            weapon4.print();
        } else {
            System.out.println("no u");
        }
    }

    public void print() {
        System.out.println("manufactured by " + manufacturer);
        System.out.println("weapon is " + name);
        System.out.println("rifled in " + calibre);
        System.out.println("ammo count is " + ammocount);
        System.out.println("is used: " + used);
    }
}
