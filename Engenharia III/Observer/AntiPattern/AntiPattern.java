public class AnunciadorEventos {
    private String nomeEvento;
    private int dificuldadeEvento;

    Jogador j1 = new Jogador(".::MestreGamer::." , 53,54);
    Jogador j2 = new Jogador("tuliogoncalves4782" , 3,2);
    Jogador j3 = new Jogador("EduardoGames" , 21,12);

    public void notificarJogadores(){
        j1.anunciar();
        j2.anunciar();
        j3.anunciar();
    }
}

public class Jogador implements Observador{
    private String nome;
    private float nivel;

    public void anunciar(String nomeEvento , int dificuldadeEvento){

    }
}