import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Che prodotto vuoi aggiungere ?");
        String item = scan.next();

        if (item.equalsIgnoreCase("Smartphone")){
            Smartphone phone = new Smartphone();
            System.out.println("Inserisci la memoria del telefono: ");
            phone.setMemoria(scan.nextInt());
            System.out.println("Inserisci codice IMEI del telefono: ");
            phone.setCodiceImei(scan.nextInt());
            System.out.println(phone.toString());
        } else if (item.equalsIgnoreCase("Televisore")) {
            Televisore tel = new Televisore();
        } else if (item.equalsIgnoreCase("Cuffie")) {
            Cuffie cuffie = new Cuffie();
        }
    }
}
