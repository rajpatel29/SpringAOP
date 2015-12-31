import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPMain 
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		
		//so here we do not have to cas it to ShapeService.
		ShapeService obj = context.getBean("shapeService" , ShapeService.class);
		
		System.out.println(obj.getCircle().getName());
		
		System.out.println("===============================");
		
		System.out.println(obj.getTriangle().getName());
	}
}
