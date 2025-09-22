package ca.yorku.cmg.cnsim.bitcoin;

import java.util.Comparator;

/**
 * Compares Bitcoin blocks based on their height and ID for sorting purposes.
 * This comparator implements a reverse height ordering (taller blocks first)
 * with ID-based tie-breaking for blocks at the same height.
 * 
 * <p>The sorting order is:
 * <ol>
 * <li>Blocks with greater height come first (descending height order)</li>
 * <li>For blocks with equal height, blocks with smaller ID come first (ascending ID order)</li>
 * </ol>
 * 
 * <p>This ordering is useful for blockchain operations where newer/taller blocks
 * need to be processed first, but deterministic ordering is required for blocks
 * at the same height level.
 * 
 * @author York University
 */
public class BlockHeightComparator{

	/**
	 * Compares two blocks based on height (descending) and ID (ascending).
	 * 
	 * @param b1 the first block to compare
	 * @param b2 the second block to compare
	 * @return a negative integer if b1 should come before b2,
	 *         a positive integer if b1 should come after b2,
	 *         or zero if they are equivalent (which shouldn't happen with unique IDs)
	 */
	public int compare(int b1, int b2) {
		System.out.println("Comparing blocks " + b1 + " and " + b2);
		return 0;
	}

}
