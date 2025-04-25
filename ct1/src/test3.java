//to check if udt is passed by reference or value

class Complex {
    public double real;
    public double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }

    public Complex sub(Complex other) {
        return new Complex(this.real - other.real, this.imag - other.imag);
    }

    public Complex mul(Complex other) {
        return new Complex(this.real * other.real - this.imag * other.imag,
                this.real * other.imag + this.imag * other.real);
    }

    public Complex div(Complex other) {
        double den = other.real * other.real + other.imag * other.imag;
        return new Complex((this.real * other.real + this.imag * other.imag) / den,
                (this.imag * other.real - this.real * other.imag) / den);
    }

    public String toString() {
        return this.real + " + " + this.imag + "i";
    }
}

public class test3 {

    static void increment(Complex c) {
        c.real++;
        c.imag++;
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(3, 4);
        System.out.println(c1);
        System.out.println(c2);
        increment(c1);
        System.out.println(c1);
        System.out.println(c2);
    }

}
