package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaDeNumeros {

    private List<Integer> numeros;

    public SomaDeNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    public int calcularSoma(){
        int result = 0;
        for (Integer num : numeros){
            result += num;
        }
        return result;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeros.isEmpty()){
            for (Integer maior : numeros){
                if (maior >= maiorNumero){
                    maiorNumero = maior;
                }
            }
            return maiorNumero;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if (!numeros.isEmpty()){
            for (Integer menor : numeros){
                if (menor <= menorNumero){
                    menorNumero = menor;
                }
            }
            return menorNumero;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros(){
        List<Integer> numeroList = new ArrayList<>();
        if (!numeros.isEmpty()){
                System.out.println(this.numeros);
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe SomaNumeros
        SomaDeNumeros somaDeNumeros = new SomaDeNumeros();

        // Adicionando números à lista
        somaDeNumeros.adicionarNumero(5);
        somaDeNumeros.adicionarNumero(0);
        somaDeNumeros.adicionarNumero(0);
        somaDeNumeros.adicionarNumero(-2);
        somaDeNumeros.adicionarNumero(10);

        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        somaDeNumeros.exibirNumeros();

        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + somaDeNumeros.calcularSoma());

        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + somaDeNumeros.encontrarMaiorNumero());

        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número = " + somaDeNumeros.encontrarMenorNumero());

    }
}
