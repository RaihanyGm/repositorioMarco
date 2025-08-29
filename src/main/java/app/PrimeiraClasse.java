package app;

public class PrimeiraClasse {
    public static void main(String[] args) {
        Aluno al = new Aluno();
        al.setNome("raihany");
        al.setIdade(20);

        System.out.println(al.getNome());
        System.out.println(al.getIdade());
        System.out.println("Olá Gradle!!!");

        
        Tarefa t1 = new Tarefa();
        t1.setDescricao("estudar Estruturas de Dados");
        t1.setConcluido(true);

        Tarefa t2 = t1;
        t2.setConcluido(false);
        
        System.out.println(t1.getDescricao());
        System.out.println(t1.isConcluido());

        Atividade[] objetos = new Atividade[3];

        objetos[0] = new Compromisso("Novo compromisso", 0, 0);
        objetos[1] = new Tarefa("Nova tarefa", true);
        
        System.out.println(objetos[0].getDetalhes());
        System.out.println(objetos[1].getDetalhes());
    }
}