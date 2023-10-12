package ik.ijse.gdse63.finalproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO {
    private int id;
    private String username;
    private String password;
    private String usernic;
    private String contact;
    private String email;
    private LocalDate birthday;
    private String[] nicImag;
    private String gender;
    private String remarks;

}
