import java.sql.SQLOutput;
import java.util.Scanner;

public class CashRegister {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int option, counter = 0;

        do {
            System.out.println(
                "\n---- MENU SUPER FOOD -----" +
                "\n--------🍔🍕🥤🍗---------"  +
                "\n(1). Pollo teriyaki... $60" +
                "\n(2). Hamburguesa ..... $50" +
                "\n(3). Calabaza cream... $35" +
                "\n(4). Yuca Dulce....... $25" +
                "\n(5). Papas fritas..... $20" +
                "\n(6). Bebida gaseosa... $15" +
                "\n(7). Salir del manu"
            );
            option = scanner.nextInt();

            switch (option) {
                case 1 -> counter += 60;
                case 2 -> counter += 50;
                case 3 -> counter += 35;
                case 4 -> counter += 25;
                case 5 -> counter += 20;
                case 6 -> counter += 15;
                default -> System.out.println("Opción no valida!!");
            }
        } while(option != 7);

        System.out.println(
           "---------------------" +
           "\nLista tu orden ✔️" +
           "\nTotal a pagar = $" + counter +
           "\n--------------------"
        );

        System.out.printf("💵 Ingresa el dinero para pagar $");
        int customerMoney = scanner.nextInt();

        System.out.println(
            "---------------------" +
            "\nFactura de Venta 📄" +
            "\nTotal a pagar = $" + counter +
            "\nMonto ingresado $" + customerMoney +
            "\nCambio $" + (customerMoney - counter) +
            "\n--------------------"
        );


    }
}
