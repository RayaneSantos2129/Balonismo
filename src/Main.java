public class Main {
    public static void main(String[] args) {
        //Criar objeto Pessoa
        Pessoa Fernanda = new Pessoa();
        Pessoa Carlos = new Pessoa();
        Pessoa Luisa = new Pessoa();
        Pessoa Jonatas = new Pessoa();

        //Declaração de objeto
        Pessoa qualquer;

        //Instanciação de objeto
        qualquer = new Pessoa();
        Pessoa adulta = new Pessoa();

        //Definir forma do objeto
        qualquer.nome = "Fernanda";

        //Definir comportamento do objeto
        qualquer.voa();
        qualquer.voa("Pessoa viaja");


        //Criar objeto Piloto
        Piloto  = new Piloto();
        //Definir forma do objeto
        Piloto = "JoaoMiguel";
        //Definir comportamento do objeto
        Piloto.pilotar();
        Piloto.pilotar("Piloto Pilota");


        //Criar objeto Balao
        Balao = new Balao();
        //Definir forma do objeto
        Balao = "293899";
        //Definir comportamento do objeto
        Balao.voa();
        Balao.voa("Voar");


    }
}