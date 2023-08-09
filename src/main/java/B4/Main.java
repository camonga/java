package B4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        while (true){
            System.out.println("1.DIVION.");
            System.out.println("2.SALIR.");

            System.out.println("Seleccione una opcion:");
            int opci = scanner.nextInt();

            if (opci >= 1 && opci <= 3 ){

                System.out.println("Ingrese dos numero para dividir:");
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();

                if (opci == 1){

                    num = num2 / num1;

                }else if (opci == 2) {

                    System.out.println("Salio de la division.");

                }

                /*try {
                    if(num2 == 0){
                        throw new Exception("No se puede dividir por 0.");
                    }
                    if(num2 == String){
                        throw new Exception("No se puede dividir con palabras.");
                    }
                    if(num1 == String){
                        throw new Exception("No se puede dividir con palabras");
                    }
                }catch (RuntimeException){
                    System.out.println(e.getMessage());
                }catch (ArithmeticException){
                    System.out.println(e.getMessage());
                }finally {
                    System.out.println("Entro al finally");
                } */




                System.out.println("Resultado:" + (num2 / num1));
            }else{
                System.out.println("Opcion no valida ingrese otra opcion");
            }
        }
    }
}

/* profe lo que esta comentado son errores pero hay algo que no me cuadra un error
el codigo corre bien la division y lo sicla para seguir dividiendo y se sale cuando
quiera pero cuando coloco los errores el codigo no me corre como hago.
 */