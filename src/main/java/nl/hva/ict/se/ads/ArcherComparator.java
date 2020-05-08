package nl.hva.ict.se.ads;

import java.util.Comparator;

/**
 * This class is used for comparing archer scores so we know who won
 *
 * @author Elwin Schoofs
 */

public class ArcherComparator implements Comparator<Archer> {

    @Override
    public int compare(Archer o1, Archer o2) {
        if (o1.getTotalScore() == o2.getTotalScore()) {
            if (o1.getWeightedScore() == o2.getWeightedScore()) {
                return o2.getId() - o1.getId();
            }
            return o2.getWeightedScore() - o1.getWeightedScore();
        }
        return o2.getTotalScore() - o1.getTotalScore();
    }
}

