import java.util.Scanner;

public class ejercicio1 {
    
    public static void main (String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        double num1 =sc.nextDouble();

        System.out.println("Ingrese el segundo numero: ");
        double num2 =sc.nextDouble();
               
        System.out.println("Elija la operacion que desea realizar(-, +, /, *):  ");
        char operador=sc.next().charAt(0);

        double solucion= ejecutarOperacion(num1, num2, operador);
        System.out.println("Resultado: " + solucion);
        sc.close();

    }



    public static double ejecutarOperacion(double n1, double n2, char op) {
        switch (op) {
            case '+':
                return n1 + n2;
            
            case '-':
                return n1 - n2;

            case '*':
                return n1 * n2;

            case '/':
                if (n2 !=0) {
                    return n1 / n2;                    
                }
                else{
                    System.out.println("Error: Se esta diviendo por cero");
                }

            default:
                System.out.println("Error");
                return 0;
        }
    }
}