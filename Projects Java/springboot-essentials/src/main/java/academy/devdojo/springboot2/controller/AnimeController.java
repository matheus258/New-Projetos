package academy.devdojo.springboot2.controller;

import academy.devdojo.springboot2.Service.AnimeService;
import academy.devdojo.springboot2.domain.Anime;
import academy.devdojo.springboot2.util.DateUtil;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public List<Anime> List(){
        log.info(dateUtil.formatLocalDateTimeToDataStyle(LocalDateTime.now()));
        return animeService.ListAll();
    }
}
