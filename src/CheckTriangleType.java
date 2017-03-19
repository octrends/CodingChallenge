/**
* CheckTriangleType.java
* This class is a entry point to determine the type of triangle based on the 3 input sides
* or will it be a valid triangle. 
*
* @author  Sanjay Kalra
* @version 1.0
* @createdDate   03-18-2017
* 
*  Version History
*  Date 				Version  		Developer		Comments
*  03/18/2017			1.0    			skalra          Initial Release
*  
*/

import java.util.Arrays;
import com.flexion.util.Triangle;

public class CheckTriangleType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if (args!=null && args.length!=3) {
			System.out.println("Invalid input. Please input 3 numbers to determine the triangle type.");
			System.out.println("Usage: Please see run.bat file.");
			return;
		}
		
		//Check that all of the argunments are of integer type or not?
		double[] param = new double[3];	
		try {
			param[0] = Double.parseDouble(args[0]);
			param[1] = Double.parseDouble(args[1]);
			param[2] = Double.parseDouble(args[2]);
			//Sort the input array to make sure that it's a valid triangle s1+s2>s3
			Arrays.sort( param );
		} catch (Exception e) {
			System.out.println("Invalid input number:" + e.getMessage());
			return;
		}
		
		Triangle triangle = new Triangle(param);
		System.out.println("Triangle is of Type:" + triangle.findTriangleType());

	}

}
