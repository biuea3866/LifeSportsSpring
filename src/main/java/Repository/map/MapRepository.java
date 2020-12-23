package Repository.map;

import VO.map.MapVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Repository
public class MapRepository {
    @Autowired
    SqlSession sqlSession;

    public List<MapVO> getAllMapList() {
        return sqlSession.selectList("map.getAllMapList");
    }

    public List<MapVO> getMapListByKeyword(String param) {
        return sqlSession.selectList("map.getMapListByKeyword", param);
    }

    public List<MapVO> getMapListByPlace(String param) {
        return sqlSession.selectList("map.getMapListByPlace", param.split(" "));
    }
}
