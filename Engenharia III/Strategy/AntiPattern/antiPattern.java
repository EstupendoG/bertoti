// Todas as classes no mesmo arquivo para facilitar a leitura

// Classe Criatura
public class Criatura {
    private String nome;
    private int vida;

    public Criatura(String nome , int vida){
        this.nome = nome;
        this.vida = vida;
    }

    public boolean brigar(int dano) {
        this.vida -= dano;
        return this.vida <= 0;
    }

}

// Classe Minerador
public class Minerador extends Criatura {
    private int preco;

    public Minerador(String nome , int vida , int preco){
        super(nome , vida);
        this.preco = preco;
    }

    public boolean contratar(int dinheiro) {
        return dinheiro >= this.preco;
    }
}

// Classe Pet
public class Pet extends Criatura {
    private int nivelAmizade;

    public Pet(String nome , int vida , int nivelAmizade){
        super(nome , vida);
        this.nivelAmizade = nivelAmizade;
    }

    public boolean adestrar(){
        return this.nivelAmizade >= 100;
    }

    public void fazerCarinho() {
        this.nivelAmizade += 10;
    }
}