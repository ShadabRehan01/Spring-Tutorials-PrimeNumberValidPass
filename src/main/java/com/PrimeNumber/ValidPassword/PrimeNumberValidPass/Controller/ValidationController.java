package com.PrimeNumber.ValidPassword.PrimeNumberValidPass.Controller;

import com.PrimeNumber.ValidPassword.PrimeNumberValidPass.DTO.NumberDto;
import com.PrimeNumber.ValidPassword.PrimeNumberValidPass.DTO.PasswordDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/validate")
public class ValidationController {
    @PostMapping(path = "/number")
    public ResponseEntity<String> validNumber(@Valid @RequestBody NumberDto numberDto){
        return ResponseEntity.ok("valid Prime Number");
     //   return "Valid Prime Number: "+numberDto.getNumber();
    }
    @PostMapping(path = "/password")
    public ResponseEntity<String> validatePassword(@Valid @RequestBody PasswordDTO passwordDTO){
        return ResponseEntity.ok("Password is valid!");
    }
}
