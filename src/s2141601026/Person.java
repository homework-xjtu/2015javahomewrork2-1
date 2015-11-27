/**
 * 
 */
package s2141601026;


/**
 * 人类
 * @author 陈铮 (Heley Chen)
 *
 */
public class Person  {
	/**
	 * 完全构造器
	 * @param name 名字
	 */
	public Person(String name){
		this.name = name;
	}
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	public String toString(){
		return "My name is "+this.name+".";
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
