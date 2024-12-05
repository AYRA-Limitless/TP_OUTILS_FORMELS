import TP_OUTILS_FOMELS.Automate;
import TP_OUTILS_FOMELS.Circuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Veuillez entrer votre carte");
            int Carte= sc.nextInt();
            System.out.println("Veuillez entrer votre Mot de Passe");
            String MDP= sc.next();
            Automate.Transition(Carte,MDP);
            System.out.println(Circuit.AND(Carte,MDP));
    }
}