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
public class Pedido {
    private String desc;
    private double cod;
    private double preco;
    private String numNF;

    public Pedido(double cod, double preco, String numNF, String desc) {
        this.cod = cod;
        this.preco = preco;
        this.numNF = numNF;
        this.desc = desc;
    }
    public double getCod() {
        return cod;
    }
    public void setCod(double cod) {
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
}
