
package main;

import model.Lada;
import nezet.CuiNezet;


public class LogikaiProgram {

    public static void main(String[] args) {
        Lada[] ladak = new Lada[]{new Lada("arany", "Én rejtem a kincset!", false), // h
                        new Lada("ezüst", "Nem én rejtem a kincset!", true), //h kincs
                        new Lada("bronz", "Az arany hazudik!", false)}; //i
        
        CuiNezet nezet = new CuiNezet();
        
        nezet.feladatMegjelenito("Csak 1 igaz!");
        String msg = "";
        
        for (Lada lada : ladak) {
            msg += "%s: %s\n".formatted(lada.getAnyag(), lada.getFelirat());
        }
        nezet.feladatMegjelenito(msg);
        
        Lada valasztott = ladak[nezet.valasztasBeker("melyik (0..2):")];
        
        nezet.eredmenyMegjelenit(valasztott.isKincs() ? "Eltaláltad!" : "Nem tallt, a kincset nem a(z) %s rejti.".formatted(valasztott.getAnyag()));
    }
    
}
