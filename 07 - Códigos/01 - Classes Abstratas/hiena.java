package Aula_02;

public class hiena extends animal {

    public hiena(){
        this.nome = "Banzai";
        this.cor = "cinza escuro";
        this.idade = 15;
        this.peso = 60;

    }

    @Override
    public void movimento() {
        System.out.println("O "+this.nome+" é uma hiena "+this.cor+" de "+this.idade+" anos que pesa "+this.peso+" quilos.");
        
    }
    
}
