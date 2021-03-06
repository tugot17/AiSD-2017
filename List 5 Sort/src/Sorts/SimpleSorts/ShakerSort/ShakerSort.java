package Sorts.SimpleSorts.ShakerSort;

import Helpers.IntegersGenerator;
import Helpers.Sort;
import Messages.SortMessage;
import Sorts.ISort;

/**
 * Created by pmazurek on 23.04.2017.
 */
public class ShakerSort extends Sort implements ISort{

    //<editor-fold desc="Public Methods">
    @Override
    public void sort(int amountOfSortedElements) {
        this.amountOfSortedElements = amountOfSortedElements;
        array = IntegersGenerator.createRandomArrayGenerator(amountOfSortedElements);

        sort(array);
    }

    @Override
    public void sort(int [] array) {

        this.array = array;
        int helper;

        int end = array.length - 1;
        int begenning = 0;


        stopper.start();
        boolean swapped;
        do {
            swapped = false;
            for (int i = begenning; i < end; i++) {
                if (array[i] > array[i + 1]) {
                    helper = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = helper;
                    swapped = true;
                }

                amountOfComparasion++;
            }

            end--;

            if (!swapped) {
                break;
            }
            swapped = false;
            for (int i = end; i >= begenning; i--) {
                if (array[i] > array[i + 1]) {
                    helper = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = helper;
                    swapped = true;
                }
                amountOfComparasion++;

            }
            if (!swapped) {
                break;
            }

            begenning++;

        } while (swapped);

        stopper.stop();

        SortMessage.showSortInformations("Shaker", array.length, amountOfComparasion, stopper.getResult());

        amountOfComparasion = 0;
    }
    //</editor-fold>


}
