package Sorts;

import Sorts.QuickSort.QuickSort;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pmazurek on 19.04.2017.
 */
public class QuickSortTest {

    private ISort sort;
    @Before
    public void setUp() throws Exception {

        sort = new QuickSort(0);
    }


    @Ignore
    @Test
    public void sort1() throws Exception {
        CompereSortTest.testSingleSort1(sort);

    }

    @Ignore
    @Test
    public void sort2() throws Exception {
        CompereSortTest.testSingleSort2(sort);

    }

    @Ignore
    @Test
    public void sort3() throws Exception {
        CompereSortTest.testSingleSort3(sort);

    }

}