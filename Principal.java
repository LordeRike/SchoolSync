public class Principal {

    public static void main(String[] args) {

        Estudante n1 = new Estudante("Rogerinho", 123, true);
        Boletim m1 = new Boletim();
        double media_n1 = m1.Media(10, 9);
        Frequencia f1 = new Frequencia(2);

        Estudante n2 = new Estudante("Albertinho", 456, true);
        Boletim m2 = new Boletim();
        double media_n2 = m2.Media(5, 6);
        Frequencia f2 = new Frequencia(1);

        Estudante n3 = new Estudante("Jurema", 789, false);
        Boletim m3 = new Boletim();
        double media_n3 = m3.Media(9, 9);
        Frequencia f3 = new Frequencia(3);

        n1.imprimirRelatorio(media_n1, f1);
        n2.imprimirRelatorio(media_n2, f2);
        n3.imprimirRelatorio(media_n3, f3);        
    }    
}
