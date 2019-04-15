package damasChinesas;

import java.io.Serializable;

public class Jogador implements Serializable {

    protected String nome;

    Jogador(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
}