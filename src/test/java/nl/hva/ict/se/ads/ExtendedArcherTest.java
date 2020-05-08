package nl.hva.ict.se.ads;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Place all your own tests for Archer in this class. Tests in any other class will be ignored!
 */
public class ExtendedArcherTest extends ArcherTest {
    private List<Archer> archers;

    @BeforeEach
    private void setup() {
        this.archers = Archer.generateArchers(3);
    }

    @Test
    public void archerIdStartsCorrectly() {
        //test start id
        assertEquals(135788, archers.get(0).getId(), "Should be startnumber(135788)");
    }

    @Test
    public void scoreCalculatedCorrectly(){
        int[] tenArray = new int[]{10,10,10};
        int[] zeroArray = new int[]{0,0,0};
        for (int i = 0; i <9 ; i++) {
            archers.get(0).registerScoreForRound(i,tenArray);
        }
        archers.get(0).registerScoreForRound(9,zeroArray);

        //test normal score calculation
        assertEquals(270,archers.get(0).getTotalScore());
        //test weighted score calculation
        assertEquals(276,archers.get(0).getWeightedScore());

    }

}
