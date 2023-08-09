package B3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Bienvenido a la pagina web");
        System.out.println("1.Login");
        System.out.println("2.Vista previa de la pagina web");
        System.out.println("3.Salir de la pagina web");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una opcion:");
        int opci = scanner.nextInt();
        int reco = 0;
        String Usu = "Juan";
        String Contra = "Camilo12345";

        while (reco < 3){
            switch (opci) {
                case 1:

                    System.out.println("Ingrese nombre de usuario ");
                    String us= scanner.next();
                    System.out.println("Ingrese la contraseña ");
                    String Co = scanner.next();

                    if (us.equals(Usu) && Co.equals(Contra)){

                        System.out.println("Bienvenido a la pagina web");

                    }else{
                        reco = reco + 1;

                        System.out.println(us);
                        System.out.println(Co);
                        System.out.println(reco);

                    }

                    break;
                case 2:
                    System.out.println("Visitando imformacion de la pagina web ");
                    break;
                case 3:
                    System.out.println("Saliendo de la pagina web ");
                    break;

                default:
                    System.out.println("Esta opcion no es valida");

            }
        }
    }
}
// profesor una cuestion que me salio un error, que no tuve en cuenta es que la opcion 2 y 3 se me ciclan muchas veces cuando la selecciona