/*
 *Programação orientada a objetos
 *Professor: Orlewilson Bentes Maia
 *Data: 22/11/2019
 *Autor: Marcus Vinícius
 *Descrição: Exemplo de herança e polimorfismo 
 */

package main;

public class Gato extends Animal {
    
    //atributos
    private String raca;
    private int comprimento;

 
    //construtores sem argumento
    public Gato() {
        super("","");
        this.raca = "";
        this.comprimento = 0;
        
    }
    //metódos

    public String getRaca() {
        return this.raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getComprimento() {
        return this.comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }
    
    //exemplo de sobrescrita de metódo
    public void falar() {
        System.out.println("miar");
        
    }
    
    public void ação() {
        System.out.println("pular");
    }
    
}
