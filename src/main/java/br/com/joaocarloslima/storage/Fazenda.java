package br.com.joaocarloslima.storage;

import java.util.ArrayList;
import java.util.List;

import br.com.joaocarloslima.model.Batata;
import br.com.joaocarloslima.model.Cenoura;
import br.com.joaocarloslima.model.Morango;

import br.com.joaocarloslima.utils.Utils;

public class Fazenda {
    private List<Terreno> terrenos = new ArrayList<>();
    private Celeiro celeiro = new Celeiro();

    public Fazenda() {
        for (int x = 0; x < 13; x++) {
            for (int y = 0; y < 13; y++) {
                terrenos.add(new Terreno(x, y));
            }
        }
    }


    public void plantarBatata(int x, int y) {
        try {
            if (celeiro.getQtdeBatatas() <= 0) {
                Utils.exibirAlerta("Ops!", "Não temos batatas suficientes para plantar.");
                return;
            }
            if (terrenos.get(x * 13 + y).estaOcupado()) {
                Utils.exibirAlerta("Opa!", "Esse terreno já está ocupado. Tente outro!");
                return;
            }
            terrenos.get(x * 13 + y).plantarBatata(new Batata());
            celeiro.consumirBatata();
        } catch (Exception e) {
            Utils.exibirErro("Que pena!", "Algo não saiu como esperado. Vamos tentar de novo?");
        }
    }

    public void plantarCenoura(int x, int y) {
        try {
            if (celeiro.getQtdeCenouras() <= 0) {
                Utils.exibirAlerta("Ops!", "Não temos cenouras suficientes para plantar.");
                return;
            }
            if (terrenos.get(x * 13 + y).estaOcupado()) {
                Utils.exibirAlerta("Opa!", "Esse terreno já está ocupado. Tente outro!");
                return;
            }
            terrenos.get(x * 13 + y).plantarCenoura(new Cenoura());
            celeiro.consumirCenoura();
        } catch (Exception e) {
            Utils.exibirErro("Que pena!", "Algo não saiu como esperado. Vamos tentar de novo?");
        }
    }

    public void plantarMorango(int x, int y) {
        try {
            if (celeiro.getQtdeMorangos() <= 0) {
                Utils.exibirAlerta("Ops!", "Não temos morangos suficientes para plantar.");
                return;
            }
            if (terrenos.get(x * 13 + y).estaOcupado()) {
                Utils.exibirAlerta("Opa!", "Esse terreno já está ocupado. Tente outro!");
                return;
            }
            terrenos.get(x * 13 + y).plantarMorango(new Morango());
            celeiro.consumirMorango();
        } catch (Exception e) {
            Utils.exibirAlerta("Que pena!", "Algo não saiu como esperado. Vamos tentar de novo?");
        }
    }

    public void colher(int x, int y) {
        Terreno terreno = terrenos.get(x * 13 + y);
        if (terreno.podeColher()) {
            terreno.colher(celeiro);
            terreno.consumir();
        } else {
            Utils.exibirAlerta("Ops!",  "Ainda não é hora de colher.");
        }
    }

    public Celeiro getCeleiro() {
        return celeiro;
    }

    public Terreno getTerreno(int x, int y) {
        return terrenos.get(x * 13 + y);
    }
}
