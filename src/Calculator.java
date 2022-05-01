import java.util.Scanner;

public class Calculator {
    private int gcdCalc(int n1, int n2) {//ebob
        int ebob = 0;
        int counter = 0;
        if (n1 > n2) {
            counter = n2;
        } else {
            counter = n2;
        }
        while (counter > 0) {
            if (n1 % counter == 0 && n2 % counter == 0) {
                ebob = counter;
                break;
            }
            counter--;
        }
        return ebob;
    }

    private int lcmCalc(int n1, int n2) {//Ekok
        int ekok = (n1 * n2) / gcdCalc(n1, n2);
        return ekok;
    }

    public void calc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Sayıyı Giriniz : ");
        int n1 = scanner.nextInt();
        System.out.println("2.Sayıyı Giriniz : ");
        int n2 = scanner.nextInt();
        System.out.println("Ebob : " + gcdCalc(n1, n2));
        System.out.println("Ekok : " + lcmCalc(n1, n2));

    }

}
