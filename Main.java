import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner num = new Scanner(System.in);
        int repetir = 1;

        while(repetir == 1){
            System.out.println("1) Suma");
            System.out.println("2) Resta");
            System.out.println("3) Multiplicacion");
            System.out.println("4) Division");
            System.out.println("Ingrese el numero de la operacion a realizar");
            int elegir = num.nextInt();

            System.out.println("Ingrese dos numeros");
            int numero1 = num.nextInt();
            int numero2 = num.nextInt();

            Calculadora calcu = new Calculadora();

            switch(elegir) {
                case 1:
                    calcu.suma(numero1, numero2);
                    break;
                case 2:
                    calcu.resta(numero1, numero2);
                    break;
                case 3:
                    calcu.multiplicacion(numero1, numero2);
                    break;
                case 4:
                    calcu.division(numero1, numero2);
                    break;
                default:
                    System.out.println("El valor ingresado es erroneo");
                    break;
            }

            System.out.println("Quiere finalizar el programa?");
            System.out.println("Ingrese '0' para finalizar o '1' para continuar");
            repetir = num.nextInt();
        }
    }
}
