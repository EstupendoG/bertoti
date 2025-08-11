public class Criatura {
    private int vida;
    private 

    public boolean brigar(int dano) {
        int newVida = this.vida - dano
        if(newVida <= 0){
            return true
        }
        return false
    }

}