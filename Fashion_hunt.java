import java.util.InputMismatchException;
import java.util.Scanner;



class categries
{
	String type;
	String color;
	String price;
	
  public void categries()
  { 
	  System.out.println("Select type where you like to shop");
	  System.out.println("");
	  System.out.println("*********************************");
	  System.out.println("Enter 1 to goTo Mens store");
	  System.out.println("Enter 2 to goTo Womens store  ");
	  System.out.println("*********************************");
	  
	  categries ref1 = new mens_Store(); //upcasting
	  
	  mens_Store ref2 = (mens_Store)ref1;//Downcasting
	  
      categries ref3 = new womens_Store(); //upcasting
	  
	  womens_Store ref4 = (womens_Store)ref3; //downcasting
	  
	  Scanner q= new Scanner(System.in);
	  
	  String o =q.nextLine();
	  
	  switch(o)
	  {
	  case "1" :System.out.println("Entering to Mens department");
	            System.out.println("<><><><><><><><><><><><><><><><>");
	           ref2.mens_Store();
	   break;        
	           
	  case  "2":  System.out.println("Entering to Womens department");
      			  System.out.println("<><><><><><><><><><><><><><><><>");
      			  ref4.womens_Store(); 
      	break;
      default: System.out.println("Only 2 Departments is available ");
               System.out.println("choose only given option ");
       categries();        
	  }
	  
  }
		
}

class mens_Store extends categries
{
	//String Field;
	//String price;
	public void mens_Store()
	{
		System.out.println("Select field in which you want to shop");
		System.out.println("*----------------------------*");
		System.out.println(" Enter 1 for clothing");
		System.out.println(" Enter 2 for Footwear");
		System.out.println(" Enter 3 for Perfumes_Deo");
		System.out.println(" Enter 4 for Go back to Store");
		System.out.println("*----------------------------*");
		
		mens_Store m1= new clothing_mens();//upcasting
		
		clothing_mens m2=(clothing_mens)m1;//downcasting
		
		mens_Store m3= new footwear_mens();//upcasting
		
		footwear_mens m4=(footwear_mens)m3;//downcasting
		
		mens_Store m5= new perfumes_mens();//upcasting
		
		perfumes_mens m6=(perfumes_mens)m5;//downcasting
		
		Scanner p = new Scanner(System.in);
		
		String p1=p.nextLine();
		
		switch (p1) 
		{
		case "1":System.out.println("Entering into Cloths section ");
		      m2.cloths_mens();
			break;
		case "2":System.out.println("Entering into Footwear section");
			 m4.foot_mens();
			 break;
		case "3":System.out.println("Entering into perfumes section");
		     m6.perfume_mens();
		     break;
		case "4":
			categries();
			break;

		default:System.out.println("Enter above option");
		  mens_Store();
			break;
		}
		
	}
}

class clothing_mens extends mens_Store
{
	//String wear;
	//double price;
	public void cloths_mens()
	{
		
		System.out.println("----------------------------------------");
		System.out.println("           Select Topwear               ");
		System.out.println("        Enter 1 for T-shirts            ");
		System.out.println("        Enter 2 for Shirts              ");
		
		System.out.println("------------------------------------------");
		System.out.println("           Select Bottomwear              ");
		System.out.println("          Enter 3 for jeans               ");
		System.out.println("        Enter 4 for Tourser");
		System.out.println("------------------------------------------");
		System.out.println("Enter 5 for Go back to Mens Store");
		System.out.println("------------------------------------------");
		
		clothing_mens c1=new T_shirts();
		
		T_shirts c2=(T_shirts)c1;
		
		clothing_mens c3=new shirts();
		
		shirts c4=(shirts)c3;
		
		
		clothing_mens c7=new Jeans();
		
		Jeans c8=(Jeans)c7;
		
		clothing_mens c9=new pantsF();
		
		pantsF c0=(pantsF)c9;
		
		Scanner s = new Scanner(System.in);
		
		String s1=s.nextLine();
		
		switch (s1) {
		case "1":System.out.println("choose T-shirts of your choice");
		     c2.tshirts();
			
			break;
			
		case "2":System.out.println("choose shirts of your choice");
			c4.shirt();
		
		break;
		
		
		
		case "3":System.out.println("choose Jeans of your choice");
	     	c8.jeans();
		
		break;
		
		case "4":System.out.println("choose pants of your choice");
	     	c0.pants();
		
		break;
		
		case"5":
			mens_Store();
		break;
		

		default:System.out.println(" choose vaild option ");
		 cloths_mens();
			break;
		}
		
			
	}
}


