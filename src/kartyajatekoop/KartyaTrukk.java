package kartyajatekoop;

import modell.Pakli;
import modell.Lap;
import java.util.Scanner;

public class KartyaTrukk {
    private Scanner sc = new Scanner(System.in);
    private Pakli pakli;

    public KartyaTrukk() {
       indit();
    }
    
    private void indit(){
        pakli = new Pakli();
        for (int i = 0; i < 3; i++) {
            kirak();
            int oszlop = melyik();
            pakli.setLapok(oszlop);
        }
        ezVolt();
    }
     private void kirak() {
        Lap[] lapok = this.pakli.getLapok();
        for (int i = 1; i < lapok.length; i++) {
            System.out.printf("%-8s", lapok[i].getLeiras());
            if (i % 3 == 0) {
                System.out.println("");
            }
        }
    }
    
    private int melyik() {
        boolean jo;
        int oszlop;
        do {
            System.out.print("melyik oszlop (1-3): ");
            oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        return oszlop;
}
}