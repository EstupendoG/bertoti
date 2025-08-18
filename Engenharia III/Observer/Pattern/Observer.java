// Todas as classes no mesmo arquivo para facilitar a leitura

// Classe Principal
public class AnunciadorEventos {
    private String nomeEvento;
    private int dificuldadeEvento;
    private List<Jogador> jogadores = new LinkedList<Jogador>();

    public addJogador(Jogador jogador){
        this.jogadores.add(jogador);
    }

    public void notificarJogadores(){
        for(Jogador j : jogadores){
            j.anunciar(this.nomeEvento , this.dificuldadeEvento);
        }
    }


}

// Interface
public interface Observador{
    public void anunciar(String nomeEvento , int dificuldadeEvento);
}

// Classe Jogador
public class Jogador implements Observador{
    private String nome;
    private float nivel;

    public void anunciar(String nomeEvento , int dificuldadeEvento){

    }
}