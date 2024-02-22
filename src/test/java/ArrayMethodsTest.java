import ru.naumkin.homeworks.homework30.ArrayMethods;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ArrayMethodsTest {
    ArrayMethods arrayMethods;

    @BeforeEach
    public void init() {
        arrayMethods = new ArrayMethods();
    }

    @Test
    public void getArrayWithElementsAfterLastNumberOneTest() {
        Assertions.assertAll(
                () -> {
                    int[] input = {1, 2, 1, 2, 2};
                    int[] expected = {2, 2};
                    Assertions.assertArrayEquals(expected, arrayMethods.getArrayWithElementsAfterLastNumberOne(input));
                },

                () -> {
                    int[] input = {1, 2, 1, 2, 2};
                    int[] expected = {2, 2};
                    Assertions.assertArrayEquals(expected, arrayMethods.getArrayWithElementsAfterLastNumberOne(input));
                },

                () -> {
                    Assertions.assertThrowsExactly(RuntimeException.class, () -> {
                        int[] input = {2, 2, 2, 2, 2};
                        arrayMethods.getArrayWithElementsAfterLastNumberOne(input);
                    });
                }
        );
    }


    @Test
    public void isArrayFilledWithTwoNumbersTest() {
        Assertions.assertAll(
                () -> {
                    int[] input = {1, 2};
                    Assertions.assertTrue(arrayMethods.isArrayFilledWithTwoNumbers(input));
                },
                () -> {
                    int[] input = {1, 1};
                    Assertions.assertFalse(arrayMethods.isArrayFilledWithTwoNumbers(input));
                },
                () -> {
                    int[] input = {1, 3};
                    Assertions.assertFalse(arrayMethods.isArrayFilledWithTwoNumbers(input));
                },
                () -> {
                    int[] input = {1, 2, 2, 1};
                    Assertions.assertTrue(arrayMethods.isArrayFilledWithTwoNumbers(input));
                }
        );
    }


}
