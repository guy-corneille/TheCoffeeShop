package mpu.exam.thecoffeeshop.dto;

import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import mpu.exam.thecoffeeshop.model.Category;

@Data
public class ProductDTO {

    private Long id;
    private String name;


    private int categoryId;
    private double price;
    private double weight;
    private String description;
    private String imageName;
}
