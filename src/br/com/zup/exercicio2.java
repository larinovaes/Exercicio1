package br.com.zup;

public class exercicio2 {
    public static void main(String[] args) {

        //Definindo notas
        int primeiraNota = 10;
        float segundaNota = 8.7F;
        float terceiraNota = 7.6F;
        int quartaNota = 10;

        //respondendo a pergunta
        float soma = primeiraNota + segundaNota + terceiraNota + quartaNota;
        float resultadoFinal = soma /5;

        System.out.println("As suas notas durante o bimestre foram " + primeiraNota);
        System.out.println(segundaNota);
        System.out.println(terceiraNota);
        System.out.println(quartaNota +" e sua media final será " + resultadoFinal);
    }
}
