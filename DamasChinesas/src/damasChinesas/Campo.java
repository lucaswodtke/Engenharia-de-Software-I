package damasChinesas;

public class Campo {

	protected Peca peca;
	protected boolean disponivel;
	protected int x, y;
	
	Campo(boolean disponivel, int x, int y) {
        this.disponivel = disponivel;
        this.x = x;
        this.y = y;
    }
	
    public boolean getDisponivel() {
        return disponivel;
    }

    public Peca getPeca() {
        return peca;
    }

    public String getCoordenadas() {
        return x + "," + y;
    }

    void setPeca(Peca peca) {
        this.peca = peca;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
