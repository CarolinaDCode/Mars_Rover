package academy.atl.mars_rover.controllers;


import org.springframework.web.bind.annotation.GetMapping;

//@RestController
public class RoverController {
    /**@Autowired
    IRoverRepository roverRepository;*/

    /**@Autowired
    private RoverService roverService;*/
    /**
    @GetMapping("/api/rover")
    public ResponseEntity<List<RoverEntity>> getRover(){
        try {
            return new ResponseEntity<>(RoverEntity, )
        } catch () {

        }
    }*/
    @GetMapping("/create")
    public String saveMap(){
        return "Siii Ingrese";
    }

}
