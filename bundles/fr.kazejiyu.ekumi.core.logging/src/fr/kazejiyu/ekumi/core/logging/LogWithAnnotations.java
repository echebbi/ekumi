package fr.kazejiyu.ekumi.core.logging;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogWithAnnotations {
	
	@Pointcut("execution(* fr.kazejiyu.ekumi.EKumiPlugin.greet())")
	void greet() {}
	
	@Before("greet()")
	public void sayHi() {
		System.out.println("Hi!");
	}

	@Pointcut("execution(* fr.kazejiyu.ekumi.core.execution.BasicExecution.start(..))")
	void executionStart() {}
	
	@Before("executionStart()")
	public void sayYes() {
		System.out.println("Execution started !");
	}
}
