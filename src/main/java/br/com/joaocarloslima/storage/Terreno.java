package br.com.joaocarloslima.storage;

import br.com.joaocarloslima.model.Batata;
import br.com.joaocarloslima.model.Cenoura;
import br.com.joaocarloslima.model.Morango;

public class Terreno {
    private int x;
    private int y;
    private Batata batata;
    private Cenoura cenoura;
    private Morango morango;

    public Terreno(int x, int y) {
        this.x = x;
        this.y = y;
        this.batata = null;
        this.cenoura = null;
        this.morango = null;
    }


    public void plantarBatata(Batata batata) {
        this.batata = batata;
        this.cenoura = null;
        this.morango = null;
    }

    public void plantarCenoura(Cenoura cenoura) {
        this.cenoura = cenoura;
        this.batata = null;
        this.morango = null;
    }

    public void plantarMorango(Morango morango) {
        this.morango = morango;
        this.batata = null;
        this.cenoura = null;
    }


    public boolean estaOcupado() {
        return batata != null || cenoura != null || morango != null;
    }


    public boolean podeColher() {
        if (batata != null && batata.podeColher()) {
            return true;
        }
        if (cenoura != null && cenoura.podeColher()) {
            return true;
        }
        if (morango != null && morango.podeColher()) {
            return true;
        }
        return false;
    }


    public void colher(Celeiro celeiro) {
        if (batata != null && batata.podeColher()) {
            celeiro.armazenarBatata();
            batata = null;  // Após colher, o terreno fica vazio
        } else if (cenoura != null && cenoura.podeColher()) {
            celeiro.armazenarCenoura();
            cenoura = null;
        } else if (morango != null && morango.podeColher()) {
            celeiro.armazenarMorango();
            morango = null;
        }
    }


    public void consumir() {
        batata = null;
        cenoura = null;
        morango = null;
    }


    public Batata getBatata() {
        return batata;
    }

    public Cenoura getCenoura() {
        return cenoura;
    }

    public Morango getMorango() {
        return morango;
    }
}
