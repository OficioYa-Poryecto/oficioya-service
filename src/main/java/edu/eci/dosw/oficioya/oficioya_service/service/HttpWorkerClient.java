package edu.eci.dosw.oficioya.oficioya_service.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class HttpWorkerClient implements WorkerClient {

    @Override
    public boolean exists(UUID workerId) {
        // TODO: llamar a GET /api/v1/workers/{workerId}
        System.out.println("Verificar worker: " + workerId);
        return true;
    }

    @Override
    public void reserveSlot(UUID workerId, java.time.LocalDateTime slot) {
        // TODO: POST /workers/{workerId}/availability-exceptions
        System.out.println("Reservar franja para worker " + workerId + " en " + slot);
    }

    @Override
    public void releaseSlot(UUID workerId, java.time.LocalDateTime slot) {
        // TODO: DELETE /workers/{workerId}/availability-exceptions/{id}
        System.out.println("Liberar franja para worker " + workerId + " en " + slot);
    }
}