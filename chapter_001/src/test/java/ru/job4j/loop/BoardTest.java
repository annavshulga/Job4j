package ru.job4j.loop;
import java.util.StringJoiner;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BoardTest {
    @Test
    public void when5And4Then5ColsAnd4Rows() {
        Board board = new Board();
        String result = board.paint(5, 4);
        String line = System.lineSeparator();
        assertThat(result, is(String.format("X X X%s X X %sX X X%s X X %s", line, line, line, line)));
    }
    @Test
    public void when3And7Then3ColsAnd7Rows() {
        Board board = new Board();
        String result = board.paint(6, 3);
        String line = System.lineSeparator();
        String expected = new StringJoiner(line, "", line).add("X X X ").add(" X X X").add("X X X ").toString();
        assertThat(result, is(expected));
    }
}
