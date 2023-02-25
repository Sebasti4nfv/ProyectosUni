import java.util.Scanner;
class main
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese las horas trabajadas: ");
            int horas = sc.nextInt();

            obrero o = new obrero(horas);
            System.out.println("El pago recibido va a ser de: " + o.opPago());
        }
    }
}