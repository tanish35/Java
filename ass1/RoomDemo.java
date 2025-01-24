package ass1;

import java.util.Scanner;

class Room{
    private int height;
    private int width;
    private int breadth;

    public Room(int height, int width, int breadth){
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }
    public long Volume(){
        return height * width * breadth;
    }
}

public class RoomDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of the room: ");
        int height = sc.nextInt();
        System.out.println("Enter the width of the room: ");
        int width = sc.nextInt();
        System.out.println("Enter the breadth of the room: ");
        int breadth = sc.nextInt();
        Room room = new Room(height, width, breadth);
        System.out.println("Volume of the room is: " + room.Volume());
        sc.close();
    }
    
}
