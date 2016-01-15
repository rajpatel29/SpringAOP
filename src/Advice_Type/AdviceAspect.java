package Advice_Type;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AdviceAspect 
{
/*		
	@Before("args(String)")
	public void stringArgumentMethod()
	{
		System.out.println("A method that takea String as argument");
	}
 */	
	

	
	
	
	
/*	
	//If you want to know the value of that parameter
	//try @Before @After see the difference
	//if while executing setter we get exception then this will not execute 
	
	@AfterReturning("args(name)")
	public void stringArgumentMethod(String name)
	{
		System.out.println("A method that takea String as argument. which is " + name );
	}
	
	
	//this will be call if method generates exception
	//to get the object of exception
	
	@AfterThrowing(pointcut = "args(String)" , throwing = "ex")
	public void exceptionAdvice(RuntimeException ex)
	{
		System.out.println("Exeption Advice called");
		System.out.println("An exception has been thrown : " + ex);
	}
*/
	
	
	
	
	
/*	

	//if tou want returning object of the method then
	
	@AfterReturning(pointcut = "args(name)" , returning = "returnString")
	
	//Object class catches all the return type that is why 
	public void stringArgumentMethod(String name , Object returnString)
	{
		System.out.println("output of the setAndReturnName method is " + returnString );
	}
*/	
	
	
	
	
	
	
	
	
	
	
}
