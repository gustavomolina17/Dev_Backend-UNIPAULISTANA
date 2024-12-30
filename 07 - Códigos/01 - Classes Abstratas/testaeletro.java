package Aula_02;

public class testaeletro {

    public static void main(String[] args) {
        geladeira g1 = new geladeira("Brastemp");
        fogao f1 = new fogao("SUPER COOKTOP");

        g1.setTemperatura(4.5);
        f1.setPotencia(700);

        g1.ligar();
        f1.ligar();

        g1.exibirInfo();
        System.out.println();
        f1.exibirInfo();

        g1.desligar();
        f1.desligar();
    }
    
}
