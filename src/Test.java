/**
 * 
 */
import s2141601026.*;
import java.io.*;
/**
 * 测试类
 * @author 陈铮 (Heley Chen)
 * 
 */
public class Test {

	/**
	 * 测试
	 * @param args 测试参数
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter O  = new FileWriter("output");
		Player A = new Player("Heley Chen");
		O.write(A.toString()+"\n");
		A.getCash(1000);
		O.write(A.toString()+"\n");
		Door B = new Door ("AAA","wood",1.0,2.1,0.01);
		O.write(B.toString()+"\n");
		O.close();
	}

}
