package Aula_01;

public class testavingadores {

    public static void main(String[] args) {
        vingadores HomemDeFerro = new vingadores();
        HomemDeFerro.nome = "Tony Stark";
        HomemDeFerro.sexo = "Masculino";
        HomemDeFerro.habilidade = "Gênio Bilionário Filantrópico P*** das Galáxias ";
        HomemDeFerro.idade = 42;
        HomemDeFerro.altura = 1.82;

        vingadores CapitaoAmerica = new vingadores();
        CapitaoAmerica.nome = "Steve Rogers";
        CapitaoAmerica.sexo = "Masculino";
        CapitaoAmerica.habilidade = "Lançar escudo";
        CapitaoAmerica.idade = 94;
        CapitaoAmerica.altura = 1.78;

        HomemDeFerro.correr();
        HomemDeFerro.destruir();
        CapitaoAmerica.salvar();
        System.out.println("O CA tem: "+CapitaoAmerica.idade);
        System.out.println("O nome do vingador é:"+" "+HomemDeFerro.nome);



    }
    
}
