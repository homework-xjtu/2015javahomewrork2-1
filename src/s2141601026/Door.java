/**
 * 
 */
package s2141601026;

/**
 * 门类
 * @author 陈铮 (Heley Chen)
 *
 */
public class Door extends Thing implements Valuable {
	/**
	 * 完全构造器
	 * @param name 名字
	 * @param type 类型
	 * @param width 宽度
	 * @param height 高度
	 * @param thickness 厚度
	 */

	public Door(String name,String type,double width,double height,double thickness) {
		super(name);
		this.type = type;
		this.width = width;
		this.height = height;
		this.thickness = thickness;
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see s2141601026.Valuable#toValue()
	 */
	@Override
	public double toValue() {
		// TODO Auto-generated method stub
		double price;
		switch(this.type){
		case "wood":
			price = 2;
			break;
		case "plastic":
			price = 1;
			break;
		default :
			price = 0;
		}
		return price * width * height * thickness;
	}
	public String toString(){
		return "This is a door named " + getName() + ", which is valued $"+toValue()+".";
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	private double width,height,thickness;
	private String type;
}
