public class Estudante {
    String nome;
    int matricula;
    boolean mensalidadeDia;

    
    public Estudante(String nome, int matricula, boolean mensalidadeDia) {
        this.nome = nome;
        this.matricula = matricula;
        this.mensalidadeDia = mensalidadeDia;
    }  
    
    public void imprimirRelatorio(double media, Frequencia frequencia) {
        System.out.println("=======================================================");
        System.out.println("| Aluno: " + this.nome + " | Matrícula: " + this.matricula + "|");

        if (this.mensalidadeDia == false) {
            System.out.println("| Aviso: Dados retidos por pendência financeira");
        } else {
            System.out.println("| Financeiro: Mensalidade em dia");
            

            if (media < 7) {
                System.out.println("| Média Final: " + media + " Reprovado");
            } else {
                System.out.println("| Média Final: " + media + " Aprovado");
            }

            if (frequencia.numeroFaltas < 5) {
                System.out.println("| Faltas: " + frequencia.numeroFaltas + " Frequência alta");
            } else {
                System.out.println("| Faltas: " + frequencia.numeroFaltas + " Frequência regular/baixa");
            }
        }
        System.out.println("=======================================================");
    }

}