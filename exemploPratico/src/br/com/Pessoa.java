package br.com;

import br.com.digitalhouse.objetos.Animal;

public class Pessoa {
    private Animal animalDosmestico;
    public Animal getAnimalDosmestico(){
        return this.animalDosmestico;
    }
    public void setAnimalDosmestico(Animal novoAnimal){
        this.animalDosmestico = novoAnimal;
    }
}
