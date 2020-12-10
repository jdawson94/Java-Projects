import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    private Sum sum;
    private int x;
    private int y;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        sum = new Sum();
        x = 5;
        y = 8;
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(sum.add(x,y),13);
    }

    @org.junit.jupiter.api.Test
    void times() {
        assertEquals(sum.times(x,y),40);
    }

    @org.junit.jupiter.api.Test
    void sub() {
        assertEquals(sum.sub(y,x),3);
    }
}