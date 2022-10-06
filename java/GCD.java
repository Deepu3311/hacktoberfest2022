class GCD  {   
	public static void main(String[] args)   {   
		int a = 10, b = 5;   
		System.out.println("GCD of " + a +" and " + b + " is " + findGCD(a, b));   
	}  
	static int findGCD(int a, int b)   {   
		if (b == 0)   
			return a;     
		return findGCD(b, a % b);   
	}   
}  
