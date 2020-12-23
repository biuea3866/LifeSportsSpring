package Service.map;

import Repository.map.MapRepository;
import VO.map.MapVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MapService {
    @Autowired
    MapRepository mapRepository;

    public List<MapVO> getAllMapList() {
        return mapRepository.getAllMapList();
    }

    public List<MapVO> getMapListByKeyword(String keyword) {
        return mapRepository.getMapListByKeyword(keyword);
    }

    public List<MapVO> getMapListByPlace(String place) {
        return mapRepository.getMapListByPlace(place);
    }
}
