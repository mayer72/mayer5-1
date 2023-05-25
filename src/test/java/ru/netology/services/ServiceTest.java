
package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
//import ru.netology.services.Service;

public class ServiceTest {
    @ParameterizedTest
    //@CsvSource({
    //        "10000,3000,20000,3",
    //        "100000,60000,150000,2"
    //})
    @CsvFileSource(files = "src/test/resources/otpusk.csv")
    public void testProgram(int income, int expenses, int threshold, int expected) {
        Service service = new Service();
        //int expected = 3;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
    // @Test
    // public void testProgram2(){
    //     Service service = new Service();
    //     int expected = 2;
    //     int actual = service.calculate(100000, 60000, 150000);

    //     Assertions.assertEquals(expected, actual);
    // }

}
