package ut;

public class Goods {
	/**
	 * @param goodId;
	 * @param count;
	 * @param mainUnitTypeId;
	 * @param warehouseUnitTypeId;
	 * @see 
	 * <b>goodId</b> - mahsulot id
	 * <b>count</b> - mahsulot soni
	 * <b>mainUnitTypeId</b> - boshlang'ich o'chov birligi 
	 * <b>warehouseUnitTypeId</b> - qanday o'lchov birligida saqlanishi kerakligi
	 * 
	 */
	private int goodId;
	private float count;
	private int mainUnitTypeId;
	private int warehouseUnitTypeId;

	public Goods(int goodId, float count, int mainUnitTypeId, int warehouseUnitTypeId) {
		this.goodId = goodId;
		this.count = count;
		this.mainUnitTypeId = mainUnitTypeId;
		this.warehouseUnitTypeId = warehouseUnitTypeId;
		
	}

	public int getGoodId() {
		return goodId;
	}

	public void setGoodId(int goodId) {
		this.goodId = goodId;
	}

	public float getCount() {
		return count;
	}

	public void setCount(float count) {
		this.count = count;
	}

	public int getMainUnitTypeId() {
		return mainUnitTypeId;
	}

	public void setMainUnitTypeId(int mainUnitTypeId) {
		this.mainUnitTypeId = mainUnitTypeId;
	}

	public int getWarehouseUnitTypeId() {
		return warehouseUnitTypeId;
	}

	public void setWarehouseUnitTypeId(int warehouseUnitTypeId) {
		this.warehouseUnitTypeId = warehouseUnitTypeId;
	}
}
