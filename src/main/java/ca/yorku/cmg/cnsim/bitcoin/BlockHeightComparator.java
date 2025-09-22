package ca.yorku.cmg.cnsim.bitcoin;

import java.util.Comparator;

public class BlockHeightComparator implements Comparator<Block> {


	@Override
	public int compare(Block b1, Block b2) {
		if (b1.getHeight() < b2.getHeight())
			return 1;
		else 
			if (b1.getHeight() == b2.getHeight()) 
				if (b1.getID() < b2.getID())
					return 1;
				else
					return -1;
			else //height is greater
				return -1;
	}

}
