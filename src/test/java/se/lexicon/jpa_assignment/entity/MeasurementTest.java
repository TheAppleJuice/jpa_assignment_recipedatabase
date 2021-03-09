package se.lexicon.jpa_assignment.entity;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {

    Measurement testMeasurement;


    @BeforeEach
    public void setup() {
         testMeasurement = Measurement.GRAM;
    }

    @Test
    @DisplayName("Test : equal")
    public void test (){
        assertEquals(7, testMeasurement.getType());

    }



}