package com.nt.aspect;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.aspectj.lang.JoinPoint;

public class CommonExceptionLoggerAspect {

	private static Logger logger=Logger.getLogger(CommonExceptionLoggerAspect.class);
		static
		{
			try {
				   PropertyConfigurator.configure("src/main/java/com/nt/commons/log4j.properties");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		public void ExceptionLogger(JoinPoint jp, IllegalArgumentException ex)
		{
			
			logger.error(ex+"method with args "+jp.getSignature()+" method with args "+Arrays.toString(jp.getArgs()));
		}
		public void ExceptionLogger(JoinPoint jp, Exception ex, int x)
		{
			
			logger.error(ex+"method with args "+jp.getSignature()+" method with args "+Arrays.toString(jp.getArgs()));
		}
		public void ExceptionLogger(JoinPoint jp, Throwable ex, int x, int y)
		{
			
			logger.error(ex+"method with args "+jp.getSignature()+" method with args "+Arrays.toString(jp.getArgs()));
		}
}
