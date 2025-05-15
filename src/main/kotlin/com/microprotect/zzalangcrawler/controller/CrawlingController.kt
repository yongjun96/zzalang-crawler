package com.microprotect.zzalangcrawler.controller

import com.microprotect.zzalangcrawler.service.CrawlerService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CrawlerController(
    private val crawlerService: CrawlerService
) {
    @GetMapping("/crawl")
    fun crawl() = crawlerService.crawl()
}