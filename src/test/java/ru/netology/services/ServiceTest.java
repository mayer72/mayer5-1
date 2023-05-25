
package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.services.Service;

public class ServiceTest {
    @Test
    public void testProgram(){
        Service service = new Service();
        int expected = 2;
        int actual = service.calculate(100000, 60000, 150000);

        Assertions.assertEquals(expected, actual);
    }

}
