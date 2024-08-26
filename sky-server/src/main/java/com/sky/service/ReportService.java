package com.sky.service;

import com.sky.vo.TurnoverReportVO;

import java.time.LocalDate;

/**
 * ClassName: ReportService
 * Package: com.sky.service
 * Description:
 *
 * @Author: 黄瑞天
 * @Create: 2024/8/26 - 12:16
 * @Version: v1.0
 */
public interface ReportService {

    /**
     * 统计指定时间内的营业额数据
     * @param begin
     * @param end
     * @return
     */
    TurnoverReportVO getTurnoverStatistics(LocalDate begin,LocalDate end);
}
