/**
 * 
 */
package s2141601026;
/**
 * 接口：有价值的，可估价的
 * @author 陈铮 (Heley Chen)
 *
 */
public interface Valuable {
	/**
	 * 估价
	 * @return 价格
	 */
	public double toValue();
	/**
	 * 统计...的总价
	 * @param objects 对象们
	 * @return 估值
	 */
	//abstract public double Sum(Object... objects);
}
