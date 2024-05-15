package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, Double preco, Integer quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()){
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)){
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal(){
        double total = 0;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                total += valorItem;
            }
            return total;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens(){
        if (!itemList.isEmpty()) {
            System.out.println(itemList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "Carrinho De Compras:\n" +
                "Itens: " + itemList;
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Arroz", 6.80, 10);
        carrinhoDeCompras.adicionarItem("Feijão", 9.30, 5);
        carrinhoDeCompras.adicionarItem("Carne", 15.0, 3);
        carrinhoDeCompras.adicionarItem("Macarrão", 4.0, 7);
        System.out.println(carrinhoDeCompras);

        carrinhoDeCompras.removerItem("Feijão");
        System.out.println(carrinhoDeCompras);


        System.out.println("O valor total da compra é: "+ String.format("%.2f", carrinhoDeCompras.calcularValorTotal()));
    }
}
