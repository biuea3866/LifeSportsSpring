package Controller.map;

import Service.map.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/map")
public class MapController {
    @Autowired
    MapService mapService;

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String map() {
        return "map/mapPage";
    }
}
