package edu.eci.dosw.oficioya.oficioya_service.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class HttpReputationClient implements ReputationClient {

    @Override
    public void penalize(UUID workerId, double points) {
        // TODO: llamar a Reputation para restar puntos
        System.out.println("Penalizar reputacion " + points + " para worker " + workerId);
    }
}