class T_shirts extends clothing_mens
{
	String brand;
	String material;
	String productid;
	String colour;
	String pattern;
	String avbSize;
	String price;
	public void tshirts()
	{
		System.out.println("Select Your Favourite Brand ");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("         1:POLO                             ");
		System.out.println("         2:H&M                              ");
		System.out.println("         3:ROADSTER                         ");
		System.out.println("         4:WRONG                            ");
		System.out.println("         5:Back to mens cloths              ");
		System.out.println("____________________________________________");
		
		Polo p =new Polo();
		
		H_M h= new H_M();
		
		Roadster r=new Roadster();
		
		Wrong w = new Wrong();
		
		Scanner t=new Scanner(System.in);
		  String z=t.next();
		  
		  switch (z) {
		case "1":
			    p.polo();
			
			break;
			
		case "2":
			    h.hm();
			
			break;
			
		case "3":
		    r.roadster();
		
		break;
		
		case "4":
		    w.wrong();
		
		break;
		
		case "5":
		    cloths_mens();
		
		break;

		default:System.out.println(" please provide vaild choice");
			break;
		}
		  
		  
		
	}	
}

	class Polo extends T_shirts
	{
		public void polo()
		{
			System.out.println(" you have selected polo brand   ");
			System.out.println(" Enter 1 for poloxe234          ");
			System.out.println(" Enter 2 for polosc456          ");
			System.out.println(" Enter 3 for polo23cb45         ");
			System.out.println(" Enter  4 for  back to Tshirts  ");
			
			Scanner sc=new Scanner(System.in);
	        String k=sc.next();
	        
	        switch (k) {
			case "1":System.out.println("_______________________");
			poloxe234 p=new poloxe234("Polo", " cotton","poloxe234","White"," Solid","S,M,L,Xl", "899");
				break;
			
			case "2":System.out.println("_______________________");
			polosc456 pa =new polosc456("Polo", "Linen", "polosc456","Blue","Round neck printed", "S,M,L,Xl",  "1099");
			break;
			
			case "3":System.out.println("_______________________");
			polo23cb45 pb =new polo23cb45("Polo", " cotton",  "polo23cb45", "Green"," StripBlocks", "S,M,L,Xl", "1599");
			break;
			
			case "4":
				tshirts();
			break;

			default:System.out.println("Please choose given items only");
				polo();
	         }
		}
		
		public void P() 
		{
			System.out.println("Brand_name: " + brand);
			System.out.println("Material: " + material);
			System.out.println("Product_id: " + productid);
			System.out.println("Colour :" + colour);
			System.out.println("Pattern :" + pattern);
			System.out.println("Available Size :" + avbSize);
			System.out.println("Price :" + price);
			System.out.println("*****************************");
			
			buy b=new buy();
			b.buy();
			
			
		}
		
	}
	
	class poloxe234 extends Polo
	{
		poloxe234(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
		{
			this.brand=brand;
			this.material=material;
			this.productid=productid;
			this.colour=colour;
			this.pattern=pattern;
			this.avbSize=avbSize;
			this.price=price;
			
			P();
		}
	}
	
	class polosc456 extends Polo
	{
		polosc456(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
		{
			this.brand=brand;
			this.material=material;
			this.productid=productid;
			this.colour=colour;
			this.pattern=pattern;
			this.avbSize=avbSize;
			this.price=price;
			
			P();
		}
	}
	
	class polo23cb45 extends Polo
	{
		polo23cb45(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
		{
			this.brand=brand;
			this.material=material;
			this.productid=productid;
			this.colour=colour;
			this.pattern=pattern;
			this.avbSize=avbSize;
			this.price=price;
			
			P();
		}
	}
	
	
	
	class H_M extends T_shirts
	{
		public void hm()
		{
			System.out.println(" you have selected H&M brand");
			System.out.println(" Enter 1 for HMwqr321");
			System.out.println(" Enter 2 for HMola458");
			System.out.println(" Enter 3 for HMkkk89");
			System.out.println(" Enter  4 for  back to Tshirts  ");
			
			
			Scanner sc=new Scanner(System.in);
	        String k=sc.next();
	        
	        switch (k) {
			case "1":System.out.println("_______________________");
			HMwqr321 p=new HMwqr321("H&M"," cotton","poloxe234","White"," Solid", "S,M,L,Xl", "599");
				break;
			
			case "2":System.out.println("_______________________");
			HMola458 pa =new HMola458("H&M","Linen","HMola458","Black","printed","S,M,L,Xl","1699");
			break;
			
			case "3":System.out.println("_______________________");
			HMkkk89 pb =new HMkkk89("H&M"," cotton", "HMkkk89","Grey"," StripBlocks","S,M,L,Xl","999");
			break;
			
			case "4":
				tshirts();
			break;

			default:System.out.println("Please choose given items only");
				hm();
	         }
		}
		
		public void h()
		{
			System.out.println("Brand_name: " + brand);
			System.out.println("Material: " + material);
			System.out.println("Product_id: " + productid);
			System.out.println("Colour :" + colour);
			System.out.println("Pattern :" + pattern);
			System.out.println("Available Size :" + avbSize);
			System.out.println("Price :" + price);
			System.out.println("*****************************");
			
			buy b=new buy();
			b.buy();
			
			
		}
	}
	
	class HMwqr321 extends H_M
	{
		HMwqr321(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
		{
			this.brand=brand;
			this.material=material;
			this.productid=productid;
			this.colour=colour;
			this.pattern=pattern;
			this.avbSize=avbSize;
			this.price=price;
			
			h();
		}

	}
	
	class HMola458 extends H_M
	{
		HMola458(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
		{
			this.brand=brand;
			this.material=material;
			this.productid=productid;
			this.colour=colour;
			this.pattern=pattern;
			this.avbSize=avbSize;
			this.price=price;
			
			h();
		}

	}
	
	class HMkkk89 extends H_M
	{
		HMkkk89(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
		{
			this.brand=brand;
			this.material=material;
			this.productid=productid;
			this.colour=colour;
			this.pattern=pattern;
			this.avbSize=avbSize;
			this.price=price;
			
			h();
		}

	}
	
	class Roadster extends T_shirts
	{
		public void roadster()
		{
			System.out.println(" you have selected Roadster brand");
			System.out.println(" Enter 1 for roadsterwqr321");
			System.out.println(" Enter 2 for roadsterla458");
			System.out.println(" Enter 3 for roadsterjkk69");
			System.out.println(" Enter  4 for  back to Tshirts  ");
			
			Scanner sc=new Scanner(System.in);
	        String k=sc.next();
	        
	        switch (k) {
			case "1":System.out.println("_______________________");
			roadsterwqr321 r=new roadsterwqr321("Roadster"," cotton","roadsterwqr321","White"," Solid","S,M,L,Xl","799");
				break;
			
			case "2":System.out.println("_______________________");
			roadsterla458 ra =new roadsterla458("Roadster","Linen","roadsterla458","Blue","Round neck printed","S,M,L,Xl","1099");
			break;
			
			case "3":System.out.println("_______________________");
			roadsterjkk69 ro =new roadsterjkk69("Roadster"," cotton","roadsterjkk69","orange"," StripBlocks","S,M,L,Xl","899");
			break;
			
			case "4":
				tshirts();
			break;

			default:System.out.println("Please choose given items only");
				roadster();
	         }
		}
		
		public void r()
		{
			System.out.println("Brand_name: " + brand);
			System.out.println("Material: " + material);
			System.out.println("Product_id: " + productid);
			System.out.println("Colour :" + colour);
			System.out.println("Pattern :" + pattern);
			System.out.println("Available Size :" + avbSize);
			System.out.println("Price :" + price);
			System.out.println("*****************************");
			
			buy b=new buy();
			b.buy();
			
			
		}
	}
	
	class roadsterwqr321 extends Roadster
	{
		roadsterwqr321(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
		{
			this.brand=brand;
			this.material=material;
			this.productid=productid;
			this.colour=colour;
			this.pattern=pattern;
			this.avbSize=avbSize;
			this.price=price;
			
			r();
		}

	}
	
	class roadsterla458 extends Roadster
	{
		roadsterla458(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
		{
			this.brand=brand;
			this.material=material;
			this.productid=productid;
			this.colour=colour;
			this.pattern=pattern;
			this.avbSize=avbSize;
			this.price=price;
			
			r();
		}

	}
	
	class roadsterjkk69 extends Roadster
	{
		roadsterjkk69(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
		{
			this.brand=brand;
			this.material=material;
			this.productid=productid;
			this.colour=colour;
			this.pattern=pattern;
			this.avbSize=avbSize;
			this.price=price;
			
			r();
		}

	}
	
	
	
	class Wrong extends T_shirts
	{
		public void wrong()
		{
			System.out.println(" you have selected Wrong brand");
			System.out.println(" Enter 1 for wrongr325");
			System.out.println(" Enter 2 for wronghwhite458");
			System.out.println(" Enter 3 for wrongblacko89");
			System.out.println(" Enter  4 for  back to Tshirts  ");
			
			Scanner sc=new Scanner(System.in);
	        String k=sc.next();
	        
	        switch (k) {
			case "1":System.out.println("_______________________");
			wrongr325 r=new wrongr325("Wrong"," cotton","wrongr325","Blue","strips","S,M,L,Xl","999");
				break;
			
			case "2":System.out.println("_______________________");
			wronghwhite458 ra =new wronghwhite458("Wrong","Linen","wronghwhite458","Grey","V neck printed","S,M,L,Xl","1599");
			break;
			
			case "3":System.out.println("_______________________");
			wrongblacko89 ro =new wrongblacko89("Wrong","cotton","wrongblacko89","black"," StripBlocks","S,M,L,Xl","2099");
			break;
			
			case "4":
				tshirts();
			break;

			default:System.out.println("Please choose given items only");
			 wrong();
	         }
	           
		}
		
		public void w()
		{
			System.out.println("Brand_name: " + brand);
			System.out.println("Material: " + material);
			System.out.println("Product_id: " + productid);
			System.out.println("Colour :" + colour);
			System.out.println("Pattern :" + pattern);
			System.out.println("Available Size :" + avbSize);
			System.out.println("Price :" + price);
			System.out.println("*****************************");
			
			buy b=new buy();
			b.buy();
			
			
		}
	}
	
	class wrongr325 extends Wrong
	{
		wrongr325(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
		{
			this.brand=brand;
			this.material=material;
			this.productid=productid;
			this.colour=colour;
			this.pattern=pattern;
			this.avbSize=avbSize;
			this.price=price;
			
			w();
		}

	}
	
	class wronghwhite458 extends Wrong
	{
		wronghwhite458(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
		{
			this.brand=brand;
			this.material=material;
			this.productid=productid;
			this.colour=colour;
			this.pattern=pattern;
			this.avbSize=avbSize;
			this.price=price;
			
			w();
		}

	}
	
	class wrongblacko89 extends Wrong
	{
		wrongblacko89(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
		{
			this.brand=brand;
			this.material=material;
			this.productid=productid;
			this.colour=colour;
			this.pattern=pattern;
			this.avbSize=avbSize;
			this.price=price;
			
			w();
		}

	}
	
	
class shirts extends clothing_mens
{
	String brand;
	String material;
	String productid;
	String colour;
	String pattern;
	String avbSize;
	String price;
	public void shirt()
	{
		System.out.println("Select Your Favourite Brand ");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println(" 1: HIGHLANDER");
		System.out.println(" 2: H&M");
		System.out.println(" 3: ROADSTER");
		System.out.println(" 4: WRONG");
		System.out.println(" 5: back to Clothes selection");
		System.out.println("_______________________________");
		
		Highlander p =new Highlander();
		
		HM h= new HM();
		
		Roadsters r=new Roadsters();
		
		Wrongs w = new Wrongs();
		
		Scanner t=new Scanner(System.in);
		  String z=t.next();
		  
		  switch (z) {
			case "1":
				    p.highlander();
				
				break;
				
			case "2":
				    h.hm();
				
				break;
				
			case "3":
			    r.roadster();
			
			break;
			
			case "4":
			    w.wrong();
			
			break;
			
			case "5":
			    cloths_mens();
			
			break;

			default:System.out.println(" please provide vaild choice");
				break;
			}
	}	
}

class Highlander extends shirts
{
	public void highlander()
	{
		System.out.println(" you have selected Wrong brand");
		System.out.println(" Enter 1 for highlanr321");
		System.out.println(" Enter 2 for highlanla458");
		System.out.println(" Enter 3 for highklan89");
		System.out.println(" Enter 4 for  back to shirts  ");
		
		Scanner sc=new Scanner(System.in);
        String k=sc.next();
        
        switch (k) {
		case "1":System.out.println("_______________________");
		highlanr321 r=new highlanr321("Highlander"," cotton","highlanr321","White"," Solid mini colour","S,M,L,Xl","599");
			break;
		
		case "2":System.out.println("_______________________");
		highlanla458 rl =new highlanla458("Highlander","cotton","highlanla458","Black","Soild","S,M,L,Xl","1299");
		break;
		
		case "3":System.out.println("_______________________");
		highklan89 rm=new highklan89("Highlander"," cotton","highklan89","Green-blue"," Strip","S,M,L,Xl","2099");
		break;
		
		case "4":
			shirt();
		break;

		default:System.out.println("Please choose given items only");
		highlander();
         }
	}
	
	public void hi() 
	{
		System.out.println("Brand_name: " + brand);
		System.out.println("Material: " + material);
		System.out.println("Product_id: " + productid);
		System.out.println("Colour :" + colour);
		System.out.println("Pattern :" + pattern);
		System.out.println("Available Size :" + avbSize);
		System.out.println("Price :" + price);
		System.out.println("*****************************");
		
		buy b=new buy();
		b.buy();
		
		
	}
}

class highlanr321 extends Highlander
{
	highlanr321(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		hi();
	}

}

class highlanla458 extends Highlander
{
	highlanla458(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		hi();
	}

}

class highklan89 extends Highlander
{
	highklan89(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		hi();
	}

}

class HM extends shirts
{
	public void hm()
	{
		System.out.println(" you have selected Wrong brand");
		System.out.println(" Enter 1 for hmr321");
		System.out.println(" Enter 2 for hmla458");
		System.out.println(" Enter 3 for hmblack89");
		System.out.println(" Enter  4 for  back to shirts  ");
		
		Scanner sc=new Scanner(System.in);
        String k=sc.next();
        
        switch (k) {
		case "1":System.out.println("_______________________");
		hmr321 r=new hmr321("H&M"," cotton","hmr321","White-Black"," Pattern shirt","S,M,L,Xl","1499");
			break;
		
		case "2":System.out.println("_______________________");
		hmla458 ra =new hmla458("H&M","Linen","hmla458","Blue","Solid oversized","S,M,L,Xl","1599");
		break;
		
		case "3":System.out.println("_______________________");
		hmblack89 ro =new hmblack89("H&M"," cotton","hmblack89","Green","Relaxed short sleeve","S,M,L,Xl","2099");
		break;
		
		case "4":
			shirt();
		break;

		default:System.out.println("Please choose given items only");
		 hm();
         }
	}
	
	public void hm1() 
	{
		System.out.println("Brand_name: " + brand);
		System.out.println("Material: " + material);
		System.out.println("Product_id: " + productid);
		System.out.println("Colour :" + colour);
		System.out.println("Pattern :" + pattern);
		System.out.println("Available Size :" + avbSize);
		System.out.println("Price :" + price);
		System.out.println("*****************************");
		
		buy b=new buy();
		b.buy();
		
		
	}
}

class hmr321 extends HM
{
	hmr321(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		hm1();
	}

}

class hmla458 extends HM
{
	hmla458(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		hm1();
	}

}

class hmblack89 extends HM
{
	hmblack89(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		hm1();
	}

}

class Roadsters extends shirts
{
	public void roadster()
	{
		System.out.println(" you have selected Wrong brand");
		System.out.println(" Enter 1 for roadwhitr321");
		System.out.println(" Enter 2 for roadsterkiola458");
		System.out.println(" Enter 3 for roadstero89");
		System.out.println(" Enter  4 for  back to shirts  ");
		
		Scanner sc=new Scanner(System.in);
        String k=sc.next();
        
        switch (k) {
		case "1":System.out.println("_______________________");
		roadwhitr321 r=new roadwhitr321("Roadster"," cotton","roadwhitr321","Black"," Sustaniable-Solid ","S,M,L,Xl","1299");
			break;
		
		case "2":System.out.println("_______________________");
		roadsterkiola458 ra =new roadsterkiola458("Roadster","Linen","roadsterkiola458","Blue","Denim","S,M,L,Xl","1099");
		break;
		
		case "3":System.out.println("_______________________");
		roadstero89 ro =new roadstero89("Roadster","cotton","roadstero89","Grey","washed denim","S,M,L,Xl","2000");
		break;
		
		case "4":
			shirt();
		break;

		default:System.out.println("Please choose given items only");
		roadster();
         }
	}
	
	public void rd() 
	{
		System.out.println("Brand_name: " + brand);
		System.out.println("Material: " + material);
		System.out.println("Product_id: " + productid);
		System.out.println("Colour :" + colour);
		System.out.println("Pattern :" + pattern);
		System.out.println("Available Size :" + avbSize);
		System.out.println("Price :" + price);
		System.out.println("*****************************");
		
		buy b=new buy();
		b.buy();
		
		
	}
}

class roadwhitr321 extends Roadsters
{
	roadwhitr321(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		rd();
	}

}

class roadsterkiola458 extends Roadsters
{
	roadsterkiola458(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		rd();
	}

}

class roadstero89 extends Roadsters
{
	roadstero89(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		rd();
	}

}


class Wrongs extends shirts
{
	public void wrong()
	{
		System.out.println(" you have selected Wrong brand");
		System.out.println(" Enter 1 for wrongr895");
		System.out.println(" Enter 2 for wronghjla58");
		System.out.println(" Enter 3 for wrongio896");
		System.out.println(" Enter  4 for  back to shirts  ");
		
		Scanner sc=new Scanner(System.in);
        String k=sc.next();
        
        switch (k) {
		case "1":System.out.println("_______________________");
		wrongr895 r=new wrongr895("Wrogn",  " cotton", "wrongr895", "Lemmon yellow"," Mandarian Collar","S,M,L,Xl","1429");
			break;
		
		case "2":System.out.println("_______________________");
		wronghjla58 ra =new wronghjla58("Wrogn", "Linen", "wronghjla58","Blue","checked","S,M,L,Xl","1619");
		break;
		
		case "3":System.out.println("_______________________");
		wrongio896 ro =new wrongio896("Wrogn"," Pure cotton", "wrongio896", "baby pink"," Solid", "S,M,L,Xl","1439");
		break;
		
		case "4":
			shirt();
		break;

		default:System.out.println("Please choose given items only");
		 wrong();
         }
	}
	
	public void wr() 
	{
		System.out.println("Brand_name: " + brand);
		System.out.println("Material: " + material);
		System.out.println("Product_id: " + productid);
		System.out.println("Colour :" + colour);
		System.out.println("Pattern :" + pattern);
		System.out.println("Available Size :" + avbSize);
		System.out.println("Price :" + price);
		System.out.println("*****************************");
		
		buy b=new buy();
		b.buy();
		
		
	}
}

class wrongr895 extends Wrongs
{
	wrongr895(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		wr();
	}

}

class wronghjla58 extends Wrongs
{
	wronghjla58(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		wr();
	}

}

class wrongio896 extends Wrongs
{
	wrongio896(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		wr();
	}

}

class Jeans extends clothing_mens
{
	String brand;
	String material;
	String productid;
	String colour;
	String pattern;
	String avbSize;
	String price;
	public void jeans()
	{

		System.out.println("Select Your Favourite Brand ");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("     1: LEVIS                  ");
		System.out.println("     2: SPYKAR                 ");
		System.out.println("     3: ROADSTER               ");
		System.out.println("     4: WRONG                  ");
		System.out.println("_______________________________");
		
		Levis p =new Levis();
		
		Spykar h= new Spykar();
		
		Roadsterr r=new Roadsterr();
		
		Wrongss w = new Wrongss();
		
		Scanner t=new Scanner(System.in);
		  String z=t.next();
		  
		  switch (z) {
			case "1":
				    p.levis();
				
				break;
				
			case "2":
				    h.sykar();
				
				break;
				
			case "3":
			    r.roadsTer();
			
			break;
			
			case "4":
			    w.wrong();
			
			break;
			
			case "5":
			    cloths_mens();
			
			break;

			default:System.out.println(" please provide vaild choice");
				break;
			}
	}	
}

class Levis extends Jeans
{
	public void levis()
	{
		System.out.println(" you have selected Wrong brand");
		System.out.println(" Enter 1 for leviblack95");
		System.out.println(" Enter 2 for levgreya58");
		System.out.println(" Enter 3 for levtoned896");
		
		Scanner sc=new Scanner(System.in);
        String k=sc.next();
        
        switch (k) {
		case "1":System.out.println("_______________________");
		leviblack95 r=new leviblack95("Levis"," Denim","leviblack95","black","Men511 Slim fit","S,M,L,Xl","3599");
			break;
		
		case "2":System.out.println("_______________________");
		levgreya58 ra =new levgreya58("Levis","Denim","levgreya58","Grey","Tapperd slim fit","S,M,L,Xl","2299");
		break;
		
		case "3":System.out.println("_______________________");
		levtoned896 ro =new levtoned896("Levis","Denim","levtoned896","Blue","Baggy tapperd","S,M,L,Xl","2099");
		break;

		default:System.out.println("Please choose given items only");
		levis();
         }
	}
	
	public void li() 
	{
		System.out.println("Brand_name: " + brand);
		System.out.println("Material: " + material);
		System.out.println("Product_id: " + productid);
		System.out.println("Colour :" + colour);
		System.out.println("Pattern :" + pattern);
		System.out.println("Available Size :" + avbSize);
		System.out.println("Price :" + price);
		System.out.println("*****************************");
		
		buy b=new buy();
		b.buy();
		
		
	}
}

class leviblack95 extends Levis
{
	leviblack95(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		li();
	}

}

class levgreya58 extends Levis
{
	levgreya58(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		li();
	}

}

class levtoned896 extends Levis
{
	levtoned896(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		li();
	}

}


class Spykar extends Jeans
{
	public void sykar()
	{
		System.out.println(" you have selected Spykar brand");
		System.out.println(" Enter 1 for spygr895");
		System.out.println(" Enter 2 for spyghjla58");
		System.out.println(" Enter 3 for spyio896");
		
		Scanner sc=new Scanner(System.in);
        String k=sc.next();
        
        switch (k) {
		case "1":System.out.println("_______________________");
		spygr895 r=new spygr895("Spykar"," Denim","spygr895","black","Men511 Slim fit","S,M,L,Xl","3599");
			break;
		
		case "2":System.out.println("_______________________");
		spyghjla58 ra =new spyghjla58("Spykar","Denim","spyghjla58","Grey","Tapperd slim fit","S,M,L,Xl","2299");
		break;
		
		case "3":System.out.println("_______________________");
		spyio896 ro =new spyio896("Spykar","Denim","spyio896","Blue","Baggy tapperd","S,M,L,Xl","2099");
		break;

		default:System.out.println("Please choose given items only");
		sykar();
         }
       
	}
	public void sp() 
	{
		System.out.println("Brand_name: " + brand);
		System.out.println("Material: " + material);
		System.out.println("Product_id: " + productid);
		System.out.println("Colour :" + colour);
		System.out.println("Pattern :" + pattern);
		System.out.println("Available Size :" + avbSize);
		System.out.println("Price :" + price);
		System.out.println("*****************************");
		
		buy b=new buy();
		b.buy();
		
		
	}
}

class spygr895 extends Spykar
{
	spygr895(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		sp();
	}

}

class spyghjla58 extends Spykar
{
	spyghjla58(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		sp();
	}

}

class spyio896 extends Spykar
{
	spyio896(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		sp();
	}

}

class Roadsterr extends Jeans
{
	public void roadsTer()
	{
		System.out.println(" you have selected Wrong brand");
		System.out.println(" Enter 1 for roarr895");
		System.out.println(" Enter 2 for roarhjla58");
		System.out.println(" Enter 3 for roario896");
		
		Scanner sc=new Scanner(System.in);
        String k=sc.next();
        
        switch (k) {
		case "1":System.out.println("_______________________");
		roarr895 r=new roarr895("Roadster"," Denim","roarr895","black","Men511 Slim fit","S,M,L,Xl","3599");
			break;
		
		case "2":System.out.println("_______________________");
		roarhjla58 ra =new roarhjla58("Roadster","Denim","roarhjla58","Grey","Tapperd slim fit","S,M,L,Xl","2299");
		break;
		
		case "3":System.out.println("_______________________");
		roario896 ro =new roario896("Roadster","Denim","roario896","Blue","Baggy tapperd","S,M,L,Xl","2099");
		break;

		default:System.out.println("Please choose given items only");
		roadsTer();
         }
	}
	
	public void rds() 
	{
		System.out.println("Brand_name: " + brand);
		System.out.println("Material: " + material);
		System.out.println("Product_id: " + productid);
		System.out.println("Colour :" + colour);
		System.out.println("Pattern :" + pattern);
		System.out.println("Available Size :" + avbSize);
		System.out.println("Price :" + price);
		System.out.println("*****************************");
		
		buy b=new buy();
		b.buy();
		
		
	}
}

class roarhjla58 extends Roadsterr
{
	roarhjla58(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		rds();
	}

}


class roarr895 extends Roadsterr
{
	roarr895(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		rds();
	}

}

class roario896 extends Roadsterr
{
	roario896(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		rds();
	}

}


class Wrongss extends Jeans
{
	public void wrong()
	{
		System.out.println(" you have selected Wrong brand");
		System.out.println(" Enter 1 for wrongr800");
		System.out.println(" Enter 2 for wronghjl758");
		System.out.println(" Enter 3 for wrongio8336");
		
		Scanner sc=new Scanner(System.in);
        String k=sc.next();
        
        switch (k) {
		case "1":System.out.println("_______________________");
		wrongr800 r=new wrongr800("Levis"," Denim","wrongr800","black","Men511 Slim fit","S,M,L,Xl","2099");
			break;
		
		case "2":System.out.println("_______________________");
		wronghjl758 ra =new wronghjl758("Levis","Denim","wronghjl758","Grey","Tapperd slim fit","S,M,L,Xl","1799");
		break;
		
		case "3":System.out.println("_______________________");
		wrongio8336 ro =new wrongio8336("Levis","Denim","wrongio8336","Blue","Baggy tapperd","S,M,L,Xl","2599");
		break;

		default:System.out.println("Please choose given items only");
		wrong();
         }
	}
	
	public void wo() 
	{
		System.out.println("Brand_name: " + brand);
		System.out.println("Material: " + material);
		System.out.println("Product_id: " + productid);
		System.out.println("Colour :" + colour);
		System.out.println("Pattern :" + pattern);
		System.out.println("Available Size :" + avbSize);
		System.out.println("Price :" + price);
		System.out.println("*****************************");
		
		buy b=new buy();
		b.buy();
		
		
	}
}

class wrongr800 extends Wrongss
{
	wrongr800(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		wo();
	}

}

class wronghjl758 extends Wrongss
{
	wronghjl758(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		wo();
	}

}

class wrongio8336 extends Wrongss
{
	wrongio8336(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		wo();
	}

}

class pantsF extends clothing_mens
{
	String brand;
	String material;
	String productid;
	String colour;
	String pattern;
	String avbSize;
	String price;
	public void pants()
	{

		System.out.println("Select Your Favourite Brand ");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("manq");
		System.out.println("Raymond");
		System.out.println("Ivoc");
		System.out.println("louis");
		System.out.println("_______________________________");
		
		Manq p =new Manq();
		
		Raymond h= new Raymond();
		
		Ivoc r=new Ivoc();
		
		Louis w = new Louis();
		
		Scanner t=new Scanner(System.in);
		  String z=t.next();
		  
		  switch (z) {
			case "1":
				    p.manQ();
				
				break;
				
			case "2":
				    h.raymond();
				
				break;
				
			case "3":
			    r.ivoc();
			
			break;
			
			case "4":
			    w.louis();
			
			break;
			
			case "5":
			    cloths_mens();
			
			break;

			default:System.out.println(" please provide vaild choice");
				break;
			}
	}	
}

class Manq extends pantsF
{
	public void manQ()
	{
		System.out.println(" you have selected Manq brand");
		System.out.println(" Enter 1 for manQ00");
		System.out.println(" Enter 2 for manQq58");
		System.out.println(" Enter 3 for manQe36");
		
		Scanner sc=new Scanner(System.in);
        String k=sc.next();
        
        switch (k) {
		case "1":System.out.println("_______________________");
		manQ00 r=new manQ00("Manq"," Denim","manQ00","black","Men511 Slim fit","S,M,L,Xl","2099");
			break;
		
		case "2":System.out.println("_______________________");
		manQq58 ra =new manQq58("Manq","Denim","manQq58","Grey","Tapperd slim fit","S,M,L,Xl","1799");
		break;
		
		case "3":System.out.println("_______________________");
		manQe36 ro =new manQe36("Manq","Denim","manQe36","Blue","Baggy tapperd","S,M,L,Xl","2599");
		break;

		default:System.out.println("Please choose given items only");
		manQ();
        }
	}
	
	public void m() 
	{
		System.out.println("Brand_name: " + brand);
		System.out.println("Material: " + material);
		System.out.println("Product_id: " + productid);
		System.out.println("Colour :" + colour);
		System.out.println("Pattern :" + pattern);
		System.out.println("Available Size :" + avbSize);
		System.out.println("Price :" + price);
		System.out.println("*****************************");
		
		buy b=new buy();
		b.buy();
		
	}
}

class manQ00 extends Manq
{
	manQ00(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		m();
	}

}

class manQq58 extends Manq
{
	manQq58(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		m();
	}

}

class manQe36 extends Manq
{
	manQe36(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		m();
	}

}

class Raymond extends pantsF
{
	public void raymond()
	{
		System.out.println(" you have selected Raymond brand");
		System.out.println(" Enter 1 for RayblackQ00");
		System.out.println(" Enter 2 for RaygreayanQq58");
		System.out.println(" Enter 3 for RayblueQe36");
		
		Scanner sc=new Scanner(System.in);
        String k=sc.next();
        
        switch (k) {
		case "1":System.out.println("_______________________");
		RayblackQ00 r=new RayblackQ00("Manq"," Denim","RayblackQ00","black","Men511 Slim fit","S,M,L,Xl","2099");
			break;
		
		case "2":System.out.println("_______________________");
		RaygreayanQq58 ra =new RaygreayanQq58("Manq","Denim","RaygreayanQq58","Grey","Tapperd slim fit","S,M,L,Xl","1799");
		break;
		
		case "3":System.out.println("_______________________");
		RayblueQe36 ro =new RayblueQe36("Manq","Denim","RayblueQe36","Blue","Baggy tapperd","S,M,L,Xl","2599");
		break;

		default:System.out.println("Please choose given items only");
		raymond();
        }
	}
	
	public void ry() 
	{
		System.out.println("Brand_name: " + brand);
		System.out.println("Material: " + material);
		System.out.println("Product_id: " + productid);
		System.out.println("Colour :" + colour);
		System.out.println("Pattern :" + pattern);
		System.out.println("Available Size :" + avbSize);
		System.out.println("Price :" + price);
		System.out.println("*****************************");
		
		buy b=new buy();
		b.buy();
		
	}
}

class RayblackQ00 extends Raymond
{
	RayblackQ00(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		ry();
	}

}

class RaygreayanQq58 extends Raymond
{
	RaygreayanQq58(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		ry();
	}

}

class RayblueQe36 extends Raymond
{
	RayblueQe36(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		ry();
	}

}

class Ivoc extends pantsF
{
	public void ivoc()
	{
		System.out.println(" you have selected Ivoc brand");
		System.out.println(" Enter 1 for Ivocross0");
		System.out.println(" Enter 2 for Ivocpopq58");
		System.out.println(" Enter 3 for IvochjQe36");
		
		Scanner sc=new Scanner(System.in);
        String k=sc.next();
        
        switch (k) {
		case "1":System.out.println("_______________________");
		Ivocross0 r=new Ivocross0("Manq"," Denim","Ivocross0","black","Men511 Slim fit","S,M,L,Xl","2099");
			break;
		
		case "2":System.out.println("_______________________");
		Ivocpopq58 ra =new Ivocpopq58("Manq","Denim","Ivocpopq58","Grey","Tapperd slim fit","S,M,L,Xl","1799");
		break;
		
		case "3":System.out.println("_______________________");
		IvochjQe36 ro =new IvochjQe36("Manq","Denim","IvochjQe36","Blue","Baggy tapperd","S,M,L,Xl","2599");
		break;

		default:System.out.println("Please choose given items only");
		ivoc();
        }
	}
	
	public void iv() 
	{
		System.out.println("Brand_name: " + brand);
		System.out.println("Material: " + material);
		System.out.println("Product_id: " + productid);
		System.out.println("Colour :" + colour);
		System.out.println("Pattern :" + pattern);
		System.out.println("Available Size :" + avbSize);
		System.out.println("Price :" + price);
		System.out.println("*****************************");
		
		buy b=new buy();
		b.buy();
		
	}
}

class Ivocross0 extends Ivoc
{
	Ivocross0(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		iv();
	}

}

class Ivocpopq58 extends Ivoc
{
	Ivocpopq58(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		iv();
	}

}

class IvochjQe36 extends Ivoc
{
	IvochjQe36(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		iv();
	}

}

class Louis extends pantsF
{
	public void louis()
	{
		System.out.println(" you have selected Louis brand");
		System.out.println(" Enter 1 for louisasas00");
		System.out.println(" Enter 2 for louisnsjda58");
		System.out.println(" Enter 3 for lousdse36");
		
		Scanner sc=new Scanner(System.in);
        String k=sc.next();
        
        switch (k) {
		case "1":System.out.println("_______________________");
		louisasas00 r=new louisasas00("Manq"," Denim","louisasas00","black","Men511 Slim fit","S,M,L,Xl","2099");
			break;
		
		case "2":System.out.println("_______________________");
		louisnsjda58 ra =new louisnsjda58("Manq","Denim","louisnsjda58","Grey","Tapperd slim fit","S,M,L,Xl","1799");
		break;
		
		case "3":System.out.println("_______________________");
		lousdse36 ro =new lousdse36("Manq","Denim","lousdse36","Blue","Baggy tapperd","S,M,L,Xl","2599");
		break;

		default:System.out.println("Please choose given items only");
		louis();
        }
	}
	
	public void lu() 
	{
		System.out.println("Brand_name: " + brand);
		System.out.println("Material: " + material);
		System.out.println("Product_id: " + productid);
		System.out.println("Colour :" + colour);
		System.out.println("Pattern :" + pattern);
		System.out.println("Available Size :" + avbSize);
		System.out.println("Price :" + price);
		System.out.println("*****************************");
		
		buy b=new buy();
		b.buy();
		
	}
}

class louisasas00 extends Louis
{
	louisasas00(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		lu();
	}

}

class louisnsjda58 extends Louis
{
	louisnsjda58(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		lu();
	}

}

class lousdse36 extends Louis
{
	lousdse36(String brand, String material, String productid,String colour,String pattern,String avbSize,String price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		lu();
	}

}


class footwear_mens extends mens_Store
{
	String brand;
	String productid;
	String type;
	String colour;
	String pattern;
	String avbSize;
	String price;
	public void foot_mens()
	{
		System.out.println("Select Your Favourite Brand ");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("Hrx");
		System.out.println("Puma");
		System.out.println("Nike");
		System.out.println("_______________________________");
		
		Hrx p =new Hrx();
		
		Puma h= new Puma();
		
		Nike r=new Nike();
		
		
		Scanner t=new Scanner(System.in);
		  String z=t.next();
		  
		  switch (z) {
			case "1":
				    p.hrx();
				
				break;
				
			case "2":
				    h.puma();
				
				break;
				
			case "3":
			    r.nike();
			
			break;
			

			default:System.out.println(" please provide vaild choice");
				break;
			}
	}
}


class Hrx extends footwear_mens
{
	public void hrx()
	{
		System.out.println(" you have selected HRX brand");
		System.out.println(" Enter 1 for hrxshoessas00");
		System.out.println(" Enter 2 for hrxnsandalda58");
		System.out.println(" Enter 3 for hrxformal785");
		
		Scanner sc=new Scanner(System.in);
        String k=sc.next();
        
        switch (k) {
		case "1":System.out.println("_______________________");
		hrxshoessasas00 r=new hrxshoessasas00("HRX","hrxshoessas00","Sneaker","White","strip","6,7,8,9,10,11","2099");
			break;
		
		case "2":System.out.println("_______________________");
		hrxnsandalda58 ra =new hrxnsandalda58("HRX","hrxnsandalda58","Sandal","grey"," Solid Hook & Loop Athleisure","6,7,8,9,10,11","1799");
		break;
		
		case "3":System.out.println("_______________________");
		hrxformal785 ro =new hrxformal785("HRX","hrxformal785","Sneaker","blue","solid","6,7,8,9,10,11","2599");
		break;

		default:System.out.println("Please choose given items only");
		hrx();
        }
	}
	
	public void hx() 
	{
		System.out.println("Brand_name: " + brand);
		System.out.println("Product_id: " + productid);
		System.out.println("Type: " + type);
		System.out.println("Colour :" + colour);
		System.out.println("Pattern :" + pattern);
		System.out.println("Available Size :" + avbSize);
		System.out.println("Price :" + price);
		System.out.println("*****************************");
		
		buy b=new buy();
		b.buy();
		
	}
}

class hrxshoessasas00 extends Hrx
{
	hrxshoessasas00(String brand, String productid, String type,String colour, String pattern, String avbSize, String price)
	{
		this.brand=brand;
		this.productid=productid;
		this.type=type;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		hx();
		
	}
}

class hrxnsandalda58 extends Hrx
{
	hrxnsandalda58(String brand, String productid, String type,String colour, String pattern, String avbSize, String price)
	{
		this.brand=brand;
		this.productid=productid;
		this.type=type;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		hx();
		
	}
}

class hrxformal785 extends Hrx
{
	hrxformal785(String brand, String productid, String type,String colour, String pattern, String avbSize, String price)
	{
		this.brand=brand;
		this.productid=productid;
		this.type=type;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		hx();
		
	}
}

class Puma extends footwear_mens
{
	public void puma()
	{
		System.out.println(" you have selected Puma brand");
		System.out.println(" Enter 1 for pumashoessa85s00");
		System.out.println(" Enter 2 for pumasandalda58");
		System.out.println(" Enter 3 for pumadse356");
		
		Scanner sc=new Scanner(System.in);
        String k=sc.next();
        
        switch (k) {
		case "1":System.out.println("_______________________");
		pumashoessa85s00 r=new pumashoessa85s00("PUMA","pumashoessa85s00","Sneaker","White","strip","6,7,8,9,10,11","2099");
			break;
		
		case "2":System.out.println("_______________________");
		pumasandalda58 ra =new pumasandalda58("PUMA","pumasandalda58","Sandal","grey"," Solid Hook & Loop Athleisure","6,7,8,9,10,11","1799");
		break;
		
		case "3":System.out.println("_______________________");
		pumadse356 ro =new pumadse356("PUMA","pumadse356","Sneaker","blue","solid","6,7,8,9,10,11","2599");
		break;

		default:System.out.println("Please choose given items only");
		puma();
        }
	}
	
	public void pm() 
	{
		System.out.println("Brand_name: " + brand);
		System.out.println("Product_id: " + productid);
		System.out.println("Type: " + type);
		System.out.println("Colour :" + colour);
		System.out.println("Pattern :" + pattern);
		System.out.println("Available Size :" + avbSize);
		System.out.println("Price :" + price);
		System.out.println("*****************************");
		
		buy b=new buy();
		b.buy();
		
	}
}

class pumashoessa85s00 extends Puma
{
	pumashoessa85s00(String brand, String productid, String type,String colour, String pattern, String avbSize, String price)
	{
		this.brand=brand;
		this.productid=productid;
		this.type=type;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		pm();
		
	}
}

class pumasandalda58 extends Puma
{
	pumasandalda58(String brand, String productid, String type,String colour, String pattern, String avbSize, String price)
	{
		this.brand=brand;
		this.productid=productid;
		this.type=type;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		pm();
		
	}
}

class pumadse356 extends Puma
{
	pumadse356(String brand, String productid, String type,String colour, String pattern, String avbSize, String price)
	{
		this.brand=brand;
		this.productid=productid;
		this.type=type;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		pm();
		
	}
}

class Nike extends footwear_mens
{
	public void nike()
	{
		System.out.println(" you have selected Nike brand");
		System.out.println(" Enter 1 for nikshoessasas00");
		System.out.println(" Enter 2 for niksandalda58");
		System.out.println(" Enter 3 for nikdse365");
		
		Scanner sc=new Scanner(System.in);
        String k=sc.next();
        
        switch (k) {
		case "1":System.out.println("_______________________");
		nikshoessasas00 r=new nikshoessasas00("NIKE","nikshoessasas00","Sneaker","White","strip","6,7,8,9,10,11","2099");
			break;
		
		case "2":System.out.println("_______________________");
		niksandalda58 ra =new niksandalda58("NIKE","niksandalda58","Sandal","grey"," Solid Hook & Loop Athleisure","6,7,8,9,10,11","1799");
		break;
		
		case "3":System.out.println("_______________________");
		nikdse365 ro =new nikdse365("NIKE","nikdse365","Sneaker","blue","solid","6,7,8,9,10,11","2599");
		break;

		default:System.out.println("Please choose given items only");
		nike();
        }
	}
	public void ni() 
	{
		System.out.println("Brand_name: " + brand);
		System.out.println("Product_id: " + productid);
		System.out.println("Type: " + type);
		System.out.println("Colour :" + colour);
		System.out.println("Pattern :" + pattern);
		System.out.println("Available Size :" + avbSize);
		System.out.println("Price :" + price);
		System.out.println("*****************************");
		
		buy b=new buy();
		b.buy();
		
	}
}

class nikshoessasas00 extends Nike
{
	nikshoessasas00(String brand, String productid, String type,String colour, String pattern, String avbSize, String price)
	{
		this.brand=brand;
		this.productid=productid;
		this.type=type;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		ni();
		
	}
}

class niksandalda58 extends Nike
{
	niksandalda58(String brand, String productid, String type,String colour, String pattern, String avbSize, String price)
	{
		this.brand=brand;
		this.productid=productid;
		this.type=type;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		ni();
		
	}
}

class nikdse365 extends Nike
{
	nikdse365(String brand, String productid, String type,String colour, String pattern, String avbSize, String price)
	{
		this.brand=brand;
		this.productid=productid;
		this.type=type;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		ni();
		
	}
}


class perfumes_mens extends mens_Store
{
	String brand;
	String productid;
	String fragnance;
	double price;
	
	public void perfume_mens()
	{
		System.out.println("Select Your Favourite Brand ");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("Brut");
		System.out.println("fogg");
		System.out.println("wildman");

		System.out.println("_______________________________");
		
		Brut p =new Brut();
		
		Fogg h= new Fogg();
		
		Wildstone r=new Wildstone();
		
		
		Scanner t=new Scanner(System.in);
		  String z=t.next();
		  
		  switch (z) {
			case "1":
				    p.brut();
				
				break;
				
			case "2":
				    h.fogg();
				
				break;
				
			case "3":
			    r.wildStone();
			
			break;
			

			default:System.out.println(" please provide vaild choice");
			    perfume_mens();
			}
	}
}

class Brut extends perfumes_mens
{
	public void brut()
	{
		System.out.println(" you have selected Nike brand");
		System.out.println(" Enter 1 for Brut1201");
		System.out.println(" Enter 2 for Brut2158");
		System.out.println(" Enter 3 for Brut721");
		
		Scanner sc=new Scanner(System.in);
        String k=sc.next();
        
        switch (k) {
		case "1":System.out.println("_______________________");
		Brut1201 r=new Brut1201("BRUT","Brut1201","Sneaker",200);
			break;
		
		case "2":System.out.println("_______________________");
		Brut2158 ra =new Brut2158("BRUT","Brut1201","Freshness",180);
		break;
		
		case "3":System.out.println("_______________________");
		Brut721 ro =new Brut721("BRUT","Brut1201","Musk",189);
		break;

		default:System.out.println("Please choose given items only");
		brut();
        }
	}
	
	public void br() 
	{
		System.out.println("Brand_name: " + brand);
		System.out.println("Product_id: " + productid);
		System.out.println("Fragnance: " + fragnance );
		System.out.println("Price :" + price);
		System.out.println("*****************************");
		
		buy b=new buy();
		b.buy();
		
	}
}

class Brut1201 extends Brut
{
	Brut1201(String brand,String productid,String fragnance,double price)
	{
		this.brand=brand;
		this.productid=productid;
		this.fragnance=fragnance;
		this.price=price;
		
		br();
	}
}

class Brut2158 extends Brut
{
	Brut2158(String brand,String productid,String fragnance,double price)
	{
		this.brand=brand;
		this.productid=productid;
		this.fragnance=fragnance;
		this.price=price;
		
		br();
	}
}

class Brut721 extends Brut
{
	Brut721(String brand,String productid,String fragnance,double price)
	{
		this.brand=brand;
		this.productid=productid;
		this.fragnance=fragnance;
		this.price=price;
		
		br();
	}
}

class Fogg extends perfumes_mens
{
	public void fogg()
	{
		System.out.println(" you have selected Nike brand");
		System.out.println(" Enter 1 for Fogg45a");
		System.out.println(" Enter 2 for Fogg869ed");
		System.out.println(" Enter 3 for Fogg96op");
		
		Scanner sc=new Scanner(System.in);
        String k=sc.next();
        
        switch (k) {
		case "1":System.out.println("_______________________");
		Fogg45a r=new Fogg45a("FOGG","Fogg45a","Dynamic",200);
		break;
		
		case "2":System.out.println("_______________________");
		Fogg869ed ra =new Fogg869ed("BRUT","Brut1201","Classic",200);
		break;
		
		case "3":System.out.println("_______________________");
		Fogg96op ro =new Fogg96op("BRUT","Brut1201","Active",200);
		break;

		default:System.out.println("Please choose given items only");
		fogg();
        }
	}
	
	public void fg() 
	{
		System.out.println("Brand_name: " + brand);
		System.out.println("Product_id: " + productid);
		System.out.println("Fragnance: " + fragnance );
		System.out.println("Price :" + price);
		System.out.println("*****************************");
		
		buy b=new buy();
		b.buy();
		
	}
}

class Fogg45a extends Fogg
{
	Fogg45a(String brand,String productid,String fragnance,double price)
	{
		this.brand=brand;
		this.productid=productid;
		this.fragnance=fragnance;
		this.price=price;
		
		fg();
	}
}

class Fogg869ed extends Fogg
{
	Fogg869ed(String brand,String productid,String fragnance,double price)
	{
		this.brand=brand;
		this.productid=productid;
		this.fragnance=fragnance;
		this.price=price;
		
		fg();
	}
}

class Fogg96op extends Fogg
{
	Fogg96op(String brand,String productid,String fragnance,double price)
	{
		this.brand=brand;
		this.productid=productid;
		this.fragnance=fragnance;
		this.price=price;
		
		fg();
	}
}

class Wildstone extends perfumes_mens
{
	public void wildStone()
	{
		System.out.println(" you have selected Nike brand");
		System.out.println(" Enter 1 for Wildsil56v");
		System.out.println(" Enter 2 for Wildst756a");
		System.out.println(" Enter 3 for Wildsfd89");
		
		Scanner sc=new Scanner(System.in);
        String k=sc.next();
        
        switch (k) {
		case "1":System.out.println("_______________________");
		Wildsil56v r=new Wildsil56v("BRUT","Wildsil56v","Sneaker",200);
			break;
		
		case "2":System.out.println("_______________________");
		Wildst756a ra =new Wildst756a("BRUT","Wildst756a","Sneaker",200);
		break;
		
		case "3":System.out.println("_______________________");
		Wildsfd89 ro =new Wildsfd89("BRUT","Wildsfd89","Sneaker",200);
		break;

		default:System.out.println("Please choose given items only");
		wildStone();
        }
	}
	
	public void wd() 
	{
		System.out.println("Brand_name: " + brand);
		System.out.println("Product_id: " + productid);
		System.out.println("Fragnance: " + fragnance );
		System.out.println("Price :" + price);
		System.out.println("*****************************");
		
		buy b=new buy();
		b.buy();
		
	}
}

class Wildsil56v extends Wildstone
{
	Wildsil56v(String brand,String productid,String fragnance,double price)
	{
		this.brand=brand;
		this.productid=productid;
		this.fragnance=fragnance;
		this.price=price;
		
		wd();
	}
}

class Wildst756a extends Wildstone
{
	Wildst756a(String brand,String productid,String fragnance,double price)
	{
		this.brand=brand;
		this.productid=productid;
		this.fragnance=fragnance;
		this.price=price;
		
		wd();
	}
}

class Wildsfd89 extends Wildstone
{
	Wildsfd89(String brand,String productid,String fragnance,double price)
	{
		this.brand=brand;
		this.productid=productid;
		this.fragnance=fragnance;
		this.price=price;
		
		wd();
	}
}

class womens_Store extends categries
{
	public void womens_Store() 
	{
		System.out.println("Select What you want to shop in Womens department");
		System.out.println(" Enter 1 for clothing");
		System.out.println(" Enter 2 for Footwear");
		System.out.println(" Enter 3 Go back to categries");
		womens_Store wm1= new clothing_womens();//upcasting
		
		clothing_womens wm2=(clothing_womens)wm1;//downcasting
		
		womens_Store wm3= new footwear_womens();//upcasting
		
		footwear_womens wm4=(footwear_womens)wm3;//downcasting
		
		
		Scanner w = new Scanner(System.in);
		
		String p2=w.nextLine();
		
		switch (p2) 
		{
		case "1":System.out.println("Entering into Cloth Section");
		      wm2.cloths_womens();
			break;
		case "2":System.out.println("Entering into Footwear Section");
			 wm4.foot_womens();
			 break;
		case "3":
		     categries()
;
		default:System.out.println("Enter above option");
		  womens_Store();
			break;
		}
	}
}

class clothing_womens extends womens_Store
{
	public void cloths_womens()
	{

		System.out.println("Select Topwear");
		System.out.println("---------------------");
		System.out.println("Enter 1 for Top-tees");
		System.out.println("Enter 2 for Kurti");
		System.out.println("Enter 3 for Saree");
		System.out.println("---------------------");
		System.out.println("Select Bottomwear");
		System.out.println("Enter 4 for jeans");
		System.out.println("---------------------");
		
		clothing_womens c1=new Top_tees();//upcasting
		
		Top_tees c2=(Top_tees)c1;//downcasting
		
		clothing_womens c3=new Kurti();//upcasting
		
		Kurti c4=(Kurti)c3;//downcasting
		
		clothing_womens c5=new Saree();//upcasting
		
		Saree c6=(Saree)c5;//downcasting
		
		clothing_womens c7=new Jeans_w();//upcasting
		
		Jeans_w c8=(Jeans_w)c7;//downcasting
		
		
		
		Scanner s = new Scanner(System.in);
		
		String s1=s.nextLine();
		
		switch (s1) {
		case "1":System.out.println("choose TOPtEES of your choice");
		     c2.toptees();
			
			break;
			
		case "2":System.out.println("choose kURTIS of your choice");
			c4.kurtis();
		
		break;
		
		case "3":System.out.println("choose SAREE of your choice");
			c6.sarees();
		
		break;
		
		case "4":System.out.println("choose Jeans of your choice");
	     	c8.jeans();
		
		break;
		
		

		default:System.out.println(" choose vaild option ");
		 cloths_womens();
			break;
		}
	}
}


class Top_tees extends clothing_womens
{
	String brand;
	String material;
	String productid;
	String colour;
	String pattern;
	double price;
	public void toptees()
	{

			System.out.println("Select Your Favourite Brand ");
			System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			System.out.println("MANGO");
			System.out.println("AGON");
			System.out.println("MAX");
			System.out.println("DILLINGER");
			System.out.println("_______________________________");
			
			Mango p =new Mango();
			
			Agon h= new Agon();
			
			Max r=new Max();
			
			Dillinger w = new Dillinger();
			
			Scanner t=new Scanner(System.in);
			  String z=t.next();
			  
			  
			  switch (z) {
				case "1":
					    p.mango();
					
					break;
					
				case "2":
					    h.agon();
					
					break;
					
				case "3":
				    r.max();
				
				break;
				
				case "4":
				    w.dillinger();
				
				break;
				
				case "5":
				    cloths_womens();
				
				break;

				default:System.out.println(" please provide vaild choice");
					break;
				}
	}
}

class Mango extends Top_tees
{
	public void mango()
	{
		System.out.println(" you have selected Mango brand");
		System.out.println(" Enter 1 for Mangobk82");
		System.out.println(" Enter 2 for Mangowh21");
		System.out.println(" Enter 3 for Mangotp34");
		
		Scanner sc=new Scanner(System.in);
        String k=sc.next();
        
        switch (k) {
		case "1":System.out.println("_______________________");
		Mangobk82 r=new Mangobk82("MANGO","Cotton","Mangobk82","Pink","Printed round neck",400);
			break;
		
		case "2":System.out.println("_______________________");
		Mangowh21 ra =new Mangowh21("MANGO","Pure-Cotton","Mangowh21","Yellow","Printed brand logo",650);
		break;
		
		case "3":System.out.println("_______________________");
		Mangotp34 ro =new Mangotp34("MANGO","Cotton","Mangotp34","black","Solid",400);
		break;

		default:System.out.println("Please choose given items only");
		mango();
        }
	}
	
	public void mg() 
	{
		System.out.println("Brand_name: " + brand);
		System.out.println("Material: " + material);
		System.out.println("Product_id: " + productid);
		System.out.println("Colour: " + colour );
		System.out.println("Pattern "+ pattern);
		System.out.println("Price :" + price);
		System.out.println("*****************************");
		
		buy b=new buy();
		b.buy();
		
	}
}

class Mangobk82 extends Mango
{
	Mangobk82(String brand,String material,String productid,String colour,String pattern,double price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.price=price;
		
		mg();
	}
}

class Mangowh21 extends Mango
{
	Mangowh21(String brand,String material,String productid,String colour,String pattern,double price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.price=price;
		
		mg();
	}
}

class Mangotp34 extends Mango
{
	Mangotp34(String brand,String material,String productid,String colour,String pattern,double price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.price=price;
		
		mg();
	}
}

class Agon extends Top_tees
{
	public void agon()
	{
		System.out.println(" you have selected Agon brand");
		System.out.println(" Enter 1 for Agongy754");
		System.out.println(" Enter 2 for Agonbu963");
		System.out.println(" Enter 3 for Agonvc77");
		
		Scanner sc=new Scanner(System.in);
        String k=sc.next();
        
        switch (k) {
      		case "1":System.out.println("_______________________");
      		Agongy754 r=new Agongy754("Agon","Cotton","Agongy754","Pink","Printed round neck",400);
      			break;
      		
      		case "2":System.out.println("_______________________");
      		Agonbu963 ra =new Agonbu963("Agon","Pure-Cotton","Agonbu963","Yellow","Printed brand logo",650);
      		break;
      		
      		case "3":System.out.println("_______________________");
      		Agonvc77 ro =new Agonvc77("Agon","Cotton","Agonvc77","black","Solid",400);
      		break;

      		default:System.out.println("Please choose given items only");
      		agon();
              }
	}
	
	
	public void an() 
	{
		System.out.println("Brand_name: " + brand);
		System.out.println("Material: " + material);
		System.out.println("Product_id: " + productid);
		System.out.println("Colour: " + colour );
		System.out.println("Pattern "+ pattern);
		System.out.println("Price :" + price);
		System.out.println("*****************************");
		
		buy b=new buy();
		b.buy();
		
	}
}

class Agongy754 extends Agon
{
	Agongy754(String brand,String material,String productid,String colour,String pattern,double price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.price=price;
		
		an();
	}
}

class Agonbu963 extends Agon
{
	Agonbu963(String brand,String material,String productid,String colour,String pattern,double price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.price=price;
		
		an();
	}
}

class Agonvc77 extends Agon
{
	Agonvc77(String brand,String material,String productid,String colour,String pattern,double price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.price=price;
		
		an();
	}
}

class Max extends Top_tees
{
	public void max()
	{
			System.out.println(" you have selected Max brand");
			System.out.println(" Enter 1 for Maxgy754");
			System.out.println(" Enter 2 for Maxbu963");
			System.out.println(" Enter 3 for Maxvc77");
			
			Scanner sc=new Scanner(System.in);
	        String k=sc.next();
	        
	        switch (k) {
      		case "1":System.out.println("_______________________");
      		Maxgy754 r=new Maxgy754("Max","Cotton","Maxgy754","Pink","Printed round neck",400);
      			break;
      		
      		case "2":System.out.println("_______________________");
      		Maxbu963 ra =new Maxbu963("Max","Pure-Cotton","Maxbu963","Yellow","Printed brand logo",650);
      		break;
      		
      		case "3":System.out.println("_______________________");
      		Maxvc77 ro =new Maxvc77("Max","Cotton","Maxvc77","black","Solid",400);
      		break;

      		default:System.out.println("Please choose given items only");
      		max();
              }
		
	}
	
	public void mx() 
	{
		System.out.println("Brand_name: " + brand);
		System.out.println("Material: " + material);
		System.out.println("Product_id: " + productid);
		System.out.println("Colour: " + colour );
		System.out.println("Pattern "+ pattern);
		System.out.println("Price :" + price);
		System.out.println("*****************************");
		
		buy b=new buy();
		b.buy();
		
	}
}

class Maxgy754 extends Max
{
	Maxgy754(String brand,String material,String productid,String colour,String pattern,double price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.price=price;
		
		mx();
	}
}

class Maxbu963 extends Max
{
	Maxbu963(String brand,String material,String productid,String colour,String pattern,double price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.price=price;
		
		mx();
	}
}

class Maxvc77 extends Max
{
	Maxvc77(String brand,String material,String productid,String colour,String pattern,double price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.price=price;
		
		mx();
	}
}


class Dillinger extends Top_tees
{
	public void dillinger()
	{
		System.out.println(" you have selected Dillinger brand");
		System.out.println(" Enter 1 for Dill412");
		System.out.println(" Enter 2 for Dillinas45");
		System.out.println(" Enter 3 for  Dillasd55");
		
		Scanner sc=new Scanner(System.in);
        String k=sc.next();
        
        switch (k) {
  		case "1":System.out.println("_______________________");
  		Dill412 r=new Dill412("Dillinger","Cotton","Dill412","Pink","Printed round neck",400);
  			break;
  		
  		case "2":System.out.println("_______________________");
  		Dillinas45 ra =new Dillinas45("Dillinger","Pure-Cotton","Dillinas45","Yellow","Printed brand logo",650);
  		break;
  		
  		case "3":System.out.println("_______________________");
  		Dillasd55 ro =new Dillasd55("Dillinger","Cotton","Dillasd55","black","Solid",400);
  		break;

  		default:System.out.println("Please choose given items only");
  		dillinger();
          }
	}
	
	public void di() 
	{
		System.out.println("Brand_name: " + brand);
		System.out.println("Material: " + material);
		System.out.println("Product_id: " + productid);
		System.out.println("Colour: " + colour );
		System.out.println("Pattern "+ pattern);
		System.out.println("Price :" + price);
		System.out.println("*****************************");
		
		buy b=new buy();
		b.buy();
		
	}
}

class Dill412 extends Dillinger
{
	Dill412(String brand,String material,String productid,String colour,String pattern,double price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.price=price;
		
		di();
	}
}

class Dillinas45 extends Dillinger
{
	Dillinas45(String brand,String material,String productid,String colour,String pattern,double price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.price=price;
		
		di();
	}
}

class Dillasd55 extends Dillinger
{
	Dillasd55(String brand,String material,String productid,String colour,String pattern,double price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.price=price;
		
		di();
	}
}

class Kurti extends clothing_womens
{
	String brand;
	String material;
	String productid;
	String colour;
	String pattern;
	double price;
	public void kurtis()
	{
		System.out.println("Select Your Favourite Brand ");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("Anouk");
		System.out.println("Pistaa");
		System.out.println("Libas");
		System.out.println("Here&Now");
		System.out.println("_______________________________");
		
		Anouk p =new Anouk();
		
		Pistaa h= new Pistaa();
		
		Libas r=new Libas();
		
		Here_Now w = new Here_Now();
		
		Scanner t=new Scanner(System.in);
		  String z=t.next();
		  
		  switch (z) {
			case "1":
				    p.anouk();
				
				break;
				
			case "2":
				    h.pistaa();
				
				break;
				
			case "3":
			    r.libas();
			
			break;
			
			case "4":
			    w.here_Now();
			
			break;
			
			case "5":
			    cloths_womens();
			
			break;

			default:System.out.println(" please provide vaild choice");
				break;
			}
	}
}

class Anouk extends Kurti
{
	public void anouk()
	{
		System.out.println(" you have selected Mango brand");
		System.out.println(" Enter 1 for Anoukgobk82");
		System.out.println(" Enter 2 for Anoukwh21");
		System.out.println(" Enter 3 for Anoukp34");
		
		Scanner sc=new Scanner(System.in);
        String k=sc.next();
        
        switch (k) {
		case "1":System.out.println("_______________________");
		Anoukgobk82 r=new Anoukgobk82("Anouk","Cotton","Anoukgobk82","Pink","Printed round neck",400);
			break;
		
		case "2":System.out.println("_______________________");
		Anoukwh21 ra =new Anoukwh21("Anouk","Pure-Cotton","Anoukwh21","Yellow","Printed brand logo",650);
		break;
		
		case "3":System.out.println("_______________________");
		Anoukp34 ro =new Anoukp34("Anouk","Cotton","Anoukp34","black","Solid",400);
		break;

		default:System.out.println("Please choose given items only");
		anouk();
        }
	
	}
	
	public void ak() 
	{
		System.out.println("Brand_name: " + brand);
		System.out.println("Material: " + material);
		System.out.println("Product_id: " + productid);
		System.out.println("Colour: " + colour );
		System.out.println("Pattern "+ pattern);
		System.out.println("Price :" + price);
		System.out.println("*****************************");
		
		buy b=new buy();
		b.buy();
		
	}
}

class Anoukgobk82 extends Anouk
{
	Anoukgobk82(String brand,String material,String productid,String colour,String pattern,double price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.price=price;
		
		ak();
	}
}

class Anoukwh21 extends Anouk
{
	Anoukwh21(String brand,String material,String productid,String colour,String pattern,double price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.price=price;
		
		ak();
	}
}

class Anoukp34 extends Anouk
{
	Anoukp34(String brand,String material,String productid,String colour,String pattern,double price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.price=price;
		
		ak();
	}
}


class Pistaa extends Kurti
{
	public void pistaa()
	{
		System.out.println(" you have selected Mango brand");
		System.out.println(" Enter 1 for Pistawhit92");
		System.out.println(" Enter 2 for Pistaagry41");
		System.out.println(" Enter 3 for Pistagh334");
		
		Scanner sc=new Scanner(System.in);
        String k=sc.next();
        
        switch (k) {
		case "1":System.out.println("_______________________");
		Pistawhit92 r=new Pistawhit92("Pistaa","Cotton","Pistawhit92","White","Printed round neck",400);
			break;
		
		case "2":System.out.println("_______________________");
		Pistaagry41 ra =new Pistaagry41("Pistaa","Pure-Cotton","Pistaagry41","grey","Printed brand logo",650);
		break;
		
		case "3":System.out.println("_______________________");
		Pistagh334 ro =new Pistagh334("Pistaa","Cotton","Pistagh334","black","Solid",600);
		break;

		default:System.out.println("Please choose given items only");
		pistaa();
        }
	}
	
	public void pi() 
	{
		System.out.println("Brand_name: " + brand);
		System.out.println("Material: " + material);
		System.out.println("Product_id: " + productid);
		System.out.println("Colour: " + colour );
		System.out.println("Pattern "+ pattern);
		System.out.println("Price :" + price);
		System.out.println("*****************************");
		
		buy b=new buy();
		b.buy();
		
	}
}

class Pistawhit92 extends Pistaa
{
	Pistawhit92(String brand,String material,String productid,String colour,String pattern,double price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.price=price;
		
		pi();
	}
}

class Pistaagry41 extends Pistaa
{
	Pistaagry41(String brand,String material,String productid,String colour,String pattern,double price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.price=price;
		
		pi();
	}
}

class Pistagh334 extends Pistaa
{
	Pistagh334(String brand,String material,String productid,String colour,String pattern,double price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.price=price;
		
		pi();
	}
}

class Libas extends Kurti
{
	public void libas()
	{
		System.out.println(" you have selected Mango brand");
		System.out.println(" Enter 1 for Mangobk82");
		System.out.println(" Enter 2 for Mangowh21");
		System.out.println(" Enter 3 for Mangotp34");
		
		Scanner sc=new Scanner(System.in);
        String k=sc.next();
        
        switch (k) {
		case "1":System.out.println("_______________________");
		Mangobk82 r=new Mangobk82("MANGO","Cotton","Mangobk82","Pink","Printed round neck",400);
			break;
		
		case "2":System.out.println("_______________________");
		Mangowh21 ra =new Mangowh21("MANGO","Pure-Cotton","Mangowh21","Yellow","Printed brand logo",650);
		break;
		
		case "3":System.out.println("_______________________");
		Mangotp34 ro =new Mangotp34("MANGO","Cotton","Mangotp34","black","Solid",400);
		break;

		default:System.out.println("Please choose given items only");
		libas();
        }
	}
	
	public void pi() 
	{
		System.out.println("Brand_name: " + brand);
		System.out.println("Material: " + material);
		System.out.println("Product_id: " + productid);
		System.out.println("Colour: " + colour );
		System.out.println("Pattern "+ pattern);
		System.out.println("Price :" + price);
		System.out.println("*****************************");
		
		buy b=new buy();
		b.buy();
		
	}
}

class Here_Now extends Kurti
{
	public void here_Now()
	{
		
	System.out.println(" you have selected Mango brand");
	System.out.println(" Enter 1 for HNsa78");
	System.out.println(" Enter 2 for Hnpeach5");
	System.out.println(" Enter 3 for HNkt32");
	
	Scanner sc=new Scanner(System.in);
    String k=sc.next();
    
    switch (k) {
	case "1":System.out.println("_______________________");
	HNsa78 r=new HNsa78("Here_Now","Cotton","HNsa78","Pink","Printed round neck",400);
		break;
	
	case "2":System.out.println("_______________________");
	Hnpeach5 ra =new Hnpeach5("Here_Now","Pure-Cotton","Hnpeach5","Yellow","Printed brand logo",650);
	break;
	
	case "3":System.out.println("_______________________");
	HNkt32 ro =new HNkt32("Here_Now","Cotton","HNkt32","black","Solid",400);
	break;

	default:System.out.println("Please choose given items only");
	here_Now();
         }
    }
	
	public void hn() 
	{
		System.out.println("Brand_name: " + brand);
		System.out.println("Material: " + material);
		System.out.println("Product_id: " + productid);
		System.out.println("Colour: " + colour );
		System.out.println("Pattern "+ pattern);
		System.out.println("Price :" + price);
		System.out.println("*****************************");
		
		buy b=new buy();
		b.buy();
		
	}
}

class HNsa78 extends Here_Now
{
	HNsa78(String brand,String material,String productid,String colour,String pattern,double price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.price=price;
		
		hn();
	}
}

class Hnpeach5 extends Here_Now
{
	Hnpeach5(String brand,String material,String productid,String colour,String pattern,double price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.price=price;
		
		hn();
	}
}

class HNkt32 extends Here_Now
{
	HNkt32(String brand,String material,String productid,String colour,String pattern,double price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.price=price;
		
		hn();
	}
}

class Saree extends clothing_womens
{
	String type;
	String material;
	String productid;
	String colour;
	String pattern;
	double price;
	public void sarees()
	{
		System.out.println("Select Your Favourite Brand ");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println(" 1: Banarasi");
		System.out.println(" 2: Paitani");
		System.out.println(" 3: Khadi");
		System.out.println(" 4: Go back to cloths Selection");
		System.out.println("_______________________________");
		
		Banarasi p =new Banarasi();
		
		Paitani h= new Paitani();
		
		Khadi r=new Khadi();
		
		
		Scanner t=new Scanner(System.in);
		  String z=t.next();
		  
		  switch (z) {
			case "1":
				    p.banarasi();
				
				break;
				
			case "2":
				    h.paitani();
				
				break;
				
			case "3":
			    r.khadi();
			
			break;
			
			
			case "4":
			    cloths_womens();
			
			break;

			default:System.out.println(" please provide vaild choice");
				break;
			}
	}
}

class Banarasi extends Saree
{
	public void banarasi() 
	{
		System.out.println(" you have selected Banarasi Saree");
		System.out.println(" Enter 1 for Banarasi Silk Solid");
		System.out.println(" Enter 2 for Banarasi Floral Silk");
		System.out.println(" Enter 3 for Banarasi Woven Design");
		System.out.println(" Enter 4 for To Select another type os Saree");
		
		Scanner sc=new Scanner(System.in);
	    String k=sc.next();
	    
	    switch (k) {
		case "1":System.out.println("_______________________");
		Banas21 r=new Banas21("Banarasi","Silk","Banas21","Black","Solid",850);
			break;
		
		case "2":System.out.println("_______________________");
		Banasred2 ra =new Banasred2("Banarasi","Pure-Cotton","Banasred2","Yellow","Floral",950);
		break;
		
		case "3":System.out.println("_______________________");
		Bnkt32 ro =new Bnkt32("Banarasi","Cotton","Bnkt32","red-black","Zari",19500);
		break;
		
		case "4":System.out.println("_______________________");
		   sarees();
			break;

		default:System.out.println("Please choose given items only");
		banarasi();
	         }
	}
	
	public void bn() 
	{
		System.out.println("Saree_Type: " + type);
		System.out.println("Material: " + material);
		System.out.println("Product_id: " + productid);
		System.out.println("Colour: " + colour );
		System.out.println("Pattern "+ pattern);
		System.out.println("Price :" + price);
		System.out.println("*****************************");
		
		buy b=new buy();
		b.buy();
		
	}
}

class Banas21 extends Banarasi
{
	Banas21(String type,String material,String productid,String colour,String pattern,double price)
	{
		this.type=type;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.price=price;
		
		bn();
	}
}

class Banasred2 extends Banarasi
{
	Banasred2(String type,String material,String productid,String colour,String pattern,double price)
	{
		this.type=type;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.price=price;
		
		bn();
	}
}

class Bnkt32 extends Banarasi
{
	Bnkt32(String type,String material,String productid,String colour,String pattern,double price)
	{
		this.type=type;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.price=price;
		
		bn();
	}
}

class Paitani extends Saree
{
	public void paitani() 
	{
		System.out.println(" you have selected Paitani Saree");
		System.out.println(" Enter 1 for Paitani Silk Solid");
		System.out.println(" Enter 2 for Paitani  Silk");
		System.out.println(" Enter 3 for Paitani Woven Design");
		System.out.println(" Enter 4 for To Select another type os Saree");
		
		Scanner sc=new Scanner(System.in);
	    String k=sc.next();
	    
	    switch (k) {
		case "1":System.out.println("_______________________");
		Paitsilk21 r=new Paitsilk21("Paitani","Silk","Paitsilk21","Black","Solid",850);
			break;
		
		case "2":System.out.println("_______________________");
		Paitanired2 ra =new Paitanired2("Paitani","Pure-Cotton","Paitanired2","Yellow","Floral",950);
		break;
		
		case "3":System.out.println("_______________________");
		Pati342 ro =new Pati342("Paitani","Cotton","Pati342","red-black","Zari",19500);
		break;
		
		case "4":System.out.println("_______________________");
		   sarees();
			break;

		default:System.out.println("Please choose given items only");
		paitani();
	         }
	}
	
	public void pt() 
	{
		System.out.println("Saree_Type: " + type);
		System.out.println("Material: " + material);
		System.out.println("Product_id: " + productid);
		System.out.println("Colour: " + colour );
		System.out.println("Pattern "+ pattern);
		System.out.println("Price :" + price);
		System.out.println("*****************************");
		
		buy b=new buy();
		b.buy();
		
	}
}

class Paitsilk21 extends Paitani
{
	Paitsilk21(String type,String material,String productid,String colour,String pattern,double price)
	{
		this.type=type;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.price=price;
		
		pt();
	}
}

class Paitanired2 extends Paitani
{
	Paitanired2(String type,String material,String productid,String colour,String pattern,double price)
	{
		this.type=type;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.price=price;
		
		pt();
	}
}

class Pati342 extends Paitani
{
	Pati342(String type,String material,String productid,String colour,String pattern,double price)
	{
		this.type=type;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.price=price;
		
		pt();
	}
}

class Khadi extends Saree
{
	public void khadi() 
	{
		System.out.println(" you have selected Paitani Saree");
		System.out.println(" Enter 1 for Paitani Silk Solid");
		System.out.println(" Enter 2 for Paitani  Silk");
		System.out.println(" Enter 3 for Paitani Woven Design");
		System.out.println(" Enter 4 for To Select another type os Saree");
		
		Scanner sc=new Scanner(System.in);
	    String k=sc.next();
	    
	    switch (k) {
		case "1":System.out.println("_______________________");
		Khadi21 r=new Khadi21("Khadi","Silk","Khadi21","Black","Solid",850);
			break;
		
		case "2":System.out.println("_______________________");
		Kha782 ra =new Kha782("Khadi","Pure-Cotton","Kha782","pink","Floral",950);
		break;
		
		case "3":System.out.println("_______________________");
		Khadi32 ro =new Khadi32("Khadi","Silk-Cotton","Khadi32","red-black","Warli",9500);
		break;
		
		case "4":System.out.println("_______________________");
		   sarees();
			break;

		default:System.out.println("Please choose given items only");
		khadi();
	         }
	}
	
	public void kh() 
	{
		System.out.println("Saree_Type: " + type);
		System.out.println("Material: " + material);
		System.out.println("Product_id: " + productid);
		System.out.println("Colour: " + colour );
		System.out.println("Pattern "+ pattern);
		System.out.println("Price :" + price);
		System.out.println("*****************************");
		
		buy b=new buy();
		b.buy();
		
	}
}


class Khadi21 extends Khadi
{
	Khadi21(String type,String material,String productid,String colour,String pattern,double price)
	{
		this.type=type;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.price=price;
		
		kh();
	}
}


class Kha782 extends Khadi
{
	Kha782(String type,String material,String productid,String colour,String pattern,double price)
	{
		this.type=type;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.price=price;
		
		kh();
	}
}

class Khadi32 extends Khadi
{
	Khadi32(String type,String material,String productid,String colour,String pattern,double price)
	{
		this.type=type;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.price=price;
		
		kh();
	}
}


class Jeans_w extends clothing_womens
{
	String brand;
	String material;
	String productid;
	String colour;
	String pattern;
	String avbSize;
	double price;
	public void jeans()
	{
		System.out.println("Select Your Favourite Brand ");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println(" 1: LEVIS");
		System.out.println(" 2: Kotty");
		System.out.println(" 3: FlyingMachine");
		System.out.println("_______________________________");
		
		Levis p =new Levis();
		
		Kotty h= new Kotty();
		
		FlyingMachine r=new FlyingMachine();
		
		
		Scanner t=new Scanner(System.in);
		  String z=t.next();
		  
		  switch (z) {
			case "1":
				    p.levis();
				
				break;
				
			case "2":
				    h.kotty();
				
				break;
				
			case "3":
			    r.fm();
			
			break;
			
			
			
			case "4":
			    cloths_womens();
			
			break;

			default:System.out.println(" please provide vaild choice");
				break;
			}
	}
}

class Leviss extends Jeans_w
{
	public void levis()
	{
		System.out.println(" you have selected Wrong brand");
		System.out.println(" Enter 1 for leviblack95w");
		System.out.println(" Enter 2 for levgreya58w");
		System.out.println(" Enter 3 for levtoned896w");
		
		Scanner sc=new Scanner(System.in);
        String k=sc.next();
        
        switch (k) {
		case "1":System.out.println("_______________________");
		leviblack95w r=new leviblack95w("Levis"," Denim","leviblack95w","black","Women Slim fit","S,M,L,Xl",3599);
			break;
		
		case "2":System.out.println("_______________________");
		levgreya58w ra =new levgreya58w("Levis","Denim","levgreya58w","Grey","Bell Bottom","S,M,L,Xl",2299);
		break;
		
		case "3":System.out.println("_______________________");
		levtoned896w ro =new levtoned896w("Levis","Denim","levtoned896","Blue","Baggy tapperd","S,M,L,Xl",2099);
		break;

		default:System.out.println("Please choose given items only");
		levis();
         }
	}
	
	public void li() 
	{
		System.out.println("Brand_name: " + brand);
		System.out.println("Material: " + material);
		System.out.println("Product_id: " + productid);
		System.out.println("Colour :" + colour);
		System.out.println("Pattern :" + pattern);
		System.out.println("Available Size :" + avbSize);
		System.out.println("Price :" + price);
		System.out.println("*****************************");
		
		buy b=new buy();
		b.buy();
		
		
	}
}

class leviblack95w extends Leviss
{
	leviblack95w(String brand, String material, String productid,String colour,String pattern,String avbSize,double price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		li();
	}

}

class levgreya58w extends Leviss
{
	levgreya58w(String brand, String material, String productid,String colour,String pattern,String avbSize,double price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		li();
	}

}

class levtoned896w extends Leviss
{
	levtoned896w(String brand, String material, String productid,String colour,String pattern,String avbSize,double price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		li();
	}

}

class Kotty extends Jeans_w
{
	public void kotty()
	{
		System.out.println(" you have selected Wrong brand");
		System.out.println(" Enter 1 for Knottblack95w");
		System.out.println(" Enter 2 for kttgreya58w");
		System.out.println(" Enter 3 for kotoned896w");
		
		Scanner sc=new Scanner(System.in);
        String k=sc.next();
        
        switch (k) {
		case "1":System.out.println("_______________________");
		Knottblack95w r=new Knottblack95w("Kotty"," Denim","Knottblack95w","black","Women Straight fit","S,M,L,Xl",1599);
			break;
		
		case "2":System.out.println("_______________________");
		kttgreya58w ra =new kttgreya58w("Levis","Denim","kttgreya58w","Grey","Bell Bottom","S,M,L,Xl",2299);
		break;
		
		case "3":System.out.println("_______________________");
		kotoned896w ro =new kotoned896w("Levis","Denim","kotoned896w","Blue","Flared high rise","S,M,L,Xl",2099);
		break;

		default:System.out.println("Please choose given items only");
		kotty();
         }
	}
	
	public void kt() 
	{
		System.out.println("Brand_name: " + brand);
		System.out.println("Material: " + material);
		System.out.println("Product_id: " + productid);
		System.out.println("Colour :" + colour);
		System.out.println("Pattern :" + pattern);
		System.out.println("Available Size :" + avbSize);
		System.out.println("Price :" + price);
		System.out.println("*****************************");
		
		buy b=new buy();
		b.buy();
		
		
	}
}

class Knottblack95w extends Kotty
{
	Knottblack95w(String brand, String material, String productid,String colour,String pattern,String avbSize,double price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		kt();
	}

}

class kttgreya58w extends Kotty
{
	kttgreya58w(String brand, String material, String productid,String colour,String pattern,String avbSize,double price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		kt();
	}

}

class kotoned896w extends Kotty
{
	kotoned896w(String brand, String material, String productid,String colour,String pattern,String avbSize,double price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		kt();
	}

}


class FlyingMachine extends Jeans_w
{
	public void fm()
	{
		System.out.println(" you have selected FlyingMachine brand");
		System.out.println(" Enter 1 for Flyblack95w");
		System.out.println(" Enter 2 for Flymacha58w");
		System.out.println(" Enter 3 for Flymach896w");
		
		Scanner sc=new Scanner(System.in);
        String k=sc.next();
        
        switch (k) {
		case "1":System.out.println("_______________________");
		Flyblack95w r=new Flyblack95w("FlyingMachine"," Denim","Flyblack95w","black","Women Straight fit","S,M,L,Xl",1599);
			break;
		
		case "2":System.out.println("_______________________");
		Flymacha58w ra =new Flymacha58w("FlyingMachine","Denim","Flymacha58w","Grey","Bell Bottom","S,M,L,Xl",2299);
		break;
		
		case "3":System.out.println("_______________________");
		Flymach896w ro =new Flymach896w("FlyingMachine","Denim","Flymach896w","Blue","Flared high rise","S,M,L,Xl",2099);
		break;

		default:System.out.println("Please choose given items only");
		fm();
         }
	}
	
	public void fl() 
	{
		System.out.println("Brand_name: " + brand);
		System.out.println("Material: " + material);
		System.out.println("Product_id: " + productid);
		System.out.println("Colour :" + colour);
		System.out.println("Pattern :" + pattern);
		System.out.println("Available Size :" + avbSize);
		System.out.println("Price :" + price);
		System.out.println("*****************************");
		
		buy b=new buy();
		b.buy();
		
		
	}
}

class Flyblack95w extends FlyingMachine
{
	Flyblack95w(String brand, String material, String productid,String colour,String pattern,String avbSize,double price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		fl();
	}

}

class Flymacha58w extends FlyingMachine
{
	Flymacha58w(String brand, String material, String productid,String colour,String pattern,String avbSize,double price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		fl();
	}

}

class Flymach896w extends FlyingMachine
{
	Flymach896w(String brand, String material, String productid,String colour,String pattern,String avbSize,double price)
	{
		this.brand=brand;
		this.material=material;
		this.productid=productid;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		fl();
	}

}

class footwear_womens extends womens_Store
{   String brand;
	String productid;
	String type;
	String colour;
	String pattern;
	String avbSize;
	double price;
	public void foot_womens()
   {
	System.out.println("Select Your Favourite Brand ");
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	System.out.println(" 1: Flat");
	System.out.println(" 2: Heels");
	System.out.println(" 3: CasualShoes");
	System.out.println("_______________________________");
	
	Flat p =new Flat();
	
	Heels h= new Heels();
	
	CasualShoes r=new CasualShoes();
	
	
	Scanner t=new Scanner(System.in);
	  String z=t.next();
	  
	  switch (z) {
		case "1":
			    p.flats();
			
			break;
			
		case "2":
			    h.heels();
			
			break;
			
		case "3":
		    r.casualShoes();
		
		break;
		
		case "4":
			womens_Store();
		
		break;
		

		default:System.out.println(" please provide vaild choice");
			break;
		}
     }
}

class Flat extends footwear_womens
{
	public void flats()
	{
		System.out.println(" you have selected Flats type");
		System.out.println(" Enter 1 for Mojari Flat");
		System.out.println(" Enter 2 for Open toe Flat");
		System.out.println(" Enter 3 for one toe Flat");
		
		Scanner sc=new Scanner(System.in);
        String k=sc.next();
        
        switch (k) {
		case "1":System.out.println("_______________________");
		Flat95w r=new Flat95w("Kiana","Flat95w","Flat Sole","black","Women Mojari Flat","6,7,8,9",599);
			break;
		
		case "2":System.out.println("_______________________");
		Flatmo745w ra =new Flatmo745w("Mochi","Flatmo745w","Fkat Sole","brown","Open toe Flat","6,7,8,9",999);
		break;
		
		case "3":System.out.println("_______________________");
		Flatone45w ro =new Flatone45w("Shoestail","Flatone45w","Flat Sole","Yellow","printed one Flat","6,7,8,9",899);
		break;

		default:System.out.println("Please choose given items only");
		flats();
         }
	}
	
	public void fs() 
	{
		System.out.println("Brand_name: " + brand);
		System.out.println("Product_id: " + productid);
		System.out.println("Type: " + type);
		System.out.println("Colour :" + colour);
		System.out.println("Pattern :" + pattern);
		System.out.println("Available Size :" + avbSize);
		System.out.println("Price :" + price);
		System.out.println("*****************************");
		
		buy b=new buy();
		b.buy();
		
		
	  }
	
}

class Flat95w extends Flat
{
	Flat95w(String brand, String productid, String type,String colour, String pattern, String avbSize, double price)
	{
		this.brand=brand;
		this.productid=productid;
		this.type=type;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		fs();
		
	}
}


class Flatmo745w extends Flat
{
	Flatmo745w(String brand, String productid, String type,String colour, String pattern, String avbSize, double price)
	{
		this.brand=brand;
		this.productid=productid;
		this.type=type;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		fs();
		
	}
}

class Flatone45w extends Flat
{
	Flatone45w(String brand, String productid, String type,String colour, String pattern, String avbSize, double price)
	{
		this.brand=brand;
		this.productid=productid;
		this.type=type;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		fs();
		
	}
}
class Heels extends footwear_womens
{
	public void heels()
	{
		System.out.println(" you have selected Heels type");
		System.out.println(" Enter 1 for Block pump Heels");
		System.out.println(" Enter 2 for Kitten heel sandal");
		System.out.println(" Enter 3 for Solid wedges");
		
		Scanner sc=new Scanner(System.in);
        String k=sc.next();
        
        switch (k) {
		case "1":System.out.println("_______________________");
		Heel95w r=new Heel95w("Kiana","Heel95w","Heel","black","Block pump Heels","6,7,8,9",599);
			break;
		
		case "2":System.out.println("_______________________");
		Heelmo745w ra =new Heelmo745w("Mochi","Flatmo745w","Fkat Sole","brown","Kitten heel sandal","6,7,8,9",999);
		break;
		
		case "3":System.out.println("_______________________");
		Heelne45w ro =new Heelne45w("Shoestail","Heelne45w","Flat Sole","Black","Solid wedges","6,7,8,9",899);
		break;

		default:System.out.println("Please choose given items only");
		heels();
         }
	}
	
	public void he() 
	{
		System.out.println("Brand_name: " + brand);
		System.out.println("Product_id: " + productid);
		System.out.println("Type: " + type);
		System.out.println("Colour :" + colour);
		System.out.println("Pattern :" + pattern);
		System.out.println("Available Size :" + avbSize);
		System.out.println("Price :" + price);
		System.out.println("*****************************");
		
		buy b=new buy();
		b.buy();
		
		
	  }
}

class Heelmo745w extends Heels
{
	Heelmo745w(String brand, String productid, String type,String colour, String pattern, String avbSize, double price)
	{
		this.brand=brand;
		this.productid=productid;
		this.type=type;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		he();
		
	}
}

class Heel95w extends Heels
{
	Heel95w(String brand, String productid, String type,String colour, String pattern, String avbSize, double price)
	{
		this.brand=brand;
		this.productid=productid;
		this.type=type;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		he();
		
	}
}

class Heelne45w extends Heels
{
	Heelne45w(String brand, String productid, String type,String colour, String pattern, String avbSize, double price)
	{
		this.brand=brand;
		this.productid=productid;
		this.type=type;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		he();
		
	}
}

class CasualShoes extends footwear_womens
{
	public void casualShoes()
	{
		System.out.println(" you have selected Shoes type");
		System.out.println(" Enter 1 for Sneaker");
		System.out.println(" Enter 2 for Colour Changing Shoes");
		System.out.println(" Enter 3 for Colour Blocked sneaker");
		
		Scanner sc=new Scanner(System.in);
        String k=sc.next();
        
        switch (k) {
		case "1":System.out.println("_______________________");
		Cshoe95w r=new Cshoe95w("Nike","Cshoe95w","Casual Shoes","white","Sneaker","6,7,8,9",1099);
			break;
		
		case "2":System.out.println("_______________________");
		Cshoe745w ra =new Cshoe745w("Skechters","Cshoemo745w","Casual Shoes","brown","Colour Changing Shoes","6,7,8,9",999);
		break;
		
		case "3":System.out.println("_______________________");
		Cshoesone45w ro =new Cshoesone45w("Roadsters","Cshoesone45w","Casual Shoes","Yellow","Colour Blocked ","6,7,8,9",899);
		break;

		default:System.out.println("Please choose given items only");
		casualShoes();
         }
	}
	
	public void cs() 
	{
		System.out.println("Brand_name: " + brand);
		System.out.println("Product_id: " + productid);
		System.out.println("Type: " + type);
		System.out.println("Colour :" + colour);
		System.out.println("Pattern :" + pattern);
		System.out.println("Available Size :" + avbSize);
		System.out.println("Price :" + price);
		System.out.println("*****************************");
		
		buy b=new buy();
		b.buy();
		
		
	  }
}

class Cshoe95w extends CasualShoes
{
	Cshoe95w(String brand, String productid, String type,String colour, String pattern, String avbSize, double price)
	{
		this.brand=brand;
		this.productid=productid;
		this.type=type;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		cs();
		
	}
}

class Cshoe745w extends CasualShoes
{
	Cshoe745w(String brand, String productid, String type,String colour, String pattern, String avbSize, double price)
	{
		this.brand=brand;
		this.productid=productid;
		this.type=type;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		cs();
		
	}
}

class Cshoesone45w extends CasualShoes
{
	Cshoesone45w(String brand, String productid, String type,String colour, String pattern, String avbSize, double price)
	{
		this.brand=brand;
		this.productid=productid;
		this.type=type;
		this.colour=colour;
		this.pattern=pattern;
		this.avbSize=avbSize;
		this.price=price;
		
		cs();
		
	}
}



//Main Drive
public class Fashion_hunt 
{ 
	//static block
	static
	{
		System.out.println("**********************************************");
		System.out.println("*                                            *");
		System.out.println("*            Welcome to Fashion              *");
		System.out.println("*                                            *");
		System.out.println("**********************************************");
	}
	public static void main(String[] args) 
	{
	   //login b=new login();
		//b.login();
		
		categries c=new categries();
		c.categries();
	}

}

interface I
{
   void login();	
}

class login implements I
{
	String username;
	String password;
	private Long mobileno;
	
	
	public Long getMobileno() 
	{
		return mobileno;
	}
	// long mb= getMobileno();
	
	public void login()
	{
		System.out.println("Login Details");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("======================");
		System.out.println("username :- " );
		 username =sc.nextLine();
		
		System.out.println("----------------------");
		System.out.println("password :- " );
		 password=sc.nextLine();
		
		System.out.println("----------------------");
		System.out.println("Mobile no :- " );
	//	long mb=sc.nextLong();
		
		try 
		{
			long mb=sc.nextLong();
			if(mb>=1000000000 || mb==9999999999L) 
			{
				//login2();
			    System.out.println("--------------------------------------");
				System.out.println("         Login Successful             ");
				System.out.println("--------------------------------------");
			}
			else 
			{
				System.out.println("Please enter 10 digit number");
				login();
			}
		}
		catch(InputMismatchException in)
		{
			System.out.println("Please enter number only");
			System.out.println("************************");
			login();
		}
		//login();
			
		
		
		
	}
	
	public void login2()
	{
		/*System.out.println("-----------------------------------");
		System.out.println("   Confirm Your details"  );
		System.out.println("-----------------------------------");
		System.out.println("username :-" + username);
		System.out.println("password :-" + password);
		System.out.println("mobile no :-" + mobileno);*/
		System.out.println("-----------------------------------");
		System.out.println("-----------------------------------");
		System.out.println("Login Successful ");
		System.out.println("Enjoy the shoping");
		System.out.println("Enter 1 to shop");
		System.out.println("Enter 2 to change the details ");
		System.out.println("-----------------------------------");
		
		categries c =new categries();
		I n = new login();
		
		Scanner s =new Scanner(System.in);
		String a= s.nextLine();
		
		switch(a)
		{
		case "1": c.categries();
		break;
		case "2": n.login();
		break;
		default : System.out.println("Enter only above option");
		login2();
		}
		
	}
	
}

class buy 
{
	public void buy()
	{
		
		
		System.out.println("Enter 1 to buy");
		System.out.println("Enter 2 to go back to Shop ");
		categries w= new categries();
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		switch (a) {
		case "1":
			System.out.println("   Please Complete Login  Process ");
			 System.out.println("_______________________________________");
			 login b=new login();
			 b.login();
			 payment();
			break;
		case "2": System.out.println("You choose to go back to Shop");
		w.categries();
	    break;
		default: System.out.println("Select valid number only");
		buy();
		}
		
		
	}
	
	public void payment()
	{
		 System.out.println("    Enter 1 to pay by Cash            ");
		  System.out.println("   Enter 2 to pay by UPI             ");
		  System.out.println("   Enetr 3 to pay by Card Payment    ");
		  System.out.println("   Enetr 4 back to buy               ");
		 
		  
		  Scanner sc=new Scanner(System.in);
		  String b=sc.next();
		  
		  switch (b)
		  {
		  case "1":
		  System.out.println("_______________________________________");
		  System.out.println("Thank you for Shopping with us");
		  break;
		  
		  case "2": System.out.println("    You Selected Gpay Option    ");
		   System.out.println("--------------------------------");
		   System.out.println("   Enter the amount of the product   ");
		   Scanner k= new Scanner(System.in);
		   double f= k.nextDouble();
		   System.out.println(" your Amout to Pay is: " + f +"$" );
		   
		   System.out.println("Enter your Upi id");
		   Scanner p= new Scanner(System.in);
		   String upi= p.nextLine();
		   System.out.println("Your UPI: Id Is:" +upi+"@sbi");
		   System.out.println("-----------------------------");
		   System.out.println("Enter your UPI pin");
		   Scanner t= new Scanner(System.in);
		   int a1=t.nextInt();
		   
		   System.out.println("Your PIn is:" +a1);
		  /* int pin=(int)(1000*Math.random());
		   System.out.println("your pin is " +pin);
		   int pin1=t.nextInt();
		   if(pin==pin1)
		   {
			   System.out.println("Your payment is Succesful");
		   }
		   else
		   {
			   System.out.println("Transaction is Failed");
			   System.out.println("Please enter valid pin");
		   }*/
		   
			  
		  System.out.println("Your UPI Payment is done successfully");
		  System.out.println("_______________________________________");
		  System.out.println("Thank you for Shopping with us");
		  break;
		  case "3": 
			  System.out.println(" Enter ypur card details");
			  System.out.println("Note:- Card No. Format: 'XXXX-XXXX-XXXX-XXXX' ");
			  Scanner t1= new Scanner(System.in);
			   String a2=t1.nextLine();
			   if(a2.matches("[0-9]{4}[-]{1}[0-9]{4}[-]{1}[0-9]{4}[-]{1}[0-9]{4}"))
			   {
				   System.out.println("Please enter the otp");
				   int pin=(int)(1000*Math.random());
				   System.out.println("your OTP is " +pin);
				   int pin1=t1.nextInt();
				   if(pin==pin1)
				   {
					   System.out.println("Your payment is Succesful");
				   }
				   else
				   {
					   System.out.println("Transaction is Failed");
					   System.out.println("Please enter valid pin");
					   System.out.println("");
				   }
			   }
			   else
			   {
				   System.out.println("Please enter vaild information");
				   payment();
				   
			   }
			  
			//  System.out.println("Your Bank Transfer is done successfully");
		  System.out.println("_______________________________________");
		  System.out.println("Thank you for Shopping with us");
		  break;
		  
		  case "4":
			  System.out.println("_______________________________________");
			  buy();
		  break;
		  
		 
		  default: System.out.println("!!!Please enter valid number!!!");
		  payment();
		 
		  }
	}
}





