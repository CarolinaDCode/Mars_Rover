package academy.atl.mars_rover.Services;

import academy.atl.mars_rover.models.RoverEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import academy.atl.mars_rover.repository.IRoverRepository;

@Service
public class RoverService {
    private final IRoverRepository roverRepository;

    @Autowired
    public RoverService(IRoverRepository roverRepository) {
        this.roverRepository = roverRepository;
    }

    public RoverEntity getIdRover(Long id){
        return roverRepository.getReferenceById(id);
    }
}
