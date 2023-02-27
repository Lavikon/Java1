package set_8_dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;
import java.util.Scanner;

public class Kalenteri {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            DateTimeFormatter pvm = DateTimeFormatter.ofPattern("d.M.yyyy");
            DateTimeFormatter pv = DateTimeFormatter.ofPattern("d");

            System.out.print("Syötä vuosi: ");
            String y = scan.nextLine();
            System.out.print("Syötä kuukausi: ");
            String m = scan.nextLine();
            String a = "1." + m + "." + y;
            LocalDate b = LocalDate.parse(a, pvm);
            LocalDate c = LocalDate.parse(a, pvm);
            //Alternative: int c = Integer.parseInt(m);
            System.out.println();
            System.out.println("Ma\tTi\tKe\tTo\tPe\tLa\tSu");
            DayOfWeek d = DayOfWeek.from(b);
            while (b.getMonthValue() == c.getMonthValue()) {
                for (int i = 1; i < 7; i++) {
                    if (d.getValue() == i && b.getMonthValue() == c.getMonthValue()) {
                        if (b.getMonthValue() == c.getMonthValue()) {
                        }
                        System.out.print(b.format(pv)+"\t");
                        b = b.plusDays(1);
                        d = DayOfWeek.from(b);
                    } else {
                        System.out.print("\t");
                    }
                }
                if (b.getMonthValue() == c.getMonthValue()) {
                    System.out.println(b.format(pv)+"\t");
                    b = b.plusDays(1);
                    d = DayOfWeek.from(b);
                }
            }
        }
    }
}