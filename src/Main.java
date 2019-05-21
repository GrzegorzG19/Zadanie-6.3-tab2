import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] tab = new int[5];
        System.out.println("wpisz 5 liczb");
        tab[0] = scan.nextInt();
        tab[1] = scan.nextInt();
        tab[2] = scan.nextInt();
        tab[3] = scan.nextInt();
        tab[4] = scan.nextInt();

        System.out.println("suma liczby w kolejności 1 3 5");
        System.out.printf("%d",tab[0]+tab[2]+tab[4]);
    }
}