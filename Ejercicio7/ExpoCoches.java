import java.util.Scanner;
public class ExpoCoches{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Zona principal = new Zona(1000);
        Zona compraventa = new Zona(200);
        Zona vip = new Zona(25);

        int opcion = 0;
        int opt = 0;
        int n = 0;

        do{
            System.out.println("1. Mostrar número de entradas disponibles");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir");
            System.out.println("Seleccione una opción de las mostradas: ");
            opcion = sc.nextInt();
            System.out.println();

            if (opcion < 1 || opcion > 3){
                System.out.println("Opción no válida. Por favor, indique una de las opciones mostradas.");
            }

            if (opcion == 1){
                System.out.println("Para la zona principal quedan " + principal.getEntradasPorVender() + " entradas disponibles.");
                System.out.println("Para la zona de compra-venta quedan " + compraventa.getEntradasPorVender() + " entradas disponibles.");
                System.out.println("Para la zona vip quedan " + vip.getEntradasPorVender() + " entradas disponibles.");
                System.out.println();
            }

            if (opcion == 2){
                System.out.println("1. Zona principal");
                System.out.println("2. Zona de compra-venta");
                System.out.println("3. Zona vip");
                System.out.println("Elija la zona deseada: ");
                opt = sc.nextInt();
                System.out.println();
                if (opt < 1 || opt > 3){
                    System.out.println("Opción no válida. Por favor, indique una de las opciones mostradas.");
                } else {
                    System.out.println("¿Cuántas entradas quiere comprar? ");
                    n = sc.nextInt();
                    System.out.println();
                    switch(opt){
                        case 1:
                            if (n <= principal.getEntradasPorVender()){
                                principal.vender(n);
                                System.out.println("Ha comprado " + n + " entradas de la zona principal. Gracias por su compra.");
                            } else {
                                principal.vender(n);
                            }
                            System.out.println();
                        break;
                        
                        case 2:
                            if (n <= compraventa.getEntradasPorVender()){
                                compraventa.vender(n);
                                System.out.println("Ha comprado " + n + " entradas de la zona de compra-venta. Gracias por su compra.");
                            } else {
                                compraventa.vender(n);
                            }
                            System.out.println();
                        break;

                        case 3:
                            if (n <= vip.getEntradasPorVender()){
                                vip.vender(n);
                                System.out.println("Ha comprado " + n + " entradas de la zona vip. Gracias por su compra.");
                            } else {
                                vip.vender(n);
                            }
                            System.out.println();
                        break;

                        default:
                    }
                }
            }
        } while (opcion != 3);
        sc.close();
    }
}