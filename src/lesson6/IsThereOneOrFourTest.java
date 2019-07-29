package lesson6;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class  IsThereOneOrFourTest{
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 1, 4}, true},
                {new int[]{1, 1, 4, 2, 8}, false},
                {new int[]{1, 1, 1}, false},
                {new int[]{4, 4, 4}, false},
        });
    }

    private int[] array;
    private boolean result;

    public IsThereOneOrFourTest(int[] array, boolean result) {
        this.array = array;
        this.result = result;
    }

    @Test
    public void massTest() {
        Assert.assertEquals(result, ArrayMethods.isThereOneOrFour(array));
    }
}
