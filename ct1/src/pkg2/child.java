package pkg2;

import pkg1.parent;

public class child extends parent {

    public void add(int b) {
        y += b;
        z += b;
    }

    public static void main(String[] args) {
        child c = new child();
        c.display();
        c.add(10);
        c.display();
    }
}
