package ru.job4j.loop;
import org.junit.Test;
import java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест Рисования пирамиды и треугольников после рефакторинга кода
 */

public class PaintRefactTest {
    @Test
    public void whenPyramid4() {
        PaintRefact paint = new PaintRefact();
        String result = paint.pyramid(4);
        System.out.println(result);
        String ln = System.getProperty("line.separator");
        String expected = new StringJoiner(ln, "", ln).add("   ^   ").add("  ^^^  ").add(" ^^^^^ ").add("^^^^^^^").toString();
        assertThat(result, is(expected));
    }
    @Test
    public void whenRightTrgl4() {
        PaintRefact paint = new PaintRefact();
        String result = paint.rightTrgl(4);
        System.out.println(result);
        String ln = System.lineSeparator();
        String expected = String.format("   ^%s  ^^%s ^^^%s^^^^%s", ln, ln, ln, ln);
        assertThat(result, is(expected));
        }
    @Test
    public void whenLeftTrgl5() {
        PaintRefact paint = new PaintRefact();
        String result = paint.leftTrgl(5);
        System.out.println(result);
        String ln = System.lineSeparator();
        String expected = new StringJoiner(ln, "", ln).add("^    ").add("^^   ").add("^^^  ").add("^^^^ ").add("^^^^^").toString();
    }
}
