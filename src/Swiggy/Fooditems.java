package Swiggy;

import java.util.Arrays;

public class Fooditems extends Hotels
{ 
	String[]vegmenu= {"idli rs-30","dosa rs-40","pongal rs-50","poori rs-40"};
     String[]nonvegmenu={"chickenbiryani-200","chicken65-300","chickenlollipop-250","muttonbriyani-350"};

       public void orderdetail(String hotelname,String itemrequested,int orderquantity)
   {
    	   Hotels aa=new Hotels();
    		   aa.hotels(hotelname);
   		System.out.println("-------------------");
   		System.out.println("PLEASE SELECT THE MENU");
		if ((hotelname=="A2B")||(hotelname=="HSB"))
		{
			System.out.println(Arrays.asList(vegmenu));
			System.out.println("You have ordered :" + itemrequested+ "\t"+  orderquantity+ " quantity");
		}
		else if((hotelname=="KFC")||(hotelname=="SB"))
   		 { 
			 System.out.println(Arrays.asList(nonvegmenu));
			 System.out.println("You have ordered :" + itemrequested+ "\t");
            }  
		else {
			System.out.println("please choose the right order");
		}
	 
  }         
}
