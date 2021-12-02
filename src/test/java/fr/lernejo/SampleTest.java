package fr.lernejo;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
class SampleTest {

    @org.junit.jupiter.api.Test
    void op() {
        assertEquals(12, new Sample().op(Sample.Operation.ADD, 2, 10));
        assertEquals(10, new Sample().op(Sample.Operation.MULT, 2, 5));
    }

    @org.junit.jupiter.api.Test
    void fact() {
        assertEquals(120, new Sample().fact(5));
        assertEquals(720, new Sample().fact(6));
    }
}
