public class Complex {
    int real;
    int imag;
    public Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }
    public static Complex add(Complex n1, Complex n2) {
        Complex temp = new Complex(0, 0);
        temp.real = n1.real + n2.real;
        temp.imag = n1.imag + n2.imag;
        return(temp);
    }
    public static Complex diff(Complex n1, Complex n2)
    {
        Complex temp1 = new Complex(0, 0);
        temp1.real = n1.real - n2.real;
        temp1.imag = n1.imag - n2.imag;
        return(temp1);
    }
    public static void main(String[] args) {
        Complex n1 = new Complex(2, 4), n2 = new Complex(3, 5), temp, temp1;
        temp = add(n1, n2);
        temp1 = diff(n1,n2);
        System.out.printf("Sum = %d + %di\n", temp.real, temp.imag);
        System.out.printf("diff = %d + (%d)i", temp1.real, temp1.imag);

    }
}
