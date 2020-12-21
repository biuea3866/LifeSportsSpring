package Repository.auth;

import VO.auth.UserVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AuthRepository {
    @Autowired
    private SqlSession sqlSession;

    public boolean insertUser(UserVO vo) {
        int count = sqlSession.insert("user.insertUser", vo);

        return count == 1;
    }

    public UserVO loginUser(UserVO vo) {
        return sqlSession.selectOne("user.loginUser", vo);
    }

    public UserVO findByEmail(String params) {
        return sqlSession.selectOne("user.findByEmail", params);
    }

    public UserVO findByNickname(String params) {
        return sqlSession.selectOne("user.findByNickname", params);
    }

    public boolean update(UserVO vo) {
        int count = sqlSession.update("user.updateUser", vo);

        return count == 1;
    }
}
