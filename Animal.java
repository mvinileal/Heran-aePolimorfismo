/*
 *Programação orientada a objetos
 *Professor: Orlewilson Bentes Maia
 *Data: 22/11/2019
 *Autor: Marcus Vinícius
 *Descrição: Exemplo de herança e polimorfismo 
 */

package main;

public class Animal {
    //atributos
    private String cor;
    private String apelido;
    
    //construtores com argumento
    public Animal(String cor, String apelido) {
        this.cor = cor;
        this.apelido = apelido;
    }

    //metódos
    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getApelido() {
        return this.apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }  
    
    public void falar() {
        System.out.println("Falar algo...");
    }
    
    public void ação() {
        System.out.println("fazer algo...");
        
    }
     
}

