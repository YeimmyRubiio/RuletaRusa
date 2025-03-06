package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ruletarusa {

    private List<Integer> tambor;
    private int bala;
    private int posicionActual;
    private Random random;


    public Ruletarusa(List<Integer> tambor, int bala, int posicionActual, Random random) {
        this.tambor = tambor;
        this.bala = bala;
        this.posicionActual = posicionActual;
        this.random = random;
    }

    public Ruletarusa() {
        tambor=new ArrayList<>();
        random=new Random();
        this.bala=random.nextInt(6)+1;
        System.out.println(bala);
        this.posicionActual=random.nextInt(6)+1;
        tambor.add(0);
        tambor.add(1);
        tambor.add(2);
        tambor.add(3);
        tambor.add(4);
        tambor.add(5);
    }

    public List<Integer> getTambor() {
        return tambor;
    }

    public void setTambor(List<Integer> tambor) {
        this.tambor = tambor;
    }

    public int getBala() {
        return bala;
    }

    public void setBala(int bala) {
        this.bala = bala;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public Random getRandom() {
        return random;

    }

    public void setRandom(Random random) {
        this.random = random;
    }

    @Override
    public String toString() {
        return "Ruletarusa{" +
                "tambor=" + tambor +
                ", bala=" + bala +
                ", posicionActual=" + posicionActual +
                ", random=" + random +
                '}';
    }

    public boolean disparar() {

        if(this.posicionActual==this.bala) {
            return true;
            }

        else{
            if(posicionActual==6){
                this.posicionActual=0;
            }
            this.posicionActual=this.posicionActual+1;
            return false;
        }
    }

    public void reiniciarJuego(){

        this.bala=random.nextInt(6)+1;
        this.posicionActual=random.nextInt(6)+1;
    }
}
