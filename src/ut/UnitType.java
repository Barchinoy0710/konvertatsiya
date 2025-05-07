package ut;

public class UnitType {
	/**
	 * @param unitTypeId - o'lchov birligi idsi
	 * @param unitType - o'lchov birligi nomi
	 */
	private int unitTypeId;
	private String unitType;
	
	public UnitType(int unitTypeid, String unitType) {
		this.unitTypeId = unitTypeid;
		this.unitType = unitType;
	}
	
	public int getUnitTypeId() {
		return unitTypeId;
	}
	public void setUnitTypeId(int unitTypeId) {
		this.unitTypeId = unitTypeId;
	}
	public String getUnitType() {
		return unitType;
	}
	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

	
}
