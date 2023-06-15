package org.example.exercice5bis;


import org.example.exercice5.QualityException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RentingAgencyTest {

    private Car car;

    private RentingAgency rentingAgency;

    @BeforeEach
    void setUp(){
        rentingAgency = new RentingAgency();
    }
    @Test
    void testDailyRoutineConditionDecreaseTwiceWhenRentDueInIs0() throws StateException {
        //Arrange
        car = Car.builder().condition(10).rentDueIn(0).brand("b1").type("c1").build();
        //Act
        rentingAgency.dailyRoutine(car);
        Assertions.assertEquals(8, car.getRentDueIn());
    }
    @Test
    void testDailyRoutineShouldRaiseStateExceptionWhenConditionIsNeg() throws StateException {
        //Arrange
        car = Car.builder().condition(0).rentDueIn(10).brand("b1").type("c1").build();
        //Act
        Assertions.assertThrowsExactly(QualityException.class, ()->{
            rentingAgency.dailyRoutine(car);
        });
    }
    @Test
    void testDailyRoutineShouldRaiseStateExceptionWhenConditionIsAbove100() throws StateException {
        //Arrange
        car = Car.builder().condition(101).rentDueIn(0).brand("b1").type("c1").build();
        //Act
        Assertions.assertThrowsExactly(QualityException.class, ()->{
            rentingAgency.dailyRoutine(car);
        });
    }
    @Test
    void testDailyRoutineConditionOfLuxuryCarsIncreaseWithTime() throws StateException {
        //Arrange
        car = Car.builder().condition(50).rentDueIn(20).brand("b2").type("luxury").build();
        //Act
        Assertions.assertEquals(52, car.getCondition());
            rentingAgency.dailyRoutine(car);
    }
    @Test
    void testDailyRoutineConditionOfOldCarsDecreaseTwiceAsMuchAsOtherCars() throws StateException {
        //Arrange
        car = Car.builder().condition(50).rentDueIn(20).brand("b3").type("old").build();
        //Act
        Assertions.assertEquals(40, car.getCondition());
        rentingAgency.dailyRoutine(car);
    }
}
