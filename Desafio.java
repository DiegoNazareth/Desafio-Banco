import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombre = "Tony Stark";
        String tipoDeCuenta= "Corriente";
        double saldo=1599.99;
        int opcion=0;

        System.out.println("*******************************");
        System.out.println("\nNombre del Cliente"+ nombre);
        System.out.println("El tipo de cuenta es: "+ tipoDeCuenta);
        System.out.println("Su saldo disponible es: "+ saldo + "$");
        System.out.println("\n*******************************");

        String menu = """
                *** Escriba el numero de la opcion deseada ***
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar 
                4 - Salir
                """;
        Scanner teclado= new Scanner(System.in);
        while (opcion !=4){
            System.out.println(menu);
            opcion = teclado.nextInt();
        }
    }
}
