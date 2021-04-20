package org.corso.macchinacilindrata;

public class Macchina {
    private String modello;
    private int anno;
    private int cilindrata;


    public Macchina(){


    }
    public Macchina (String modello,int anno,int cilindrata){
        this.modello = modello;
        this.anno = anno;
        this.cilindrata = cilindrata;

    }
    public String getModello() {
        return modello;
    }
    public void setModello(String modello) {
        this.modello = modello;
    }
    public int getAnno() {
        return anno;
    }
    public void setAnno(int anno) {
        this.anno = anno;
    }
    public int getCilindrata() {
        return cilindrata;
    }
    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }
    
}
