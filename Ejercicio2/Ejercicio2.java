import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[] args){
        System.out.println("1. Anda con la bicicleta");
        System.out.println("2. Haz el caballito");
        System.out.println("3. Anda con el coche");
        System.out.println("4. Quema rueda");
        System.out.println("5. Kms Bicicleta");
        System.out.println("6. Kms Coche");
        System.out.println("7. Kms totales");
        System.out.println("8. Salir");

        Scanner sc = new Scanner(System.in);
        Vehiculo v = new Vehiculo();
        Bicicleta b = new Bicicleta(2);
        Coche c = new Coche(0);
        boolean salir = false;
        do {
            int opcion = sc.nextInt();
            switch(opcion){
                case 1:{
                    System.out.print("Estoy dando una vuelta con la bicicleta");
                }
                break;
                case 2:{
                    b.caballito();
                }
                break;
                case 3:{
                    System.out.print("Estoy dando una vuelta con el coche");
                }
                break;
                case 4:{
                    System.out.print("Estoy quemando rueda");
                }
                break;
                case 5:{
                    System.out.print("¿Cuántos kms?");
                    int kms = sc.nextInt();
                    b.recorre(kms);
                }
                break;
                case 6:{
                    System.out.print("¿Cuántos kms?");
                    int kms = sc.nextInt();
                    c.recorre(kms);
                }
                break;
                case 7:{
                    int kms = sc.nextInt();
                    v.recorre(kms);
                }
                break;
                case 8:
                    salir = true;
                break;
                default:
                System.out.println("Opción incorrecta");
            }
        } while(!salir);
        sc.close();
    }
}