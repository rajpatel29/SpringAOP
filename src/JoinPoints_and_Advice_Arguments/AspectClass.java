package JoinPoints_and_Advice_Arguments;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import Shapes.Circle;

@Aspect
public class AspectClass 
{
	@Before("allCircleMethod()")
	public void logginAdvice(JoinPoint jointPoint)
	{
		System.out.println("Advice run :)");
		
		//get the name of the method for which this aspect method run
		System.out.println(jointPoint.toString());
		
		//get the object whose method was called
		Circle circle = (Circle) jointPoint.getTarget();
		
		System.out.println("In logginAdvice method : " + circle.getName()); 
		
	}
	
	@Pointcut("within(Shapes.Circle)")
	public void allCircleMethod()
	{}
	
/*	
	@Before("args(String)")
	public void stringArgumentMethod()
	{
		System.out.println("A method that takea String as argument");
	}
*/	
	
	//If you want to know the value of that parameter
	@Before("args(name)")
	public void stringArgumentMethod(String name)
	{
		System.out.println("A method that takea String as argument. which is " + name );
	}
	
}
