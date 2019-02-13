package ru.job4j.loop;
import org.junit.Test;
import java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест рисования пирамидок и треугольников
 * @author AShulga
 * @version 2.0
 * @since 13.02.2019
 */
public class PaintTest {
    @Test
    public void whenPiramid4() {
        Paint paint = new Paint();
        String result = paint.pyramid(4);
        System.out.println(result);
        String ln = System.getProperty("line.separator");
        String expected = new StringJoiner(ln, "", ln).add("   ^   ").add("  ^^^  ").add(" ^^^^^ ").add("^^^^^^^").toString();
        assertThat(result, is(expected));
    }
    @Test
    public void whenPiramid5() {
        Paint paint = new Paint();
        String result = paint.pyramid(5);
        System.out.println(result);
        String ln = System.lineSeparator();
        String expected = String.format("    ^    %s   ^^^   %s  ^^^^^  %s ^^^^^^^ %s^^^^^^^^^%s", ln, ln, ln, ln, ln);
        assertThat(result, is(expected));
    }
    @Test
    public void whenRightTrianle4() {
        Paint paint = new Paint();
        String result = paint.rightTrgl(4);
        System.out.println(result);
        String ln = System.lineSeparator();
        String expected = new StringJoiner(ln, "", ln).add("   ^").add("  ^^").add(" ^^^").add("^^^^").toString();
        assertThat(result, is(expected));
    }
    @Test
    public void whenLeftTriangle5() {
        Paint paint = new Paint();
        String result = paint.leftTrgl(5);
        System.out.println(result);
        String ln = System.getProperty("line.separator");
        String expected = String.format("^    %s^^   %s^^^  %s^^^^ %s^^^^^%s", ln, ln, ln, ln, ln);
        assertThat(result, is(expected));
    }
}
