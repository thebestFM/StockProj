package com.demo818.demo.controller;

import com.demo818.demo.pojo.StockData;
import com.demo818.demo.service.StockDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/example")
public class StockDataController {
    @Autowired
    private StockDataService stockDataService;

    @GetMapping("/url")
    public List<StockData> getLastTenRecords() {
        return stockDataService.getRecordsByTimestamp();
    }
}
