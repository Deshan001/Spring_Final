package lk.ijse.gdse63.usertravelpackagemicroservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String place;
    @ManyToOne(cascade = CascadeType.ALL)
    private UserTravelPackage userTravelPackage;
}
