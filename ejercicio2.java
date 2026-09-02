import java.util.Scanner;

public class ejercicio2 {
    
    public static void main (String[] args) {

        Scanner sc =new Scanner(System.in);
        
        System.out.println("Ingresa la palabra para conteo (sin simbolos, caracteres especiales, numeros ni mayusculas): ");
        String palabra= sc.next();

        int vocales =0;
        int consonantes =0;

        for(int i=0; i< palabra.length();i++){
            char letra =palabra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                
                vocales++;
            } 
            else {
                consonantes++;
            }
        }

        System.out.println("Total de vocales: " + vocales);
        System.out.println("Total de consonantes: " + consonantes);
        
        sc.close();

    }
}