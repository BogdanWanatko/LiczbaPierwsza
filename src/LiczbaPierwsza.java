import java.util.Scanner;

public class LiczbaPierwsza {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sprawdzanie, czy liczba jest liczbą pierwszą");

        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        boolean czyPierwsza = true;

        // Liczby mniejsze niż 2 nie są liczbami pierwszymi
        if (liczba < 2) {
            czyPierwsza = false;
        } else {
            // Sprawdzenie, czy liczba dzieli się bez reszty przez jakąś inną liczbę niż 1 i sama siebie
            for (int i = 2; i < liczba; i++) {
                if (liczba % i == 0) {
                    czyPierwsza = false;
                    break;
                }
            }
        }

        // Wyświetlenie wyniku
        if (czyPierwsza) {
            System.out.println("Podana liczba jest liczbą pierwszą.");
        } else {
            System.out.println("Podana liczba nie jest liczbą pierwszą.");
        }
    }

}
