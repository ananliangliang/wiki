package pers.ananliangliang.wiki.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pers.ananliangliang.wiki.entity.Ebook;
import pers.ananliangliang.wiki.repository.EbookRepository;
import pers.ananliangliang.wiki.service.EbookService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EbookServiceImpl implements EbookService {

    private final EbookRepository repository;

    @Override
    public List<Ebook> list() {
        return repository.findAll();
    }
}
