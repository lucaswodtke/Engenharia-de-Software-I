package damasChinesas;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Observable;

public abstract class TabuleiroAbstrato extends Observable implements Serializable {

    protected ArrayList<Jogador> listaJogadores;

    /**
     * Constructor
     */
    protected TabuleiroAbstrato() {
        listaJogadores = new ArrayList<>();
    }

    protected void proximoJogador() {
        setChanged();
        notifyObservers();
    }

    protected void adicionarJogador(String nomeJogador) {
    	listaJogadores.add(new Jogador(nomeJogador));
    }

    public ArrayList<Jogador> getListaJogadores() {
        return listaJogadores;
    }
}