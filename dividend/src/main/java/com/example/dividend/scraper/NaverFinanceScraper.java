package com.example.dividend.scraper;

import com.example.dividend.constants.Month;
import com.example.dividend.model.Company;
import com.example.dividend.model.Dividend;
import com.example.dividend.model.ScrapedResult;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class NaverFinanceScraper implements Scraper {
    @Override
    public ScrapedResult scrap(Company company) {
       return null;
    }
    @Override
    public Company scrapCompanyByTicker(String ticker) {

        return null;
    }

}
