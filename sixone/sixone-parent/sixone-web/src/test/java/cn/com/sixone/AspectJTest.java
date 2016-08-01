package cn.com.sixone;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class AspectJTest {
	   @Pointcut("execution (* cn.com.sixone.*Impl.*(..))")  
	    public void pointcut(){}  
	      
	    //方法执行前调用  
	    @Before("pointcut()")  
	    public void before() {  
	        System.out.println("before");  
	    }  
	      
	    //方法执行的前后调用  
	  /*  @Around("pointcut()")  
	    public Object around(ProceedingJoinPoint point) throws Throwable{  
	        System.out.println("begin around");  
	        Object object = point.proceed();  
	        System.out.println("end around");  
	        return object;  
	    }  */
}
