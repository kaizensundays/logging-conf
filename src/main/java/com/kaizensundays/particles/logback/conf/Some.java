package com.kaizensundays.particles.logback.conf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created: Saturday 11/7/2020, 1:36 PM Eastern Time
 *
 * @author Sergey Chuykov
 */
public class Some {

    Logger logger = LoggerFactory.getLogger(getClass());

    public void execute() {
        logger.info("execute()");
    }

    public static void main(String[] args) {
        new Some().execute();
    }

}
