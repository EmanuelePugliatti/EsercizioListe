package org.corso.macchina;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaMacchine {

    ListaMacchine listamacchine = new ListaMacchine();

    public void stampaMacchine(){
List <Macchina> macchina = new ArrayList<>();
Macchina macchina1 = new Macchina("Il modello della macchina è Fiat, l'anno della macchina è " , 2001);
Macchina macchina2 = new Macchina("Il modello della macchina è Alfaromeo, l'anno della macchina è " , 2001);
Macchina macchina3 = new Macchina("Il modello della macchina è Audi, l'anno della macchina è " , 2005);
Macchina macchina4 = new Macchina("Il modello della macchina è Ferrari, l'anno della macchina è " , 2005);
Macchina macchina5 = new Macchina("Il modello della macchina è 500, l'anno della macchina è " , 2005);

macchina.add(macchina1);
macchina.add(macchina2);
macchina.add(macchina3);
macchina.add(macchina4);
macchina.add(macchina5);

        
        for( Macchina item : macchina){
            System.out.println(item.getModello());
            System.out.println(item.getAnno());
        }

       System.out.println("");
       System.out.println("");
       System.out.println("");

        macchina.remove(macchina1);
        macchina.remove(macchina2);
        for( Macchina item : macchina){
            System.out.println(item.getModello());
            System.out.println(item.getAnno());
        }

    }

}

/*
public void Stampa2005(List<Macchina> listamacchine){
    Iterator<Macchina> iter = ListaMacchine.iterator();
    while(iter.hasNext()){
        Macchina item = iter.next();
        if(item.getAnno() == 2001){
            item.remove();
        }
    }
System.out.println("Modello  "+item.getModello() + " anno " + item.getAnno());

}
    }
*/
  
    

