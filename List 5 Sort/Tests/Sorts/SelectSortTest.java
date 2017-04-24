package Sorts;

import Sorts.InsertSort.InsertSort;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by pmazurek on 19.04.2017.
 */
public class SelectSortTest {

    private ISort sort;

    @Before
    public void setUp() throws Exception {
        sort = new InsertSort(1);
    }

    @Test
    public void sort1() throws Exception {
        SortTestingHelper.testSingleSort1(sort);

    }

    @Test
    public void sort2() throws Exception {
        SortTestingHelper.testSingleSort2(sort);

    }

    @Test
    public void sort3() throws Exception {
        SortTestingHelper.testSingleSort3(sort);

    }

}