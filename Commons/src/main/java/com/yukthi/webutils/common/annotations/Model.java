package com.yukthi.webutils.common.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.yukthi.validation.cross.EnableCrossValidation;

/**
 * Marks a java bean to be model. And also enables cross validation on the bean
 * @author akiran
 */
@EnableCrossValidation
@Constraint(validatedBy = {})
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Model
{
	/**
	 * To be ignored. Added as per constraints placed by javax validation framework
	 * @return
	 */
	String message() default "{com.yukthi.validation.beans.Model}";

	/**
	 * To be ignored. Added as per constraints placed by javax validation framework
	 * @return
	 */
    Class<?>[] groups() default {};

	/**
	 * To be ignored. Added as per constraints placed by javax validation framework
	 * @return
	 */
    Class<? extends Payload>[] payload() default {};

    /**
     * Name of the model. By default class name will be used.
     * @return Name of the model
     */
    public String name() default "";
}
