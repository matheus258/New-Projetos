package academy.devdojo.springboot2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Anime {
    private Long id;
    private String nome;

//    public Anime(Long id, String nome) {
//        this.id = id;
//        this.nome = nome;
//    }


}
