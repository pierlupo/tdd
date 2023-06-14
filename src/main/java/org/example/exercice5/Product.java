package org.example.exercice5;

import jdk.jshell.spi.ExecutionControl;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private int sellin;

    private int quality;

    private String name;

    private String type;

//    public void decrement() {
//        quality--;
//    }
//    public int getQuality() {
//        return quality;
//    }

}