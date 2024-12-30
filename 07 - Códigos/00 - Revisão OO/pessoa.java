package Aula_01;

public class pessoa {
    private String nome; // Encapsulamento
    private int idade;

// Usamos os métodos PÚBLICOS get e set para manipular atributos privados

public void setNome(String nome){
    this.nome = nome;

}

public String getNome(){
    return this.nome;

}

public void setIdade(int idade){

    if(idade>0){

        this.idade = idade;
} else{
    System.out.println("Idade Inválida");
}

}

public int getIdade(){
    return this.idade;

}






    
}
