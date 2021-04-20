package org.corso.maplibri;

public class Libri {
    private String genere;
    private String titolo;

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Libri(){

    }

 public Libri(String genere){
        this.genere = genere;

    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }
}
