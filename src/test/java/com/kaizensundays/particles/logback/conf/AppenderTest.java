package com.kaizensundays.particles.logback.conf;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.Appender;
import ch.qos.logback.core.FileAppender;
import org.junit.Test;
import org.slf4j.LoggerFactory;

import java.util.Iterator;


/**
 * Created: Saturday 11/7/2020, 2:22 PM Eastern Time
 *
 * @author Sergey Chuykov
 */
public class AppenderTest {

    @Test
    public void setAppenderAttribute() {

        LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory();

        ch.qos.logback.classic.Logger logger = context.getLogger("ROOT");

        Iterator<Appender<ILoggingEvent>> it = logger.iteratorForAppenders();

        while (it.hasNext()) {
            Appender<ILoggingEvent> ref = it.next();
            if (ref instanceof FileAppender) {
                FileAppender<?> appender = (FileAppender<?>) ref;
                appender.setAppend(false);
            }
        }
    }

}
