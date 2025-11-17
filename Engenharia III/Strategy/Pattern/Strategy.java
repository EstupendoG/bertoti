public class Criatura {
    private String nome;
    private int vida;

    private TrabalhoStrategy trabalhoStrategy;
    private AmizadeStrategy amizadeStrategy;

    public Criatura(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public boolean brigar(int dano) {
        this.vida -= dano;
        return this.vida <= 0;
    }

    // SETTERS (injeção)
    public void setTrabalhoStrategy(TrabalhoStrategy ts) {
        this.trabalhoStrategy = ts;
    }

    public void setAmizadeStrategy(AmizadeStrategy as) {
        this.amizadeStrategy = as;
    }

    // MÉTODOS QUE USAM AS ESTRATÉGIAS
    public boolean trabalhar(int recurso) {
        if (trabalhoStrategy == null) return false;
        return trabalhoStrategy.executar(recurso);
    }

    public boolean adestrar() {
        if (amizadeStrategy == null) return false;
        return amizadeStrategy.adestrar();
    }

    public void fazerCarinho() {
        if (amizadeStrategy != null) amizadeStrategy.fazerCarinho();
    }
}
