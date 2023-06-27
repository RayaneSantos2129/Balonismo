public class Main {
    public static void main(String[] args) {

        // construindo balões
        Balao b1 = new Balao();

        //chamado o método voar()
        String resultado = b1.voar (new combustivel());

        // exibindo o resultado do voo
        System.out.println(resultado);

        Balao b2 = new Balao(10, "rosa", "grande", 1.43, 23.65, "grande", 4 );
        Balao b3 = new Balao(12, "verde", "pequeno", 1.21, 78.92, "medio", 12);
        

    }
}