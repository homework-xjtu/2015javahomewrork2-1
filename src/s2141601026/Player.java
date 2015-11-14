/**
 * 
 */
package s2141601026;

/**
 * 玩家类
 * @author 陈铮 (Heley Chen)
 *
 */
public class Player extends Person implements Valuable {
	/**
	 * 完全构造器
	 * @param name 名字
	 * @param cash 现金
	 * @param deposit 存款
	 */
	private Player(String name, double cash, double deposit) {
		super(name);
		this.cash = cash;
		this.deposit = deposit;
	}
	/**
	 * 一个裸人
	 * @param name 名字
	 */
	public Player(String name){
		this(name,0,0);
	}
	/**
	 * 获得现金
	 * @param amount 数额
	 */
	public void getCash(double amount){
		if(amount >= 0){
			this.cash +=amount;
		}
	}
	/* (non-Javadoc)
	 * @see s2141601026.Valuable#toValue()
	 */
	@Override
	public double toValue() {
		// TODO Auto-generated method stub
		return cash + deposit;
	}
	public String toString(){
		return super.toString() + " I have $" + this.cash +" in cash and $"+this.deposit + " in deposit."
				+" So, They value me as $"+ this.toValue()+".";
	}
	/**
	 * 功能测试
	 * @param args 参数
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private double cash;
	private double deposit;

}
