import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect 
{
/*	
 
 	//for all class
	@Before("execution(public String getName() )")
	public void logginAdvice()
	{
		System.out.println("Advice run. 1");
	}
	
	//For specific class(package)
	@Before("execution(public String Circle.getName() )")
	public void logginAdvice_2()
	{
		System.out.println("Advice run. 2");
	}
	
	//WildCard
	 
	@Before("execution(public * get*() )")
	public void logginAdvice_3()
	{
		System.out.println("Advice run. 3");
	}
	
	//public * get*()  it should not take any parameter
	//public * get*(*) aslong as there is an argument
	//public * get*(..) can be 0 argument or can be 1 or more
	//you can use wild card when you specify package 
	//if you dont specify Access modifier(public private etc) then it will apply for any access modifier
	
*/	
	
	//PointCut
	
	//If you need to run same aspect twice then
	@Before("allGetters()")
	public void logginAdvice_4()
	{
		System.out.println("Advice run. 4");
	}

	
	
	@Before("allGetters()")
	public void logginAdvice_5()
	{
		System.out.println("Advice run. 5");
	}
	
	@Pointcut("execution( * get*() )")
	public void allGetters() {}
	
	
}
