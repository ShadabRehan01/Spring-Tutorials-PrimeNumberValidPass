package com.PrimeNumber.ValidPassword.PrimeNumberValidPass.DTO;

import com.PrimeNumber.ValidPassword.PrimeNumberValidPass.Annotation.ValidPassword;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class PasswordDTO {
    @NotBlank(message = "Password can not be blank")
    @ValidPassword
    private String password;
}
