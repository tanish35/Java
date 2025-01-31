import java.util.Scanner;

class Stack {
    private int[] arr;
    private int top;
    private int capacity;

    public Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
        arr[++top] = x;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return arr[top--];
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int size = sc.nextInt();
        Stack stack = new Stack(size);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(15);
        stack.push(9);
        stack.print();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.print();
        sc.close();
    }
}
