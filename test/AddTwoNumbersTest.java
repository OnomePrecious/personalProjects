import chapterOne.AddTwoNumbers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AddTwoNumbersTest {
    @Test
    public void TestThat_FunctionCanAddTwoNumbers(){
        AddTwoNumbers add = new AddTwoNumbers();

        int result = AddTwoNumbers.addition(10, 20);
        assertEquals(30, result);
    }
}
