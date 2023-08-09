package B2;


import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero:");
        int numeromax = scanner.nextInt();

        String par = "";
        String impar = "";


        for (int i = 0; i <= numeromax; i++){

            if (i %2 ==0){

                par = par + i + ".";

            }else if(i %2 != 0){

                impar = impar + i + ".";


            }else{
                System.out.println("El numero no conside con un entero");
            }


        }
        System.out.println("numeros pares:" + par );
        System.out.println("numeros impares:" + impar  );







    }
}
