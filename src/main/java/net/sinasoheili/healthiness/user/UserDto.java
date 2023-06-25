package net.sinasoheili.healthiness.user;

import lombok.Data;
import net.sinasoheili.healthiness.utils.ValidationGroups;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

@Data
public class UserDto {

    @Null(groups = {ValidationGroups.Create.class}, message = "{user.validation.id-should-not-have-value}")
    private String id;

    @NotBlank(message = "{user.validation.first-name-should-have-value}")
    private String firstName;

    @NotBlank(message = "{user.validation.last-name-should-have-value}")
    private String lastName;

    @NotBlank(message = "{user.validation.phone-number-should-have-value}")
    @Size(min = 11, max = 11)
    private String phoneNumber;

    @NotBlank(message = "{user.validation.password-should-have-value}")
    private String password;
}
