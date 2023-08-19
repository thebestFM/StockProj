package com.demo818.demo.service;

import com.demo818.demo.pojo.StockData;
import java.util.List;

public interface StockDataService {
    List<StockData> getRecordsByTimestamp();
}
