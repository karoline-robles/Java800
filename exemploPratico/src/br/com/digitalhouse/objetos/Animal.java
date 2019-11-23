package br.com.digitalhouse.objetos;

public class Animal {

    private int idadeAnimal;
    private String nomeAnimal;
    private boolean patasAnimal;

    //Construtor padrão
    public Animal() {
    }

        //construtor especifico
    public Animal(int novaIdade){
       this.idadeAnimal = novaIdade;
    }

    public Animal(int idade, String nome){
        this.idadeAnimal = idade;
        this.nomeAnimal = nome;
    }

    public Animal (int idade, String nome, boolean patas){
        this.nomeAnimal = nome;
        this.idadeAnimal = idade;
        this.patasAnimal = patas;

    }
    public int getIdadeAnimal(){
        return this.idadeAnimal;

    }
    public String getNomeAnimal(){
        return this.nomeAnimal;
    }
    public boolean getPatasAnimal(){
        return this.patasAnimal;

    }
    //Seterrs
    public void setIdadeAnimal(int idade){
        this.idadeAnimal = idade;
    }

    public void setNomeAnimal(String nome){
        this.nomeAnimal = nome;
    }
    public void setPatasAnimal(boolean patas){
        this.patasAnimal = patas;
    }
}
