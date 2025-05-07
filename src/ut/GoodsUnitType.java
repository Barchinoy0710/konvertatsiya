package ut;

public class GoodsUnitType {
	/**
	 * @param goodsId - Mahsulotning id;
	 * @param asosiySoni - Bir birlikdagi soni
	 * @param mainUnitTypeId - boshlang`ich o'lchov birligi
	 * @param convertSoni - soni
	 * @param convertUnitTypeId - konvertatsiya o'lchob birliki id
	 */
	private int goodsId;
    private double asosiySoni;
    private int mainUnitTypeId;
    double convertSoni;
    int convertUnitTypeId;
    
    public GoodsUnitType(int goodsId, double asosiySoni, int mainUnitTypeId, double convertSoni, int convertUnitTypeId) {
        this.goodsId=goodsId;
        this.asosiySoni=asosiySoni;
        this.mainUnitTypeId=mainUnitTypeId;
        this.convertSoni = convertSoni;
        this.convertUnitTypeId = convertUnitTypeId;
    }
    
	public double getConvertSoni() {
		return convertSoni;
	}

	public int getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	public void setConvertSoni(double soni) {
		this.convertSoni = soni;
	}

	public double getAsosiySoni() {
		return asosiySoni;
	}

	public void setAsosiySoni(double asosiySoni) {
		this.asosiySoni = asosiySoni;
	}

	public int getMainUnitTypeId() {
		return mainUnitTypeId;
	}

	public void setMainUnitTypeId(int mainUnitTypeId) {
		this.mainUnitTypeId = mainUnitTypeId;
	}

	public int getConvertUnitTypeId() {
		return convertUnitTypeId;
	}

	public void setConvertUnitTypeId(int convertUnitTypeId) {
		this.convertUnitTypeId = convertUnitTypeId;
	}
}
