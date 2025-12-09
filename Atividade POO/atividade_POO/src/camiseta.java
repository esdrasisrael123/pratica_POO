import entidade.Triangulo;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo();

        System.out.println("Entre com as medidas do trinangulo x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Entre com as medidas do trinangulo y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("A área do triângulo x é: %.4f%n", areaX);
        System.out.printf("A área do triângulo Y é: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("X tem a maior área");
        } else {
            System.out.println("Y tem a maior área");
        }





        sc.close();
    }
} 