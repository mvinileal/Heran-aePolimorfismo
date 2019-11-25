/*
 *Programação orientada a objetos
 *Professor: Orlewilson Bentes Maia
 *Data: 22/11/2019
 *Autor: Marcus Vinícius
 *Descrição: Exemplo de herança e polimorfismo 
 */

package main;

public class Gaviao  extends Animal{
    int tamanhoGarra;
    int tamanhoAsa;
    
    public Gaviao() {
        super("","");
        this.tamanhoGarra = 0;
        this.tamanhoAsa = 0;
              
}
    public int getTamanhoGarra() {
        return this.tamanhoGarra;
    }

    public void setTamanhoGarra(int tamanhoGarra) {
        this.tamanhoGarra = tamanhoGarra;
    }

    public int getTamanhoAsa() {
        return this.tamanhoAsa;
    }

    public void setTamanhoAsa(int tamanhoAsa) {
        this.tamanhoAsa = tamanhoAsa;
    }

    public void falar() {
        System.out.println("piar");
    }
    
    public void ação() {
        System.out.println("caçar...");
    }
    
}
