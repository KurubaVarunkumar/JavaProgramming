package RulesOfAcessSpecifiers;

public class Demo2 extends Demo1 {
	//visibility should not be decrease hence error
	/*private void greet()
	{
		System.out.println("Hello");
	}*/
	//no error in below code as we are mainting same visibility
	//(or increase visibility)
	public void greet()
	{
   super.greet();	
   }
	

}
