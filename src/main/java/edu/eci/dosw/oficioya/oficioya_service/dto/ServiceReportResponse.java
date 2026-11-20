package edu.eci.dosw.oficioya.oficioya_service.dto;

import java.util.List;
import java.util.Map;

public record ServiceReportResponse(
        long total,
        Map<String, Long> byStatus,
        Map<String, Long> byNeighborhood,
        Map<Integer, Long> byHour,
        List<ReportItem> completedByDay,
        List<ReportItem> completedByTrade,
        List<ReportItem> requestsByTrade,
        double averageTariff,
        Map<String, Double> averageTariffByTrade
) {
}
