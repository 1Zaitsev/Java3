package lesson6;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SplitBy4Test {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 2, 3, 4}, new int[]{}},
                {new int[]{1, 4, 3, 2, 1}, new int[]{3, 2, 1}},
                {new int[]{1, 2, 3, 4, 1, 2, 3, 4, 5, 6}, new int[]{5, 6}},
        });
    }

    private int[] array;
    private int[] result;

    public SplitBy4Test(int[] array, int[] result){
        this.array = array;
        this.result = result;
    }

    @Test
    public void test(){
        Assert.assertArrayEquals(result, ArrayMethods.splitBy4(array));
    }
}
