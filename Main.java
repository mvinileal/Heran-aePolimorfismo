/*
 *Programação orientada a objetos
 *Professor: Orlewilson Bentes Maia
 *Data: 22/11/2019
 *Autor: Marcus Vinícius
 *Descrição: Exemplo de herança e polimorfismo 
 */

package main;

public class Main {

    public static void main(String[] args) {
       Gato nick = new Gato();
       Gaviao max = new Gaviao();
       
       nick.setApelido("nick");
       nick.setCor("marrom");
       nick.setComprimento(1);
       nick.setRaca("persa");    
       nick.falar();
       nick.ação();
       
       max.setApelido("max");
       max.setCor("preto");
       max.setTamanhoAsa(200);
       max.setTamanhoGarra(10);  
       max.falar();
       max.ação();
       
    }
    
}
