package net.sinasoheili.healthiness.user;

import lombok.Data;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
public class UserControllerImpl implements UserController {

    private final UserService userService;

    @Override
    public UserDto registerUser(UserDto userDto) {
        return userService.registerUser(userDto);
    }

}
