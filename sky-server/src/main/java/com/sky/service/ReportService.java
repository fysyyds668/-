package com.sky.service;

import com.sky.vo.*;

import javax.servlet.http.HttpServletResponse;
import java.time.LocalDate;

public interface ReportService {

    /**
     * 统计指定时间区间营业额
     * @param begin
     * @param end
     * @return
     */
    TurnoverReportVO getTurnoverStatistics(LocalDate begin,LocalDate end);

    /**
     * 用户统计
     * @return
     */
    UserReportVO getUserStatistics(LocalDate begin,LocalDate end);

    /**
     * 统计订单
     * @param begin
     * @param end
     * @return
     */
    OrderReportVO getOrdersStatistics(LocalDate begin, LocalDate end);

    /**
     * 销量前十
     * @param begin
     * @param end
     * @return
     */
    SalesTop10ReportVO getSaleTop10(LocalDate begin, LocalDate end);

    /**
     * 导出数据报表
     * @param response
     */
    void exportBusinessData(HttpServletResponse response);
}
