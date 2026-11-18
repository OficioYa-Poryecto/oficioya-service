package edu.eci.dosw.oficioya.oficioya_service.service;

import java.util.UUID;

public interface ReputationClient {
    void penalize(UUID workerId, double points);
}