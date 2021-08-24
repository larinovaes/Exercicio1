package br.com.zup;

public class exercicio4 {
        public static void main(String[] args) {

            //armazenou dos dois dados para o processamento
            int qtdDeHorasTrabalhadas = 40;
            float salarioPorHora = 45.7F;

            //Clacular o salario bruto
            float salarioBruto = qtdDeHorasTrabalhadas * salarioPorHora;

            System.out.println("Você trabalhou " +qtdDeHorasTrabalhadas + "horas, e você recebeu "  + salarioPorHora);
            System.out.println("Portanto seu salario mensal será:" + salarioBruto);
        }
    }


