package RulesOfAcessSpecifiers;

public class Demo4 extends Demo3 {
	//Here we make return type is float .But parent class method return type is int.
	//so error. If we can overcome that error we should make it return type of below 
	//method is should be same   (int)
	public float display()
	{
		return 1.111f;
	}
}
