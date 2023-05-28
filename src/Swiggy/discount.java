package Swiggy;

public class discount extends Fooditems
{
	String[]vegmenu= {"idli rs-30","dosa rs-40","pongal rs-50","poori rs-40"};
    String[]nonvegmenu={"chickenbiryani-200","chicken65-300","chickenlollipop-250","muttonbriyani-350"};

	
	final double tax=0.18;
	
	public void bill(String hotelname,String itemrequested,int orderquantity)
		{ 
		Fooditems aa=new Fooditems();
		aa.orderdetail(hotelname,itemrequested, orderquantity);
		  
		for(String eachitem:vegmenu)
		{
			String[] afterpricesplit1=eachitem.split("-");
			if(afterpricesplit1[0].trim().equalsIgnoreCase(itemrequested))
			{
			int actualprice2=Integer.parseInt(afterpricesplit1[1]);
			
			int price=orderquantity*actualprice2;
			System.out.println("The amount  :" + price);
			
			 if((orderquantity>=3))
			 {
   	       	 double discount2= (price*.15);
   	       	 double amount2=(price-discount2);
   	  	     System.out.println("YOUR ORDER AFTER 15 % discount IS : " + amount2);
   	         double taxcalculation1=(tax*amount2);
   	         double finalprice=amount2+taxcalculation1;
		     System.out.println("The bill to be paid :" + finalprice);
	         }
			 else if((orderquantity<3))
		     {
	    	 System.out.println("Add 1 more quantity to avail 15% discount");
	   	     System.out.println("YOUR ORDER VALUE :" + price);
             }	
		}
		}
				
			 for(String eachitem1:nonvegmenu)
			 {
					String[] afterpricesplit=eachitem1.split("-");
					int actualprice=Integer.parseInt(afterpricesplit[1]);
					int price1=orderquantity*actualprice;
					System.out.println("The amount  :" + price1);
			 
					 if((orderquantity>=3))
					 {
		   	       	 double discount2= (price1*.15);
		   	       	 double amount2=(price1-discount2);
		   	  	     System.out.println("YOUR ORDER AFTER 15 % discount IS : " + amount2);
		   	         double taxcalculation1=(tax*amount2);
		   	         double finalprice=amount2*taxcalculation1;
				     System.out.println("The bill to be paid :" + finalprice);
			         }
					 else if((orderquantity<3))
				     {
			    	 System.out.println("Add 1 more quantity to avail 15% discount");
			    	 double pricewithoutdiscount=(price1*tax)+price1;
			   	     System.out.println("YOUR ORDER VALUE :" + pricewithoutdiscount);
				     }
			   	   }
		}
	
}
		
		
  
	