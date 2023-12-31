import com.opencsv.exceptions.CsvException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Файл test/resources/movementListInteger.csv (значения целые)")
public class TestMovementListInteger {

    private static final double DELTA = 0.01;
    private static final String CSV_FILENAME = "movementListInteger.csv";

    @Test
    @DisplayName("Сумма прихода")
    void testSumIncome() throws IOException, CsvException {
        assertEquals(1500.0, new Movements(getCsvFilenamePath()).getIncomeSum(), DELTA);
    }

    @Test
    @DisplayName("Сумма расходов")
    void testSumExpense() throws IOException, CsvException {
        assertEquals(300.0, new Movements(getCsvFilenamePath()).getExpenseSum(), DELTA);
    }

    private String getCsvFilenamePath() {
        return new File(this.getClass().getResource(CSV_FILENAME).getPath()).getAbsolutePath();
    }

}