package br.com.joaocarloslima.storage;

import br.com.joaocarloslima.utils.Utils;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Celeiro {
    private int capacidade = 250;
    private int qtdeBatatas = 10;
    private int qtdeCenouras = 10;
    private int qtdeMorangos = 20;


    private void armazenarProduto(String produto) throws Exception {
        if (capacidade <= 0) {
            throw new Exception("Celeiro cheio!");
        }

        switch (produto) {
            case "batata":
                qtdeBatatas += 2;
                break;
            case "cenoura":
                qtdeCenouras += 2;
                break;
            case "morango":
                qtdeMorangos += 2;
                break;
            default:
                throw new Exception("Produto desconhecido!");
        }
        capacidade -= 2;
    }


    private void consumirProduto(String produto) throws Exception {
        switch (produto) {
            case "batata":
                if (qtdeBatatas <= 0) {
                    throw new Exception("Não há nenhuma batata!");
                }
                qtdeBatatas--;
                break;
            case "cenoura":
                if (qtdeCenouras <= 0) {
                    throw new Exception("Não há nenhuma cenoura!");
                }
                qtdeCenouras--;
                break;
            case "morango":
                if (qtdeMorangos <= 0) {
                    throw new Exception("Não há nenhum morango!");
                }
                qtdeMorangos--;
                break;
            default:
                throw new Exception("Produto desconhecido!");
        }
        capacidade++;
    }


    public void armazenarBatata() {
        try {
            armazenarProduto("batata");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void armazenarCenoura() {
        try {
            armazenarProduto("cenoura");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void armazenarMorango() {
        try {
            armazenarProduto("morango");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public void consumirBatata() {
        try {
            consumirProduto("batata");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void consumirCenoura() {
        try {
            consumirProduto("cenoura");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void consumirMorango() {
        try {
            consumirProduto("morango");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public int getEspacoDisponivel() {
        return capacidade;
    }

    public int getOcupacao() {
        return (int) ((getEspacoDisponivel() / (double) 250) * 100);
    }

    public boolean celeiroCheio() {
        return capacidade <= 0;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getQtdeBatatas() {
        return qtdeBatatas;
    }

    public int getQtdeCenouras() {
        return qtdeCenouras;
    }

    public int getQtdeMorangos() {
        return qtdeMorangos;
    }
}
