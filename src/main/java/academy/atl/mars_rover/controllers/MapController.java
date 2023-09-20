package academy.atl.mars_rover.controllers;

import academy.atl.mars_rover.Services.MapService;
import academy.atl.mars_rover.models.MapEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.NoSuchElementException;

@CrossOrigin(origins = "*") //para cargar los datos de la bd en el front
@RestController
@RequestMapping("/map")
public class MapController {

    private final MapService mapService;

    @Autowired
    public MapController(MapService mapService){
        this.mapService = mapService;
    }

    @GetMapping("/coordinates")
    public ResponseEntity<List<MapEntity>> getAllCoord() {
        try {
            List<MapEntity> getAllCoord = mapService.getAllCoord();
            return ResponseEntity.ok(getAllCoord);
        } catch (NoSuchElementException e) {
            return ResponseEntity.notFound().build();
        }
    }

    //@Autowired
    //private MapService mapService;
    //@PostMapping("/api")
    /*public String createMap(@RequestBody MapEntity map){
        return "ingrese";
        //mapService.createMap(map);
    }*/
}
