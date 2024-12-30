package Aula_02;

public class geladeira extends eletrodomestico {
    private double temperatura;

     public geladeira(String nome){
        super(nome);

     }

     @Override
     public void ligar(){
        System.out.println("Geladeira "+ nome + " ligada.");
        ligado = true;
     }

     @Override
     public void desligar(){
        System.out.println("Geladeira "+ nome + " desligada.");
        ligado = false;
     }

     @Override
     public  void exibirInfo(){


        System.out.println("Nome: "+ nome);
        System.out.println("Estado: " + (ligado ? "Ligado" : "Desligado"));
        System.out.println("Temperatura: " + temperatura + " °C.");

     }

     public void setTemperatura(double temperatura){
        this.temperatura = temperatura;
     }
    
}
