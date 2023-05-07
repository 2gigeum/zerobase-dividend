package com.example.dividend.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScrapedResult {
    private Company company;

    private List<Dividend> dividends;

    public void ScrapedResult(){this.dividends = new ArrayList<>();}


    public void setDividendEntities(List<Dividend> dividends) {
        this.dividends=new ArrayList<>();
    }
}
