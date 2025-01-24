import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

abstract class Item {
    private String name;
    private int quantity;

    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
    public abstract void display();
}

class Fruit extends Item {
    private String type;

    public Fruit(String name, int quantity, String type) {
        super(name, quantity);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void display() {
        System.out.println("Name: " + getName() + " Quantity: " + getQuantity() + " Type: " + type);
    }
}

class Weapon extends Item {
    private int damage;
    private String type;

    public Weapon(String name, int quantity, int damage, String type) {
        super(name, quantity);
        this.damage = damage;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getDamage() {
        return damage;
    }

    public void display() {
        System.out.println("Name: " + getName() + " Quantity: " + getQuantity() + " Damage: " + damage + " Type: " + type);
    }
}

class Inventory {
    private ArrayList<Item> items;

    public Inventory() {
        items = new ArrayList<Item>();
    }
 
    public void addItem(Item item) {
        items.add(item);
    }

    public void addItem(String name, int quantity, String type) {
        items.add(new Fruit(name, quantity, type));
    }

    public void addItem(String name, int quantity, int damage, String type) {
        items.add(new Weapon(name, quantity, damage, type));
    }

    public void display() {
        for (Item item : items) {
            item.display();
        }
    }
}

interface ItemStuff {
    String getName();
    int getQuantity();
    void display();
}

class Fruit1 implements ItemStuff {
    private String name;
    private int quantity;
    private String type;

    public Fruit1(String name, int quantity, String type) {
        this.name = name;
        this.quantity = quantity;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getType() {
        return type;
    }

    public void display() {
        System.out.println("Name: " + name + " Quantity: " + quantity + " Type: " + type);
    }
}

class Weapon1 implements ItemStuff {
    private String name;
    private int quantity;
    private int damage;
    private String type;

    public Weapon1(String name, int quantity, int damage, String type) {
        this.name = name;
        this.quantity = quantity;
        this.damage = damage;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getDamage() {
        return damage;
    }

    public String getType() {
        return type;
    }

    public void display() {
        System.out.println("Name: " + name + " Quantity: " + quantity + " Damage: " + damage + " Type: " + type);
    }
}

public class class1 {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        // Item item = new Item("General Item", 10);
        // Fruit fruit = new Fruit("Apple", 5, "Kashmiri");
        // Weapon weapon = new Weapon("Sword", 1, 10, "Sharp");
        // inventory.addItem(item);
        inventory.addItem("Apple", 5, "Kashmiri");
        inventory.addItem("Sword", 1, 10, "Sharp");
        inventory.display();
    }
}