package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }
    public void adicionarAluno(Long matricula, String nome, double media){
        alunosSet.add(new Aluno(matricula, nome, media));
    }
    public void removerAluno(long matricula){
        Aluno alunoParaRemover = null;
        if (!alunosSet.isEmpty()){
            for (Aluno a : alunosSet){
                if (a.getMatricula() == matricula){
                    alunoParaRemover = a;
                    break;
                }
            }
            alunosSet.remove(alunoParaRemover);
        }else {
            throw new RuntimeException("O conjunto está vazia!");
        }
        if (alunoParaRemover == null) {
            System.out.println("Matricula não encontrada!");
        }
    }
    public void exibirAlunosPorNome(){
        Set<Aluno> alunoPorNome = new TreeSet<>(alunosSet);
        if (!alunosSet.isEmpty()){
            System.out.println(alunoPorNome);
        }else {
            System.out.println("O conjunto está vazia!");
        }
    }
    public void exibirAlunosPorNota(){
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorNota());
        if (!alunosSet.isEmpty()){
            alunoPorNota.addAll(alunosSet);
            System.out.println(alunoPorNota);
        }else {
            System.out.println("O conjunto está vazia!");
        }
    }
    public void exibirAlunos(){
        System.out.println(alunosSet);
    }

    public static void main(String[] args) {
        // Criando uma instância do GerenciadorAlunos
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        // Adicionando alunos ao gerenciador
        gerenciadorAlunos.adicionarAluno(123456L, "João", 7.5);
        gerenciadorAlunos.adicionarAluno(123457L, "Maria", 9.0);
        gerenciadorAlunos.adicionarAluno(123458L, "Carlos", 5.0);
        gerenciadorAlunos.adicionarAluno(123459L, "Ana", 6.8);

        // Exibindo todos os alunos no gerenciador
        System.out.println("Alunos no gerenciador:");
        System.out.println(gerenciadorAlunos.alunosSet);

        // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
        gerenciadorAlunos.removerAluno(000L);
        gerenciadorAlunos.removerAluno(123457L);
        System.out.println(gerenciadorAlunos.alunosSet);

        // Exibindo alunos ordenados por nome
        gerenciadorAlunos.exibirAlunosPorNome();

        // Exibindo alunos ordenados por nota
        gerenciadorAlunos.exibirAlunosPorNota();
    }
}
