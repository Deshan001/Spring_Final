package lk.ijse.gdse63.finalproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AdminDTO {
    private int id;
    private String username;
    private String password;
    private String email;
    private String type;

}