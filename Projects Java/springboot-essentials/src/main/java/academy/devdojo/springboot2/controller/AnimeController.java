package academy.devdojo.springboot2.controller;

import academy.devdojo.springboot2.Service.AnimeService;
import academy.devdojo.springboot2.domain.Anime;
import academy.devdojo.springboot2.util.DateUtil;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("anime")
@AllArgsConstructor
public class AnimeController {
    private final AnimeService animeService;
    private DateUtil dateUtil;

    @GetMapping("list")
    public ResponseEntity<List<Anime>> List(){
        log.info(dateUtil.formatLocalDateTimeToDataStyle(LocalDateTime.now()));
        return new ResponseEntity<>(animeService.ListAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Anime> findById(@PathVariable Long id){
        return ResponseEntity.ok(animeService.findById(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Anime> save(@RequestBody Anime anime){
        return ResponseEntity.status(HttpStatus.CREATED).body(animeService.save(anime));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        animeService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping
    public ResponseEntity<Void> replace(@RequestBody Anime anime){
        animeService.replace(anime);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
