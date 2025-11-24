import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String inputKehittaja1="";
        System.out.println("Kuka kehittäjistä olet?");
        inputKehittaja1= in.nextLine();

        System.out.println("Hei "+ inputKehittaja1 + ", tervetuloa projektiin!");

        System.out.println("Mikä on lempiharrastuksesi?");
        String inputHarrastus1= in.nextLine();  

        System.out.println( " Vau, "+ inputHarrastus1 + " kuulostaa mukavalta harrastukselta!");
        System.out.println("Arvioi harrastuksesi vaikeustasoa yhdestä kymppiin :D (1-10):");
        int vaikeustaso = in.nextInt();
        in.nextLine();
        if (vaikeustaso >= 1 && vaikeustaso <= 3) {
            System.out.println("Harrastuksesi on melko helppo.");
        } else if (vaikeustaso >= 4 && vaikeustaso <= 7) {
            System.out.println("Harrastuksesi kuulostaa vaikealta.");
        } else if (vaikeustaso >= 8 && vaikeustaso <= 10) {
            System.out.println("Harrastuksesi kuulostaa erittäin haastavalta!");
        } else {
            System.out.println("Et kirjoittanut lukua 1-10 väliltä...lol.");
        }
    }
}