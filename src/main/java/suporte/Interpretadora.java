package suporte;

import java.util.HashSet;

public class Interpretadora {
    private HashSet<String> palavrasChave;

    public Interpretadora() {
        this.palavrasChave = new HashSet<>();
    }

    public void interpretarTexto (String frase){
        String[] frases = frase.split(" ");

        for (String palavra : frases) {
            this.palavrasChave.add(palavra);
        }
        
    }

    /*GETTER E SETTER*/
    public HashSet<String> getPalavrasChave() {
        return palavrasChave;
    }

    public void setPalavrasChave(HashSet<String> palavrasChave) {
        this.palavrasChave = palavrasChave;
    }
}
