/**
* Triangle.java
* This class will be used to determine the type of triangle based on 3 sides as input
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

package com.flexion.util;

public class Triangle {
	//Triange Types
    public String TYPE_SCALENE 		= "Scalene";
    public String TYPE_ISOSCELES 	= "Isosceles";
    public String TYPE_EQUILATERAL 	= "Equilateral";
    public String TYPE_UNKNOWN 		= "Not a triangle";
	
	//Triangle Sides
    private double side1, side2, side3;
    

    /* Constructor with 3 sides as parameters. 
     * 
     * Version History
     * Date 				Version  		Developer		Comments
     * 03/18/2017			1.0    			skalra          Initial Release
     */  
   public Triangle (double s1, double s2, double s3) {
	  //System.out.println("side1:" + s1 + " , side2:" + s2 + " , side3:" + side3); 
	  side1 = s1;
      side2 = s2;
      side3 = s3;
   }

   /* Constructor with parameter as double array  
    * 
    * Version History
    * Date 				Version  		Developer		Comments
    * 03/18/2017			1.0    			skalra          Initial Release
    */  
   public Triangle (double[] sides) {
	  //System.out.println("side1:" + sides[0] + " , side2:" + sides[1] + " , side3:" + sides[2]); 
	  side1 = sides[0];
      side2 = sides[1];
      side3 = sides[2];
   }
   
   /* Check for Triangle type as Scalene 
    * 
    * Version History
    * Date 				Version  		Developer		Comments
    * 03/18/2017			1.0    			skalra          Initial Release
    */  
   public boolean isScalene () {
      if ((side1 != side2) && (side1 != side3) && (side2 != side3))
         return true;
      else
         return false;
   }

   /* Check for Triangle type as Isosceles  
    * 
    * Version History
    * Date 				Version  		Developer		Comments
    * 03/18/2017			1.0    			skalra          Initial Release
    */  
   public boolean isIsosceles () {
      if (((side1 == side2) && (side1 != side3)) ||
          ((side1 == side3) && (side1 != side2)) ||
          ((side2 == side3) && (side2 != side1)))
         return true;
      else
         return false;
   }

   /* Check for Triangle type as Equilateral  
    * 
    * Version History
    * Date 				Version  		Developer		Comments
    * 03/18/2017			1.0    			skalra          Initial Release
    */  
   public boolean isEquilateral () {
      if ((side1 == side2) && (side1 == side3))
         return true;
      else
         return false;
   }

   /* Check whether it's a valid triangle or not.  
    * 
    * Version History
    * Date 				Version  		Developer		Comments
    * 03/18/2017			1.0    			skalra          Initial Release
    */  
   public boolean isValidTriangle () {
	      if ((side1 + side2) > side3)
	         return true;
	      else
	         return false;
	   }
  
   /* Determines the type of triangle.  
    * 
    * Version History
    * Date 				Version  		Developer		Comments
    * 03/18/2017			1.0    			skalra          Initial Release
    */  
   public String findTriangleType() {
	   
	   if (!isValidTriangle())
		   return TYPE_UNKNOWN;
	   else if (isScalene()) 
		        return TYPE_SCALENE;
	   else if (isIsosceles()) 
		   		return TYPE_ISOSCELES;
	   else if (isEquilateral()) 
		   		return TYPE_EQUILATERAL;
	   
	   return TYPE_UNKNOWN;
   }
}
