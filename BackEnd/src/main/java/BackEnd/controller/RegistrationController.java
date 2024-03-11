package BackEnd.controller;

import BackEnd.DTO.UserRegistration;
import BackEnd.service.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/registration")
@AllArgsConstructor
public class RegistrationController {

    private RegistrationService registration;

    @PostMapping
    public String register(@RequestBody UserRegistration request){
        return registration.register(request);
    }
}
