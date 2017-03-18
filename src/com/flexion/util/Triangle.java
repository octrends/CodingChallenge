package com.flexion.util;

public class Triangle {

	//Triangle Sides
    private double side1, side2, side3;
    public String TYPE_SCALENE = "Scalene";
    public String TYPE_ISOSCELES = "Isosceles";
    public String TYPE_EQUILATERAL = "Equilateral";
    public String TYPE_UNKNOWN = "Not a triangle";
    

   //Constructor.
   public Triangle (double s1, double s2, double s3) {
	  System.out.println("side1:" + s1 + " , side2:" + s2 + " , side3:" + side3); 
	  side1 = s1;
      side2 = s2;
      side3 = s3;
   }

   //Constructor.
   public Triangle (double[] sides) {
	  System.out.println("side1:" + sides[0] + " , side2:" + sides[1] + " , side3:" + sides[2]); 
	  side1 = sides[0];
      side2 = sides[1];
      side3 = sides[2];
   }
   
   //Check for Scalene
   public boolean isScalene () {
      if ((side1 != side2) && (side1 != side3) && (side2 != side3))
         return true;
      else
         return false;
   }

   //Check for Isosceles.
   public boolean isIsosceles () {
      if (((side1 == side2) && (side1 != side3)) ||
          ((side1 == side3) && (side1 != side2)) ||
          ((side2 == side3) && (side2 != side1)))
         return true;
      else
         return false;
   }

   //Check for Equilateral.
   public boolean isEquilateral () {
      if ((side1 == side2) && (side1 == side3))
         return true;
      else
         return false;
   }

   public boolean isValidTriangle () {
	      if ((side1 + side2) > side3)
	         return true;
	      else
	         return false;
	   }
  
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
