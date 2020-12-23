package Controller.map;

import Service.map.MapService;
import VO.map.MapVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/map")
public class MapController {
    @Autowired
    MapService mapService;

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String map() {
        return "map/mapPage";
    }

    @ResponseBody
    @RequestMapping(value="/getListByKeyword", method=RequestMethod.GET)
    public List<MapVO> getListByKeyword(
        @RequestParam(value="searching") String searching
    ) {
        return mapService.getMapListByKeyword(searching);
    }
}
