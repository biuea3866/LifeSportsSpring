package Service.auth;

import Repository.auth.AuthRepository;
import VO.auth.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private AuthRepository authRepository;

    public void join(UserVO userVO) {
        authRepository.insertUser(userVO);
    }

    public UserVO getUser(String params) {
        return authRepository.findByEmail(params);
    }

    public UserVO getUser(UserVO userVO) {
        return authRepository.loginUser(userVO);
    }

    public void updateUser(UserVO userVO) {
        authRepository.update(userVO);
    }

    public boolean existByEmail(String params) {
        return authRepository.findByEmail(params) != null;
    }

    public boolean existByNickname(String params) {
        return authRepository.findByNickname(params) != null;
    }
}
