package damasChinesas;

public class Peca {

    protected Jogador dono;

    Peca(Jogador dono) {
        this.dono = dono;
    }

    public Jogador getDono() {
        return dono;
    }
}