
package u04e21;

import java.util.Scanner;
public class U04E21 {

    public static void main(String[] args) {
       int num1, num2, x;
       double factorial=1;
       Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero para calcular su factorial: ");
        num1 = entrada.nextInt();
        num2 = num1;
        for (x=1; x<num1; x++){
            factorial = factorial*num2;
            num2 = (num2-1);
        }
        System.out.print("El factorial del numero "+num1+" es: "+(int)factorial);
    }
}