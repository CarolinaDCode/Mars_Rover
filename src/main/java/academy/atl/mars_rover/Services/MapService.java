package academy.atl.mars_rover.Services;

import academy.atl.mars_rover.models.MapEntity;
import academy.atl.mars_rover.repository.IMapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MapService {

    private final IMapRepository mapRepository;

    @Autowired
    public MapService(IMapRepository mapRepository) {
        this.mapRepository = mapRepository;
    }

    public MapEntity getIdMap(Long id){
        return mapRepository.getReferenceById(id);
    }
    public void createMap(MapEntity map){
        mapRepository.save(map);
    }
}
