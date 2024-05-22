<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:aop="http://www.springframework.org/schema/aop"
	xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
		http://www.springframework.org/schema/aop http://www.springframework.org/schema/aop/spring-aop-3.1.xsd">
		
	<bean name="logAop" class="com.spring1.aop.LogAop" />
	
	<aop:config>
		<aop:pointcut expression="execution(public * com.spring1.dao.*DAO*.*(..))" id="daoPoint"/>
		<aop:aspect id="logAop" ref="logAop">
			<aop:before method="before" pointcut-ref="daoPoint"/>
			<aop:after method="after" pointcut-ref="daoPoint"/>
			<aop:after-throwing method="afterThrowing" pointcut-ref="daoPoint"/>
		</aop:aspect>
	</aop:config>


</beans>