package pers.ananliangliang.wiki.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/** 电子书 */
@Data
@Entity
public class Ebook {
    /** id */
    private @Id @GeneratedValue Long id;

    /** 名称 */
    private @Column(length = 63) String name;

    /** 分类1 */
    private @Column(name = "category1_id") Long category1Id;

    /** 分类2 */
    private @Column(name = "category2_id") Long category2Id;

    /** 描述 */
    private String description;

    /** 封面 */
    private String cover;

    /** 文档数 */
    private Integer docCount;

    /** 封面数 */
    private Integer viewCount;

    /** 点赞数 */
    private Integer voteCount;

}
