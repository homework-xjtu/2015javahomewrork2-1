/**
 * 
 */
package s2141601026;

/**
 * 事物类
 * @author 陈铮 (Heley Chen)
 *
 */
public class Thing {
	public Thing(String name){
		this.name = name;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "It's a thing named " + name + ".";
	}

	private String name;
}
