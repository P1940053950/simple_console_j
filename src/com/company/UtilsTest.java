package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void isBiggerThanNumberTrue() {
        Utils utils = new Utils();
        assertTrue(utils.isBiggerThanNumberTrue(22,3));
        assertFalse(utils.isBiggerThanNumberTrue(22,322));
    }
}