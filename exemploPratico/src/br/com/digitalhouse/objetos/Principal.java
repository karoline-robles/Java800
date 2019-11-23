package br.com.digitalhouse.objetos;

import java.awt.*;

public class Principal {

    public static void main(String[] args){

        Animal animalMamifero = new Animal(10);
        Animal animalDomestico = new Animal(3);
        Animal animalSelvagem = new Animal(12, "Floquinho",true);
        Animal gatos = new Animal(1, "Neko",true);

        //mudar idade
        animalMamifero.setNomeAnimal("Floqui");
        System.out.print("Animal doméstico "+ animalDomestico.getNomeAnimal());
    }
    Animal cachorroBidu = new Animal();

}

