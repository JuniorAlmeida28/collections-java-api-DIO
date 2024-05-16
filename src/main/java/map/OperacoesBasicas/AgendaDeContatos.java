package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaDeContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaDeContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }else{
            throw new RuntimeException("A agenda de contatos está vazia.");
        }
    }

    public void exibirContatos(){
        if (!agendaContatoMap.isEmpty()){
            System.out.println(agendaContatoMap);
        }else{
            throw new RuntimeException("A agenda de contatos está vazia.");
        }
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
            if (numeroPorNome == null){
                System.out.println("Contato não encontrado na agenda.");
            }
        }else{
            throw new RuntimeException("A agenda de contatos está vazia.");
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaDeContatos agendaDeContatos = new AgendaDeContatos();

        // Adicionar contatos
        agendaDeContatos.adicionarContato("Camila", 123456);
        agendaDeContatos.adicionarContato("João", 5665);
        agendaDeContatos.adicionarContato("Carlos", 1111111);
        agendaDeContatos.adicionarContato("Ana", 654987);
        agendaDeContatos.adicionarContato("Maria", 1111111);
        agendaDeContatos.adicionarContato("Camila", 44444);

        agendaDeContatos.exibirContatos();

        // Remover um contato
        agendaDeContatos.removerContato("Maria");
        agendaDeContatos.exibirContatos();

        // Pesquisar número por nome
        String nomePesquisa = "João";
        Integer numeroPesquisa = agendaDeContatos.pesquisarPorNome("João");
        System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

        String nomePesquisaNaoExistente = "Paula";
        Integer numeroPesquisaNaoExistente = agendaDeContatos.pesquisarPorNome(nomePesquisaNaoExistente);
        System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);

    }
}
