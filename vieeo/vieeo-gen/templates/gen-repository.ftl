<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:context="http://www.springframework.org/schema/context"
	xmlns:aop="http://www.springframework.org/schema/aop"
	xmlns:tx="http://www.springframework.org/schema/tx"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
           http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
           http://www.springframework.org/schema/context
           http://www.springframework.org/schema/context/spring-context-3.0.xsd
           http://www.springframework.org/schema/tx
           http://www.springframework.org/schema/tx/spring-tx-3.0.xsd
		   http://www.springframework.org/schema/aop
		   http://www.springframework.org/schema/aop/spring-aop-3.0.xsd">

	<bean id="sysConfigurationRepository" class="com.vieeo.module.repository.hibernate.HibernateGenericRepository">
		<constructor-arg>
			<value>${className}</value>
		</constructor-arg>
		<property name="entityDao" ref="entityDao"/>
	</bean>
</beans>