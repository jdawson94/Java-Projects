import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpeedReadingTest {

        private SpeedReading sr;

        @Before
        public void setUp() throws Exception {
            sr = new SpeedReading();
        }

        @After
        public void tearDown() throws Exception {
        }

        @Test
        public void parseSpeedReading() {
            assertEquals(sr.parseSpeedReading("H55"), 55);
        }
    }
