package lk.ijse.gdse63.finalproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class HotelDTO {
    private int id;
    private String name;
    private String address;
    private String remark;
    private String email;
    private String category;
    private String contact;
    private String maplink;
    private String pets;

}