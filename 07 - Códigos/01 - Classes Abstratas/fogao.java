package Aula_02;

public class fogao extends eletrodomestico {
    private int potencia;

    public fogao(String nome){
        super(nome);

     }
    
     @Override
     public void ligar(){
        System.out.println("Fogão " + nome + " ligado.");
        ligado = true;
     }

     @Override
     public void desligar(){
        System.out.println("Fogão " + nome + " desligado.");
        ligado = false;
     }

     @Override
     public  void exibirInfo(){


        System.out.println("Nome: "+ nome);
        System.out.println("Estado: " + (ligado ? "Ligado" : "Desligado"));
        System.out.println("Potência: " + potencia + " kW.");

     }

     public void setPotencia(int potencia){
        this.potencia = potencia;
     }



}
