package Aula_02;

public abstract class eletrodomestico {
    protected String nome;
    protected boolean ligado;

    public eletrodomestico(String nome){
        this.nome = nome;
        this.ligado = false;

    }

    public abstract void ligar();
    public abstract void desligar();
    public abstract void exibirInfo();   
    
}
