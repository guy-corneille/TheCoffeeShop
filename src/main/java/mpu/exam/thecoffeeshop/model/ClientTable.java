package mpu.exam.thecoffeeshop.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class ClientTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int client_id ;
    private String fullNames ;
    private String email ;
    private String phone ;
    private int nber ;
    private LocalDate theDate;
    private String suggestion ;
}
