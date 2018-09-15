/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author danie
 */
public class PedidoModel {
    private int cod;
    private double preco;
    private String numNF;

    public PedidoModel(int cod, double preco, String numNF) {
        this.cod = cod;
        this.preco = preco;
        this.numNF = numNF;
    }
    public int getCod() {
        return cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String getNumNF() {
        return numNF;
    }
    public void setNumNF(String numNF) {
        this.numNF = numNF;
    }
    @Override
    public String toString() {
        return "PedidoModel{" + "cod=" + cod + ", preco=" + preco + ", numNF=" + numNF + '}';
    } 
}
