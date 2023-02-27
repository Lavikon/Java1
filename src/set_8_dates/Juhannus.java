package set_8_dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;
import java.util.Scanner;

public class Juhannus {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            DateTimeFormatter pvm = DateTimeFormatter.ofPattern("dd.M.yyyy");

            System.out.print("Syötä vuosi: ");
            String a = scan.nextLine();
            a = "20.6." + a;
            LocalDate b = LocalDate.parse(a, pvm);
            LocalDate c = LocalDate.parse(a, pvm);
            for (int i = 0; i < 7; i++) {
                DayOfWeek d = DayOfWeek.from(b);
                if (d == DayOfWeek.SATURDAY) {
                    c = b;
                    break;
                } else {
                    b = b.plusDays(1);
                }
            }
            System.out.println("Juhannus on " + c.format(pvm) + ".");
        }
    }
}