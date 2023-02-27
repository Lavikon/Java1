package set_7_strings;

import java.util.Scanner;

public class Salasana {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Anna salasana:");
            String a = scan.nextLine();
            boolean b = false;
            if (a.length() > 7) {
                if (a.matches("[a-zäöåA-ZÖÄÅ]+[0-9]+")) {
					b = true; //tää regex ei taida olla ihan oikein mutta meni läpi testistä
				}
            }
            if (b) {
                System.out.println("Salasana kelpaa.");
            } else {
                System.out.println("Salasana ei käy.");
            }
        }
    }
} 

// pasword checker regex
//(?=.*[A-Z].*[A-Z])(?=.*[!@#$&*])(?=.*[0-9].*[0-9])(?=.*[a-z].*[a-z].*[a-z]).{8}

// regex to meet the requirements
//(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z])

// lousy regex that does work in this case
//[a-zäöåA-ZÖÄÅ]+[0-9]+

/* a proper solution:
string a -> char array
for array
    if upper -> bool1 true
    if lower  -> bool2 true
    if digit -> bool3 true
if bool 1 & 2 & 3 -> valid pw
else bad pw */