package br.com.zup;

public class exercicio6 {
    public static void main(String[] args) {
        int qtdDeHorasTrabalhadas = 30;
        int quantoGanhaPorHora = 40;
        float valorDoInss = 0.08F;
        float impostoDeRenda = 0.11F;
        float valorDoSindicato = 0.05F;

        float salarioMensal = qtdDeHorasTrabalhadas * quantoGanhaPorHora;
        float respostaInss = salarioMensal * valorDoInss;
        float respotaImpostoDeRenda = salarioMensal * impostoDeRenda;
        float respostaDoSindicato = salarioMensal * valorDoSindicato;
        float salarioBruto = salarioMensal - respotaImpostoDeRenda - respostaInss - respostaDoSindicato;

        System.out.println("Você trabalhou " + qtdDeHorasTrabalhadas + " horas e o seu salario mensal é " + salarioMensal);
        System.out.println("Se o valor mensal é " + salarioMensal + " o valor tirado para INSS será igual a " + respostaInss);
        System.out.println("O Valor retirado para o imposto de renda será equivalente a " + respotaImpostoDeRenda);
        System.out.println("E o valor retirado para o sindicato será " + respostaDoSindicato);
        System.out.println("Sendo assim o salario bruto mensal será igual a " + salarioBruto);
    }
}
