package co.prime.thymeleaf.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class Product {

    private Integer id;
    private String code;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private Boolean status;

}
