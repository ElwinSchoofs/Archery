package nl.hva.ict.se.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * Given a list of Archer's this class can be used to sort the list using one of three sorting algorithms.
 */
public class ChampionSelector {
    /**
     * This method uses either selection sort or insertion sort for sorting the archers.
     */
    public static List<Archer> selInsSort(List<Archer> archers, Comparator<Archer> scoringScheme) {
        //Selection sort
        for (int i = 0; i < archers.size(); i++) {
            int maximum = i;
            for (int j = i; j < archers.size(); j++) {
                if (scoringScheme.compare(archers.get(maximum), archers.get(j)) > 0) {
                    maximum = j;
                }
            }
            Collections.swap(archers, i, maximum);
        }
        return archers;
    }

    /**
     * This method uses quick sort for sorting the archers.
     */
    public static List<Archer> quickSort(List<Archer> archers, Comparator<Archer> scoringScheme) {
        Collections.shuffle(archers);
        sort(archers, scoringScheme, 0, archers.size() - 1);
        return archers;
    }

    /**
     * this method calls partition for each list or sublist recursively
     *
     * @param archers          list that needs to be sorted
     * @param archerComparator comparator to compare archers
     * @param low              lowest index number of list or sublist
     * @param high             highest index number of list or sublist
     */
    private static void sort(List<Archer> archers, Comparator<Archer> archerComparator, int low, int high) {
        if (high <= low)
            return;
        int j = partition(archers, archerComparator, low, high);
        sort(archers, archerComparator, low, j - 1);
        sort(archers, archerComparator, j + 1, high);
    }

    /**
     * partitions and swaps based on pivot
     *
     * @param archers          list that needs to be sorted
     * @param archerComparator comparator to compare archers
     * @param low              lowest index number of list or sublist
     * @param high             highest index number of list or sublist
     * @return index of pivot
     */
    private static int partition(List<Archer> archers, Comparator<Archer> archerComparator, int low, int high) {
        int i = low;
        int j = high + 1;
        Archer pivot = archers.get(low);

        while (true) {
            while (archerComparator.compare(archers.get(++i), pivot) < 0) if (i == high) break;
            while (archerComparator.compare(pivot, archers.get(--j)) < 0) if (j == low) break;
            if (i >= j) break;
            Collections.swap(archers, i, j);
        }
        Collections.swap(archers, low, j);
        return j;
    }

    /**
     * This method uses the Java collections sort algorithm for sorting the archers.
     */
    public static List<Archer> collectionSort(List<Archer> archers, Comparator<Archer> scoringScheme) {
        archers.sort(scoringScheme);
        return archers;
    }

    /**
     * This method uses quick sort for sorting the archers in such a way that it is able to cope with an Iterator.
     *
     * <b>THIS METHOD IS OPTIONAL</b>
     */
    public static Iterator<Archer> quickSort(Iterator<Archer> archers, Comparator<Archer> scoringScheme) {
        return null;
    }

}
