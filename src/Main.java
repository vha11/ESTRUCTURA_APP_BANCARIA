import java.util.Scanner;


public class Main {
    static Scanner keyboard = new Scanner(System.in);
    static double SaldoDisponible = 1600.50;
    static String NombreUsuario = "Victor Mendoza";


    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        int numOpcion=0;
        do {
            System.out.println("__________________________________________");
            System.out.println("                   MENU");
            System.out.println(" 1. Consultar saldo");
            System.out.println(" 2. Retirar");
            System.out.println(" 3. Depositar");
            System.out.println(" 4. Salir");
            System.out.println("__________________________________________");
            System.out.print(" Introduce el número de la opción deseada: ");
            numOpcion = keyboard.nextInt();
            System.out.println("__________________________________________");
            switch (numOpcion) {
                case 1:
                    ConsultaDeSaldo(SaldoDisponible);
                    clearScreen();
                    break;
                case 2:
                    SaldoDisponible=Retirar(SaldoDisponible);
                    clearScreen();
                    break;
                case 3:
                    SaldoDisponible=Depositar(SaldoDisponible);
                    clearScreen();
                    break;
                case 4:
                    System.out.println(NombreUsuario+" gracias por usar nuestros servicios");
                    //System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }while(numOpcion!=4);
    }

    public static void ConsultaDeSaldo(double Saldo){
        System.out.println("Bienvenido(a):"+NombreUsuario+"\nSaldo Disponible: $"+Saldo);
        //return Saldo;
    }

    public static double Retirar(double Saldo){
        //double SaldoConRetiro=0;
        System.out.print("Introduce el monto a retir: ");
        double MontoARetirar = keyboard.nextDouble();
        if(MontoARetirar>Saldo){
            System.out.println("Opcion Invalida, no cuentas con el saldo suficiente tu saldo es de: $"+Saldo);

        }else{
            Saldo=Saldo-MontoARetirar;
            System.out.println(NombreUsuario+"tu saldo actual es de: $"+Saldo);
        }
        return Saldo;
    }

    public static double Depositar(double Saldo){
        //double SaldoConDeposito=0;
        System.out.print("Introduce el monto a depositar: ");
        double MontoDelDeposito = keyboard.nextDouble();
        Saldo=Saldo+MontoDelDeposito;
        System.out.println(NombreUsuario+"tu saldo actual es de: $"+Saldo);
        return Saldo;
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}