package pers.ananliangliang.wiki.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.ananliangliang.wiki.entity.Ebook;
import pers.ananliangliang.wiki.service.EbookService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/ebook")
public class EbookController {

    private final EbookService service;

    @GetMapping("/list")
    public List<Ebook> list() {
        return service.list();
    }


}
