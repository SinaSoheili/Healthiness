package net.sinasoheili.healthiness.user;

import lombok.Data;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Data
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public UserDto registerUser(UserDto userDto) {
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(userDto, userEntity);
        internalUserRegister(userEntity);
        BeanUtils.copyProperties(userEntity, userDto);
        return userDto;
    }

    private void internalUserRegister(UserEntity userEntity) {
        userRepository.registerUser(userEntity);
    }
}
