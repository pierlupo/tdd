package org.example.exercice5bis;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    private int rentDueIn;

    private int condition;

    private String brand;

    private String type;
}
