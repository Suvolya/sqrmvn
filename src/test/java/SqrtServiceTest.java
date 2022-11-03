import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.javasqrmvn.services.SqrtService;

public class SqrtServiceTest {

    @Test
    public void shouldCalcExact() {
        SqrtService service = new SqrtService();

        int expected = 3;
        int actual = service.calcSqrt(200, 300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcIncorrect() {
        SqrtService service = new SqrtService();

        int expected = 0;
        int actual = service.calcSqrt(9, 99);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcBottomLine() {
        SqrtService service = new SqrtService();

        int expected = 1;
        int actual = service.calcSqrt(100, 110);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcUpperBound() {
        SqrtService service = new SqrtService();

        int expected = 90;
        int actual = service.calcSqrt(100, 9_801);

        Assertions.assertEquals(expected, actual);
    }
}