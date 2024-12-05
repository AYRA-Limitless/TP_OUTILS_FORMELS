package TP_OUTILS_FOMELS;

class Etat {

     String PW;
     int Carte;
     static int Compteur;

    public Etat(int carte,String PW) {
        this.PW = PW;
        Carte = carte;
    }

    public void Etat_initial(){
        System.out.println("Etat initial");
    }

    public void Accept(){
        if (Carte==13254 && PW.equals("YHWH")){
            System.out.println("Accès accordé");
        }
    }

    public void Refuse(){
        if (Carte!=13254||!PW.equals("YHWH")){
            System.out.println("Accès refusé");
            Compteur++;
        }

    }
    public void Alarme(){
        if(Compteur>3){
            for(int i=0;i<=7;i++){
                System.out.println("ALARME DECLENCHÉ");
            }
        }

    }


}

