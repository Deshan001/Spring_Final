package ik.ijse.gdse63.finalproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;

@Data
@AllArgsConstructor

public class UserDTO {
    private int id;
    private String username;
    private String password;
    private String usernic;
    private String contact;
    private String email;
    private LocalDate birthday;
    private ArrayList<String> nicImg;
    private String gender;
    private String remarks;
    private ArrayList<String> roles;


    public UserDTO(){
        this.roles = new ArrayList<>();
        roles.add("user");
    }
}