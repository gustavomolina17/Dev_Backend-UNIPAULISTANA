package Aula_02;

public class furao extends animal {

    public furao(){
        this.nome = "Fernando";
        this.cor = "marrom";
        this.idade = 2;
        this.peso = 550;

    }

    @Override
    public void movimento() {
        System.out.println("O "+this.nome+" é um furão "+this.cor+" de "+this.idade+" anos que pesa "+this.peso+" gramas.");
        
    }
    
}
