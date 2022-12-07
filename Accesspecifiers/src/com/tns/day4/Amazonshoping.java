package com.tns.day4;

public interface Amazonshoping 
{
	
	abstract void homePage();
	abstract void selectItem();
	abstract void placeOrder();
	abstract void orderDeliverd ();

}

class Pants implements Amazonshoping
{
	public void homePage()
	{
		System.out.println("formals");
		System.out.println("jeans");
		System.out.println("sports");
	}
	public void selectItem()
	{
		System.out.println("coustmer serching for pants");
		System.out.println("coustmer selecting pants");
		System.out.println("order received by amazon");
	}
	public void placeOrder()
	{
		System.out.println("coustmer entered a address for deliver the order");
		System.out.println("amazon gives a order to delivary boy");
	}
	public void orderDeliverd ()
	{
		System.out.println("delivary boy deliverd item to coustmer");
	}
}
class Shoes implements Amazonshoping
{
	public void homePage()
	{
		System.out.println("running shoes");
		System.out.println("loofers");
		System.out.println("formal shoes");
	}
	public void selectItem()
	{
		System.out.println("coustmer serching for shoes");
		System.out.println("coustmer selecting shoes");
		System.out.println("order received by amazon");
	}
	public void placeOrder()
	{
		System.out.println("coustmer entered a address for deliver the order");
		System.out.println("amazon gives a order to delivary boy");
	}
	public void orderDeliverd ()
	{
		System.out.println("delivary boy deliverd item to coustmer");
	}
}
class amazonApp 
{
	Amazonshoping selectitem (char ch)
	{
		if(ch=='p')
		{
			return new Pants();
		}
		else
		{
			return new Shoes();
		}
			
	}
}
class User
{
	public static void main(String[] args) {
		
		amazonApp ref = new amazonApp();
		Amazonshoping as = ref.selectitem('p');
		as.homePage();
		as.selectItem();
		as.placeOrder();
		as.orderDeliverd();
	}
}
