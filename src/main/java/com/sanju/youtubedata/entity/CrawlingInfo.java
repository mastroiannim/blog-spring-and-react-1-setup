package com.sanju.youtubedata.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "crawling_info")
@Data
@EqualsAndHashCode(callSuper=true)
public class CrawlingInfo extends BaseEntity{
    /**
     *
     */
    private static final long serialVersionUID = 6913884992068197878L;
    @Column(name = "search_key")
    private String searchKey;
    @Column(name = "current_page_token")
    private String currentPageToken;
    @Column(name = "next_page_token")
    private String nextPageToken;
    @Column(name = "total_count")
    private long totalCount;
}
