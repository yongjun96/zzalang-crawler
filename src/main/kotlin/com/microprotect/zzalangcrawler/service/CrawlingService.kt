package com.microprotect.zzalangcrawler.service

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.springframework.stereotype.Service

@Service
class CrawlerService {

    fun crawl() {

        val options = ChromeOptions().apply {
            //addArguments("--headless")
            addArguments("--no-sandbox")
            addArguments("--disable-gpu")
        }

        val driver = ChromeDriver(options)
        val url = "https://www.naver.com"
        driver.get(url)
    }
}