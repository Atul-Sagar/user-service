package com.example.userservice.controller;

import com.example.userservice.dto.AuthRequestDTO;
import com.example.userservice.dto.AuthResponseDTO;
import com.example.userservice.dto.LoginRequestDTO;
import com.example.userservice.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final AuthService authService;

    public AuthController(AuthService authService){
        this.authService = authService;
    }

    @PostMapping("/register")
    public ResponseEntity<AuthResponseDTO> register(@RequestBody AuthRequestDTO request){
        return ResponseEntity.ok(
                new AuthResponseDTO(authService.register(request))
        );
    }


    @PostMapping("/login")
    public ResponseEntity<AuthResponseDTO> login(@RequestBody LoginRequestDTO request){
        return ResponseEntity.ok(
            new AuthResponseDTO(authService.login(request))
        );
    }
}
