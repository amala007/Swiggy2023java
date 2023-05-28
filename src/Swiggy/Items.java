package Swiggy;

import java.util.Arrays;

public class Items extends Hotels
{
	 
	public String[]veg= {"idli-30","dosa-40","pongal-50","poori-40"};
	public String[]nonveg= {"chickenbiryani-200","chicken65-300","chickenlollipop-250","muttonbriyani-350"};
	
	public void pricesplit(String itemrequest,int orderquantity)
     { 
	int i = 0;
		
	if(itemrequest==veg[i])
			{
			for(String eachitem:veg)
		
		{
			String[] afterpricesplit=eachitem.split("-");
			if(afterpricesplit[0].trim().equalsIgnoreCase(itemrequest)) 
			{
			int actualprice=Integer.parseInt(afterpricesplit[1]);
			int totalprice=actualprice*orderquantity;
			System.out.println(Arrays.asList(veg));
			System.out.println("the amount : "+ totalprice);
		   }
		}
			}
			if(itemrequest==(nonveg[i]))
			{
					for(String eachitem1:nonveg)
			{
				String[] afterpricesplit1=eachitem1.split("-");
				if(afterpricesplit1[0].trim().equalsIgnoreCase(itemrequest)) 
				{
				int actualprice=Integer.parseInt(afterpricesplit1[1]);
				int totalprice=actualprice*orderquantity;
				System.out.println(Arrays.asList(nonveg));
				System.out.println("the amount : "+ totalprice);
			   }
			}
			}
			 
		else
		          {
			       System.out.println("Please place the right order");
			       System.out.println("-------------------");
		          }         
	
     }
    

	public static void main(String[]args)
	{
		Items aa=new Items();
		aa.pricesplit("idly",4);
				
	}
}