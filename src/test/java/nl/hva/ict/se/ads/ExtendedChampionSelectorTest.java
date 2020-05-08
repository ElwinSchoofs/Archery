package nl.hva.ict.se.ads;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Place all your own tests for ChampionSelector in this class. Tests in any other class will be ignored!
 */
public class ExtendedChampionSelectorTest extends ChampionSelectorTest {

    private List<Archer> speedTesCollectionSortList;
    private List<Archer> speedTestQuickSortList;
    private List<Archer> speedTestSelInsSortList;


    @BeforeEach
    public void setupSpeedTest() {
        this.speedTesCollectionSortList = Archer.generateArchers(1600);
        this.speedTestQuickSortList = speedTesCollectionSortList;
        this.speedTestSelInsSortList = speedTestQuickSortList;

    }

//    @Test
//    public void quickSortAndCollectionSortResultInSameOrder() {
//        List<Archer> unsortedArchersQuickSort = Archer.generateArchers(23);
//        List<Archer> unsortedArchersForCollection = new ArrayList<>(unsortedArchersQuickSort);
//
//        List<Archer> sortedArchersQuickSort = ChampionSelector.selInsSort(unsortedArchersQuickSort, comparator);
//        List<Archer> sortedArchersCollection = ChampionSelector.collectionSort(unsortedArchersForCollection, comparator);
//
//        assertEquals(sortedArchersCollection, sortedArchersQuickSort);
//    }
//
//    @Test
//    public void sortingCorrectly() {
//        //tests all sort methods on priority of sorting (Score => Weighted score => Id)
//        List<Archer> archersCollectionSort = Archer.generateArchers(4);
//        int[] missArray = new int[]{0, 0, 0};
//        int[] hitOneArray = new int[]{1, 1, 1};
//        int[] hitTenArray = new int[]{10, 10, 10};
//
//        for (int i = 0; i < 10; i++) {
//            archersCollectionSort.get(3).registerScoreForRound(i, missArray);
//        }
//        for (int i = 0; i < 10; i++) {
//            archersCollectionSort.get(2).registerScoreForRound(i, missArray);
//        }
//        for (int i = 0; i < 9; i++) {
//            archersCollectionSort.get(1).registerScoreForRound(i, missArray);
//        }
//        archersCollectionSort.get(1).registerScoreForRound(9, hitTenArray);
//        for (int i = 0; i < 10; i++) {
//            archersCollectionSort.get(0).registerScoreForRound(i, hitOneArray);
//        }
//
//        List<Archer> archersQuickSort = archersCollectionSort;
//        List<Archer> archersSelInsSort = archersCollectionSort;
//
//        //test quick sort
//        ChampionSelector.quickSort(archersQuickSort, comparator);
//        assertEquals(30, archersQuickSort.get(0).getTotalScore());
//        assertEquals(60, archersQuickSort.get(0).getWeightedScore());
//        assertEquals(30, archersQuickSort.get(1).getTotalScore());
//        assertEquals(-156, archersQuickSort.get(1).getWeightedScore());
//
//        assertEquals(0, archersQuickSort.get(2).getTotalScore());
//        assertEquals(-210, archersQuickSort.get(2).getWeightedScore());
//        assertEquals(0, archersQuickSort.get(3).getTotalScore());
//        assertEquals(-210, archersQuickSort.get(3).getWeightedScore());
//        assertTrue(archersQuickSort.get(2).getId()>archersQuickSort.get(3).getId());
//
//        //test sellInSort
//        ChampionSelector.selInsSort(archersSelInsSort, comparator);
//        assertEquals(30, archersSelInsSort.get(0).getTotalScore());
//        assertEquals(60, archersSelInsSort.get(0).getWeightedScore());
//        assertEquals(30, archersSelInsSort.get(1).getTotalScore());
//        assertEquals(-156, archersSelInsSort.get(1).getWeightedScore());
//
//        assertEquals(0, archersSelInsSort.get(2).getTotalScore());
//        assertEquals(-210, archersSelInsSort.get(2).getWeightedScore());
//        assertEquals(0, archersSelInsSort.get(3).getTotalScore());
//        assertEquals(-210, archersSelInsSort.get(3).getWeightedScore());
//        assertTrue(archersSelInsSort.get(2).getId()>archersQuickSort.get(3).getId());
//
//        //test collection sort
//        ChampionSelector.collectionSort(archersCollectionSort, comparator);
//        assertEquals(30, archersCollectionSort.get(0).getTotalScore());
//        assertEquals(60, archersCollectionSort.get(0).getWeightedScore());
//        assertEquals(30, archersCollectionSort.get(1).getTotalScore());
//        assertEquals(-156, archersCollectionSort.get(1).getWeightedScore());
//
//        assertEquals(0, archersCollectionSort.get(2).getTotalScore());
//        assertEquals(-210, archersCollectionSort.get(2).getWeightedScore());
//        assertEquals(0, archersCollectionSort.get(3).getTotalScore());
//        assertEquals(-210, archersCollectionSort.get(3).getWeightedScore());
//        assertTrue(archersCollectionSort.get(2).getId()>archersQuickSort.get(3).getId());
//    }


    @Test
    public void speedTestCollectionSort() {
        ChampionSelector.collectionSort(speedTesCollectionSortList,comparator);
    }

    @Test
    public void speedTestQuickSort() {
        ChampionSelector.quickSort(speedTestQuickSortList,comparator);
    }

    @Test
    public void speedTestSelInsSort() {
        ChampionSelector.selInsSort(speedTestSelInsSortList,comparator);
    }

}

