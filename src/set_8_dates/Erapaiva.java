package set_8_dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Erapaiva {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            DateTimeFormatter pvm = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            System.out.print("Anna laskun päivämäärä (vvvv-kk-pp): ");
            String a = scan.nextLine();
            LocalDate pvm1 = LocalDate.parse(a, pvm);
            LocalDate pvm2 = pvm1.plusDays(14);

            System.out.println("Eräpäivä on " + pvm2);
        }
    }
}