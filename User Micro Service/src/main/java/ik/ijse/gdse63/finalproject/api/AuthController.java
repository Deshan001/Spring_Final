package ik.ijse.gdse63.finalproject.api;


import ik.ijse.gdse63.finalproject.config.JwtUtil;
import ik.ijse.gdse63.finalproject.dto.UserDTO;
import ik.ijse.gdse63.finalproject.dto.security.ErrorResponse;
import ik.ijse.gdse63.finalproject.dto.security.LoginRequest;
import ik.ijse.gdse63.finalproject.dto.security.LoginResponse;
import ik.ijse.gdse63.finalproject.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("/api/v1/login")
public class AuthController {

    private final AuthenticationManager authenticationManager;
    @Autowired // spring gaaw thiynw uu hdpu object ewa dgnnw..ram eke space ek ithuru wnw
    private UserService userServiceImpl;

    private JwtUtil jwtUtil;

    public AuthController(AuthenticationManager authenticationManager, JwtUtil jwtUtil){
        this.authenticationManager = authenticationManager;
        this.jwtUtil = jwtUtil;
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity login(@RequestBody LoginRequest loginRequest){

        try {
            Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getEmail(), loginRequest.getPassword()));
            String email = authentication.getName();
            UserDTO user = new UserDTO();
            user.setEmail((loginRequest.getEmail()));
            user.setPassword((loginRequest.getPassword()));
            String token = jwtUtil.createToken(user);
            LoginResponse loginResponse = new LoginResponse(email,token);

            return ResponseEntity.ok(loginResponse);
        }catch (BadCredentialsException e){
            ErrorResponse errorResponse = new ErrorResponse(HttpStatus.BAD_REQUEST,"Invalid UserName or Password");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }catch (Exception e){
            ErrorResponse errorResponse= new ErrorResponse(HttpStatus.BAD_REQUEST,e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }
    }
}
