package academy.devdojo.springboot2.Service;

import academy.devdojo.springboot2.domain.Anime;
import academy.devdojo.springboot2.repository.AnimeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService implements AnimeRepository {
    public List<Anime> ListAll(){
        return List.of(new Anime(1L, "One Piece"), new Anime(2L, "Berserk"), new Anime(3L, "Naruto"));
    }
}
