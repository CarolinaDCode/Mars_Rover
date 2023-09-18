package academy.atl.mars_rover.controllers;

import org.springframework.web.bind.annotation.*;

//@CrossOrigin(origins = "*") //para cargar los datos de la bd en el front

//@RequestMapping("map")
//@RequiredArgsConstructor
@RestController
@RequestMapping("/map")
public class MapController {

    //@Autowired
    //MapRepo mapRepo;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello dev Holaas";
    }

    //@Autowired
    //private MapService mapService;
    //@PostMapping("/api")
    /*public String createMap(@RequestBody MapEntity map){
        return "ingrese";
        //mapService.createMap(map);
    }*/
}
