
package nezet;

import java.util.Scanner;

public class CuiNezet {
    
    private static final Scanner SC = new Scanner(System.in);
    public static final String SEP = System.lineSeparator();
    
    public void konzolraIr(String szoveg) {
        System.out.print(szoveg);
    }
    
    public void leirasMegjelenito(String msg) {
        this.konzolraIr(msg + CuiNezet.SEP);
    }
    
    public void feladatMegjelenito(String msg) {
        this.konzolraIr(msg);
    }
    
    public int valasztasBeker(String msg) {
        int szam;
        
        do {
            this.konzolraIr(msg);
            szam = SC.nextInt();
        } while(szam < 0 || szam > 2);
        return szam;
    }
    
    public void eredmenyMegjelenit(String msg) {
        this.konzolraIr(msg + CuiNezet.SEP);
    }
}
