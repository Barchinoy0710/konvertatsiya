package ut;

import java.util.ArrayList;
import java.util.List;

public class ConvertConstantUT {
	private int firstUnitTypeId;
	private int count;
	private int secondUnitTypeId;

	public ConvertConstantUT(int firstUnitTypeId, int coun, int secondUnitTypeId) {
		this.firstUnitTypeId = firstUnitTypeId;
		this.count = coun;
		this.secondUnitTypeId = secondUnitTypeId;
	}

	public int getFirstUnitTypeId() {
		return firstUnitTypeId;
	}

	public void setFirstUnitTypeId(int firstUnitTypeId) {
		this.firstUnitTypeId = firstUnitTypeId;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getSecondUnitTypeId() {
		return secondUnitTypeId;
	}

	public void setSecondUnitTypeId(int secondUnitTypeId) {
		this.secondUnitTypeId = secondUnitTypeId;
	}
	public static List<ConvertConstantUT> xbs(){
		
		 List<ConvertConstantUT> xbs = new ArrayList<>();
		 xbs.add(new ConvertConstantUT(2, 1000, 1));
		 xbs.add(new ConvertConstantUT(3, 100, 2));
		 xbs.add(new ConvertConstantUT(3, 100000, 1));
		 xbs.add(new ConvertConstantUT(4, 1000, 2));
		 xbs.add(new ConvertConstantUT(4, 10, 3));
		 xbs.add(new ConvertConstantUT(4, 1000000, 1));
		 xbs.add(new ConvertConstantUT(6, 10, 5));
		 xbs.add(new ConvertConstantUT(7, 10, 6));
		 xbs.add(new ConvertConstantUT(7, 100, 5));
		 xbs.add(new ConvertConstantUT(8, 1000, 5));
		 xbs.add(new ConvertConstantUT(8, 100, 6));
		 xbs.add(new ConvertConstantUT(8, 10, 7));
		 xbs.add(new ConvertConstantUT(9, 1000000, 5));
		 xbs.add(new ConvertConstantUT(9, 100000, 6));
		 xbs.add(new ConvertConstantUT(9, 10000, 7));
		 xbs.add(new ConvertConstantUT(9, 1000, 8));
		 xbs.add(new ConvertConstantUT(10, 1000, 11));
		
		 return xbs;
		 
	 }


}
