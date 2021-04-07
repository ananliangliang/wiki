package pers.ananliangliang.wiki.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pers.ananliangliang.wiki.entity.Ebook;

public interface EbookRepository extends JpaRepository<Ebook, Long> {
}
