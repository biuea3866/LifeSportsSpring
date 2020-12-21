package Service.map;

import Repository.map.MapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MapService {
    @Autowired
    MapRepository mapRepository;
}
