package org.corso.macchinacilindrata;

import java.util.ArrayList;
import java.util.List;

public class ListaMacchine {

    public void stampaMacchine(){
List <Macchina> macchina = new ArrayList<>();
Macchina macchina1 = new Macchina("Il modello della macchina è Fiat, l'anno e la cilindrata della macchina sono " , 2001,500);
Macchina macchina2 = new Macchina("Il modello della macchina è Alfaromeo, l'anno e  la cilindrata della macchina sono " , 2001,1400);
Macchina macchina3 = new Macchina("Il modello della macchina è Audi, l'anno e la cilindrata della macchina sono " , 2005,1400);
Macchina macchina4 = new Macchina("Il modello della macchina è Ferrari, l'anno e la cilindrata della macchina sono:" , 2005,1400);
Macchina macchina5 = new Macchina("Il modello della macchina è 500, l'anno e la cilindrata della macchina sono:" , 2005,500);

macchina.add(macchina1);
macchina.add(macchina2);
macchina.add(macchina3);
macchina.add(macchina4);
macchina.add(macchina5);

        
        for( Macchina item : macchina){
            System.out.println(item.getModello());
            System.out.println(item.getAnno());
            System.out.println(item.getCilindrata());
        }

       System.out.println("");
       System.out.println("");
       System.out.println("");

        macchina.remove(macchina1);
        macchina.remove(macchina5);
        for( Macchina item : macchina){
            System.out.println(item.getModello());
            System.out.println(item.getAnno());
            System.out.println(item.getCilindrata());
        }

    }

  
    
}

