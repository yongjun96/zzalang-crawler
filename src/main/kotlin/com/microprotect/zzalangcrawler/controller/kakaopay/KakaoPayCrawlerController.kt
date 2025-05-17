package com.microprotect.zzalangcrawler.controller.kakaopay

import com.microprotect.zzalangcrawler.service.kakaopay.request.KakaoPayInsuranceRequest
import com.microprotect.zzalangcrawler.service.kakaopay.CrawlerService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/kakaopay")
class CrawlerController(
    private val crawlerService: CrawlerService
) {
    @GetMapping("/crawler")
    fun crawl(req: KakaoPayInsuranceRequest) = crawlerService.crawl(req)
}