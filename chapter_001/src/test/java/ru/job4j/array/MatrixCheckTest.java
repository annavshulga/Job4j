package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест проверки равенства значений внутри диагоналей матрицы boolean
 * @author AShulga
 * @version 0.1
 * @since 22.02.2019
 */

public class MatrixCheckTest {
    @Test
    public void whenDiagonalsMonoByTrueThenTrue3On3() {
        MatrixCheck matrixCheck = new MatrixCheck();
        boolean[][] array = {{true, false, true}, {false, true, false}, {true, false, true}};
        boolean result = matrixCheck.mono(array);
        assertThat(result, is(true));
    }

    @Test
    public void whenDiagonalsMonoByTrueThenTrue4On4() {
        MatrixCheck matrixCheck = new MatrixCheck();
        boolean[][] array = {{true, false, true, true}, {false, true, true, false}, {false, true, true, false}, {true, false, false, true}};
        boolean result = matrixCheck.mono(array);
        assertThat(result, is(true));
    }

    @Test
    public void whenDiagonalsMonoByFalseThenTrue() {
        MatrixCheck matrixCheck = new MatrixCheck();
        boolean[][] array = {{false, true, true, false}, {true, false, false, true}, {true, false, false, true}, {false, true, true, false}};
        boolean result = matrixCheck.mono(array);
        assertThat(result, is(true));
    }

    @Test
    public void whenDiagonalsNotMonoThenFalse() {
        MatrixCheck matrixCheck = new MatrixCheck();
        boolean[][] array = {{false, true, true, false}, {true, false, false, true}, {true, false, false, true}, {false, true, true, true}};
        boolean result = matrixCheck.mono(array);
        assertThat(result, is(false));
    }

    @Test
    public void when4On4OneDiaganalTrueAnotheFalseThenTrue() {
        MatrixCheck matrixCheck = new MatrixCheck();
        boolean[][] array = {{false, true, true, true}, {true, false, true, true}, {true, true, false, false}, {true, true, true, false}};
        boolean result = matrixCheck.mono(array);
        assertThat(result, is(true));
    }

    @Test
    public void when3On3OneDiaganalTrueAnotherFalseThenFale() {
        MatrixCheck matrixCheck = new MatrixCheck();
        boolean[][] array = {{false, true, true}, {true, false, true}, {true, true, false}};
        boolean result = matrixCheck.mono(array);
        assertThat(result, is(false));
    }
}
