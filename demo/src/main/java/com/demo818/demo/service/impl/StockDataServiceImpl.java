package com.demo818.demo.service.impl;

import com.demo818.demo.mapper.StockDataMapper;
import com.demo818.demo.pojo.StockData;
import com.demo818.demo.service.StockDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StockDataServiceImpl implements StockDataService {
    @Autowired
    private StockDataMapper stockDataMapper;

    @Override
    public List<StockData> getRecordsByTimestamp() {
        return stockDataMapper.getRecordsByTimestamp();
    }
}
