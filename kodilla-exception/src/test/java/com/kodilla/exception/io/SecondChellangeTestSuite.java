package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SecondChellangeTestSuite {
    @Test
    void testWithCorrectNumbers() {
        SecondChallenge secondChallenge = new SecondChallenge();

        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5,2));
    }
    @Test
    void probablyIWillThrowException() {
        SecondChallenge secondChallenge = new SecondChallenge();

        assertAll (
                () -> assertThrows(Exception.class , () -> secondChallenge.probablyIWillThrowException(2,1.5)),
                () -> assertThrows(Exception.class , () -> secondChallenge.probablyIWillThrowException(1,1.5)),
                () -> assertThrows(Exception.class , () -> secondChallenge.probablyIWillThrowException(2,3)));
    }

}
