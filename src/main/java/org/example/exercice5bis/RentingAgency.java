package org.example.exercice5bis;

import org.example.exercice5.QualityException;

public class RentingAgency {

    public void dailyRoutine(Car car) throws StateException{
        int c = 0;
        if(car.getCondition() < 0 || car.getCondition() > 100) {
            throw new StateException();
        }
        if(car.getType().equals("old")) {

        }
    }
}
