package com.demo818.demo.mapper;

import com.demo818.demo.pojo.StockData;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface StockDataMapper {
    List<StockData> getRecordsByTimestamp();
}

