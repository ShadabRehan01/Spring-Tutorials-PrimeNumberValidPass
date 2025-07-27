package com.PrimeNumber.ValidPassword.PrimeNumberValidPass.DTO;

import com.PrimeNumber.ValidPassword.PrimeNumberValidPass.Annotation.PrimeNumber;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NumberDto {
    @PrimeNumber
    private Integer number;
}
