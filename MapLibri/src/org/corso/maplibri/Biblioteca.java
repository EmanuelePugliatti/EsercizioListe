package org.corso.maplibri;

import java.util.*;

public class Biblioteca {
    

    public void stampaLibri(){

        Map<String, Set<Libri>> libreria = new HashMap<>();
        Set<Libri>avventura = new HashSet<>();
        Set<Libri>romantico = new HashSet<>();
        Set<Libri>storico = new HashSet<>();


        avventura.add(new Libri("Avventura"));
        romantico.add(new Libri ("Romatico"));
        storico.add(new Libri("Storico"));
        avventura.add(new Libri("Avventura"));
        storico.add(new Libri("Storico"));



        libreria.put("avventura",avventura);
        libreria.put("avventura" , avventura);
        libreria.put("romantico" , romantico);
        libreria.put("storico" , storico);
        libreria.put("storico" , storico);

        for(String l1 : libreria.keySet()){
            for(Libri item : libreria.get(l1)){
                System.out.println(libro.getGenere() + "-" + libro.getTitolo());
            }
        }

        

    }
}
