package main;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTaskTest {

    // ezt a tesztmetódust nyugodtan törölheted
    @Test
    void example_test() {
        assertEquals("Hello, World!", "Hello, World!");
    }

    @Test
    void countDivisors_test() {


        Assert.assertEquals(2, TestTask.countDivisors(2));
    }

    @Test
    void countDivisors_test_02() {


        Assert.assertEquals(1, TestTask.countDivisors(1));

    }


    @Test
    void countDivisors_test_02() {


        Assert.assertEquals(3, TestTask.countDivisors(4));

    }
}