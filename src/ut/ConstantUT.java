package ut;

import java.util.ArrayList;
import java.util.List;

public class ConstantUT {
	
	private int uTId;
	private String uTName;
	
	public int getuTId() {
		return uTId;
	}
	public void setuTId(int uTId) {
		this.uTId = uTId;
	}
	public String getuTName() {
		return uTName;
	}
	public void setuTName(String uTName) {
		this.uTName = uTName;
	}
	public ConstantUT(int uTId, String uTName){
		this.uTId=uTId;
		this.uTName=uTName;
	}
	public static List<ConstantUT>ConstanatUnitType(){
		List<ConstantUT>xbs=new ArrayList<>();
		xbs.add(new ConstantUT(1, "gramm"));
		xbs.add(new ConstantUT(2, "kilogramm"));
		xbs.add(new ConstantUT(3, "sentiner"));
		xbs.add(new ConstantUT(4, "tonna"));
		xbs.add(new ConstantUT(5, "millimetr"));
		xbs.add(new ConstantUT(6, "santimetr"));
		xbs.add(new ConstantUT(7, "detsimetr"));
		xbs.add(new ConstantUT(8, "metr"));
		xbs.add(new ConstantUT(9, "kilometr"));
		xbs.add(new ConstantUT(10, "litr"));
		xbs.add(new ConstantUT(11, "millilitr"));
		
		
		return ConstanatUnitType();
		
	}
	
}
