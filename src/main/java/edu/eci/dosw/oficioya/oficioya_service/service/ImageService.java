package edu.eci.dosw.oficioya.oficioya_service.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import edu.eci.dosw.oficioya.oficioya_service.entity.Request;
import edu.eci.dosw.oficioya.oficioya_service.model.document.ImageDocument;

@Service 
public class ImageService {
    private RequestService requestService;

    public ImageService(RequestService requestService){
        this.requestService = requestService;
    }

    public void addImages(List<ImageDocument> images){
        /*
        Cambiar por conexión con el orquestador para guardarlas
        */
        //imageRepository.saveAll(images);
    }

    public List<ImageDocument> findRequestImages(UUID requestId,UUID userId){
        Optional<Request> found = requestService.getRequest(requestId);

        if(found.isEmpty() || (found.orElse(null).getContractorId() != userId && found.orElse(null).getWorkerId() != userId)){
            return new ArrayList<>();
        }

        /*
        Cambiar a conexión con el orquestador para buscar imagenes
        */

        return new ArrayList<ImageDocument>();
  
    }
}
