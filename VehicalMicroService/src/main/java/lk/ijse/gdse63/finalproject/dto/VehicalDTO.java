package lk.ijse.gdse63.finalproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class VehicalDTO {
        private int id;
        private String name;
        private String transmition;
        private String category;
        private String vehicalType;
        private String seatCapasity;
        private String fuelType;
        private Double feeForDay;
        private Double fuelUsage;
        private Double feeFor1km ;
        private Boolean hybrid ;
        private String remarks;
        private String images;
        private int driverId;
        private String driverName;
        private String contactNo;
        private String licence;


}
