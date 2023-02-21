package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {
    private static Logger logger;

    @Test
    void lastLogTest() {
        String lastLog = "The Last Log";

        Logger.getInstance().log(lastLog);

        Assertions.assertTrue(Logger.getInstance().getLastLog().length() > 0);
    }
}
