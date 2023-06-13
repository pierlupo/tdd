package org.example.exercice1;

import org.example.exercice1.GradingCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GradingCalculatortest {

    @Test
    void getGradeTest1(){
        //Arrange
        GradingCalculator gradingCalculator = new GradingCalculator();

        //Act
        gradingCalculator.setScore(95);
        gradingCalculator.setAttendancePercentage(75);
        char result = gradingCalculator.getGrade();

        //Assert
        Assertions.assertEquals('A',result);
    }

    @Test
    void getGradeTest2(){
        //Arrange
        GradingCalculator gradingCalculator = new GradingCalculator();

        //Act
        gradingCalculator.setScore(85);
        gradingCalculator.setAttendancePercentage(65);
        char result = gradingCalculator.getGrade();

        //Assert
        Assertions.assertEquals('B',result);
    }

    @Test
    void getGradeTest3(){
        //Arrange
        GradingCalculator gradingCalculator = new GradingCalculator();

        //Act
        gradingCalculator.setScore(65);
        gradingCalculator.setAttendancePercentage(65);
        char result = gradingCalculator.getGrade();

        //Assert
        Assertions.assertEquals('C',result);
    }

    @Test
    void getGradeTest4(){
        //Arrange
        GradingCalculator gradingCalculator = new GradingCalculator();

        //Act
        gradingCalculator.setScore(50);
        gradingCalculator.setAttendancePercentage(55);
        char result = gradingCalculator.getGrade();

        //Assert
        Assertions.assertEquals('F',result);
    }

    @Test
    void getGradeTest5(){
        //Arrange
        GradingCalculator gradingCalculator = new GradingCalculator();

        //Act
        gradingCalculator.setScore(95);
        gradingCalculator.setAttendancePercentage(55);
        char result = gradingCalculator.getGrade();

        //Assert
        Assertions.assertEquals('F',result);
    }

    @Test
    void getGradeTest6(){
        //Arrange
        GradingCalculator gradingCalculator = new GradingCalculator();

        //Act
        gradingCalculator.setScore(65);
        gradingCalculator.setAttendancePercentage(55);
        char result = gradingCalculator.getGrade();

        //Assert
        Assertions.assertEquals('F',result);
    }

    @Test
    void getGradeTest7(){
        //Arrange
        GradingCalculator gradingCalculator = new GradingCalculator();

        //Act
        gradingCalculator.setScore(50);
        gradingCalculator.setAttendancePercentage(90);
        char result = gradingCalculator.getGrade();

        //Assert
        Assertions.assertEquals('F',result);
    }
}
