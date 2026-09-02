import java.util.Scanner;

public class ejercicio3 {
    
    public static void main (String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("Ingrese la cadena de texto para invertirla: ");
        String texto=sc.nextLine();
        String textoInv = "";
        

        for(int i=texto.length()-1; i>=0; i--){
            textoInv += texto.charAt(i);

        }
        System.out.println("El texto invertido es: "+ textoInv);
        sc.close();
    }

}