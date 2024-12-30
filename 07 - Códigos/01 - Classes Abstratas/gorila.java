package Aula_02;

public class gorila extends animal  {

    public gorila(){
        this.nome = "King Kong";
        this.cor = "preto";
        this.idade = 40;
        this.peso = 6;

    }

    @Override
    public void movimento() {
        System.out.println("O "+this.nome+" é um gorila "+this.cor+" de "+this.idade+" anos que pesa "+this.peso+" toneladas.");
        
    }
    
}
