// Harekam Kohli 
// SBU ID- 115148763
// CSE-114
//kohli_harekam_Lab7_P2_ques1

package lab_7;
import java.util.*;
public class lab7_2_1 {
	
	
		public static void main(String[] args) {
			
			class Rectangle{
				
				double width = 1;
				double height = 1;
				
				public Rectangle(){
				}
				
				public Rectangle(double newwidth, double newheight){			
				width = newwidth;
				height = newheight;}
				
				public double getPerimeter(){
					double perimeter = 2*height+2*width;
					return perimeter;}
							
				public double getArea(){
					double area = width* height;
					return area;}
			}
			
			
			Rectangle a = new Rectangle(4, 40);
			Rectangle b = new Rectangle(3.5, 35.9);
			
			
			System.out.println("Rectangle a: ");
			System.out.println("width: " + a.width); 
			System.out.println("height: " + a.height);
			System.out.println("area: " + a.getArea());
			System.out.println("perimeter: " + a.getPerimeter());
			
			System.out.println("Rectangle b: ");
			System.out.println("width: " + b.width); 
			System.out.println("height: " + b.height);
			System.out.println("area: " + b.getArea());
			System.out.println("perimeter: " + b.getPerimeter());
					
		}	
			
	

		
	}


