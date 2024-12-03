package academy.devdojo.springboot2.domain;

public class Anime {
    private String nome;

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
