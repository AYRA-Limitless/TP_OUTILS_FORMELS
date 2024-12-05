package TP_OUTILS_FOMELS;
import java.util.Scanner;

import java.time.InstantSource;

public class Automate {
    public static void Transition(int Carte, String PW){
        Etat etat= new Etat(Carte,PW);

        if (Carte==13254 && PW.equals("YHWH")){
            etat.Etat_initial();
            etat.Accept();
        }
        else{
            etat.Etat_initial();
            etat.Refuse();
        }

    }
}

