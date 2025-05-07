package ut;

import java.util.ArrayList;
import java.util.List;

public class ColculateUT {
	
	/**@author Masharipov San'atbek
	 * @since 1.0  
	 * @param List<Goods> goodsListFromWarehouse
	 * @param List<GoodsUnitType> kUnitType <br>
	 * method name convert and this method required two parametrs one is Goods list from warehouse
	 * @see
	 * List<Goods> goodsListFromWarehouse - omborxonaga kelgan mahsulotlarning ro`yxat <br>
	 * List<GoodsUnitType> kUnitType - bir o'lchov birlik asosiy o'lchov birlikka nisbat ro'yxati
	 * <br>
	 * <b>Sinfning maqsadi</b>
	 * <br>
	 * Bir nechta o'lchov birligida qabul qilingan mahsulotlarni o'lchov birligini bir xil <br>
	 * o'lchov birligigakeltirib bu mahsulotlarni bir xil o'lchov birligidagi umumiy sonini aniqlash
	 * <br>
	 * <b>Foydalanilgan klaslar:</b>
	 * <li> Goods 
	 * <li> GoodsUnitType
	 * <li> UnitType
	 * </ul>
	 * 
	 * 
 */
	public static Double convert(List<Goods> goodsListFromWarehouse, List<GoodsUnitType> kUnitType) {
		double jamiConvertSoni = 0;
		for (int j = 0; j < goodsListFromWarehouse.size(); j++) {
			if(goodsListFromWarehouse.get(j).getWarehouseUnitTypeId() == goodsListFromWarehouse.get(j).getMainUnitTypeId()) {
				jamiConvertSoni = jamiConvertSoni + goodsListFromWarehouse.get(j).getCount();
				continue;
			}
			for (int i = 0; i < kUnitType.size(); i++) {
				System.out.println(goodsListFromWarehouse.get(j).getWarehouseUnitTypeId()+ " == " + kUnitType.get(i).getConvertUnitTypeId());
				if (goodsListFromWarehouse.get(j).getWarehouseUnitTypeId() == kUnitType.get(i).getConvertUnitTypeId() ) {
					double count = goodsListFromWarehouse.get(j).getCount()/kUnitType.get(i).getConvertSoni();
					jamiConvertSoni = jamiConvertSoni + count;
				}
			}
		}
		return jamiConvertSoni;
	}
	public static List<Goods> constantUT(List<Goods> goodsListFromWarehouse) {
	    List<ConvertConstantUT> kUnitType = ConvertConstantUT.xbs();
	    List<Goods> goodsList = new ArrayList<>(goodsListFromWarehouse);
	    
	    for (int i = 0; i < goodsList.size(); i++) {
	        Goods goods = goodsList.get(i);
	        if (goods.getWarehouseUnitTypeId() == goods.getMainUnitTypeId()) {
	            continue;
	        }
	        for (int j = 0; j < kUnitType.size(); j++) {
	            ConvertConstantUT unitType = kUnitType.get(j);
	            if (goods.getWarehouseUnitTypeId() == unitType.getFirstUnitTypeId() && goods.getMainUnitTypeId() == unitType.getSecondUnitTypeId()) {
	                float count = goods.getCount() * unitType.getCount();
	                goods.setCount(count);
	                break; 
	                } else if (goods.getMainUnitTypeId() == unitType.getFirstUnitTypeId() && goods.getWarehouseUnitTypeId() == unitType.getSecondUnitTypeId()) {
	                float count = goods.getCount() / unitType.getCount();
	                goods.setCount(count); 
	                break; 
	            }
	        }
	    }
	    return goodsList;
	}

}

