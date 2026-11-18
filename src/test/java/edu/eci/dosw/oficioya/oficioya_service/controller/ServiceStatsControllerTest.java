package edu.eci.dosw.oficioya.oficioya_service.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import edu.eci.dosw.oficioya.oficioya_service.dto.WorkerStatsResponse;
import edu.eci.dosw.oficioya.oficioya_service.service.RequestService;

class ServiceStatsControllerTest {

    @Test
    void getWorkerStats() {
        RequestService svc = Mockito.mock(RequestService.class);
        ServiceStatsController controller = new ServiceStatsController(svc);
        UUID id = UUID.randomUUID();
        WorkerStatsResponse resp = new WorkerStatsResponse(id, 0, 0.0, java.util.List.of());
        when(svc.getWorkerStats(id)).thenReturn(resp);
        assertEquals(resp, controller.getWorkerStats(id));
    }
}