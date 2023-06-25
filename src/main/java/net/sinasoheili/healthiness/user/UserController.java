package net.sinasoheili.healthiness.user;

import net.sinasoheili.healthiness.utils.ValidationGroups;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/user")
@Validated
public interface UserController {

    @PostMapping("/register")
    @Validated(ValidationGroups.Create.class)
    UserDto registerUser(@Valid @RequestBody UserDto userDto);

}
