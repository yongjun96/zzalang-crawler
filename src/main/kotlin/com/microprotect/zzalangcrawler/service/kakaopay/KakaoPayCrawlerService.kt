package com.microprotect.zzalangcrawler.service.kakaopay

import com.microprotect.zzalangcrawler.service.kakaopay.request.KakaoPayInsuranceRequest
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.springframework.stereotype.Service

@Service
class CrawlerService {

    fun crawl(req : KakaoPayInsuranceRequest) {

        val options = ChromeOptions().apply {
            //addArguments("--headless")
            addArguments("--no-sandbox")
            addArguments("--disable-gpu")
        }

        val driver = ChromeDriver(options)
        val url = buildString {
            append("https://insurance-partners.kakaopay.com/insurance-analysis/")
            append(req.consultingRequestKey)
            append("?client_id=")
            append(req.consultingRequestClientId)
        }
        driver.get(url)
    }
}