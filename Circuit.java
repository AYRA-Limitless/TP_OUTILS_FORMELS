package TP_OUTILS_FOMELS;

public class Circuit {
    public static boolean AND(int Carte,String PW){
        boolean E_1=false;
        if (Carte==13254 && PW.equals("YHWH")){
            E_1=true;
        }
        else{
            E_1=false;
        }
        return E_1;
    }
}
