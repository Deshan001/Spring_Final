package lk.ijse.gdse63.finalproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelDTO {
    private int id;
    private String name;
    private String category;
    private int star;
    private boolean petAllowed;
    private String mapLink;
    private String address;
    private ArrayList<String> phone;
    private String email;
    private ArrayList<PricesDTO> prices;
    private ArrayList<byte[]> images;
    private String remarks;
}