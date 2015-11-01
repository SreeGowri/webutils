package com.test.yukthi.webutils.models;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.yukthi.validation.annotations.MatchWith;
import com.yukthi.validation.annotations.NotEmpty;
import com.yukthi.webutils.common.LovType;
import com.yukthi.webutils.common.annotations.LOV;
import com.yukthi.webutils.common.annotations.Label;
import com.yukthi.webutils.common.annotations.Model;

/**
 * Test bean used by client test cases to ensure spring validation is enabled
 */
@Model(name = "TestModel")
public class TestBean
{
	@NotEmpty
	private String name;

	@Min(18)
	@Max(30)
	private Integer age;

	@Label("PASS")
	@NotEmpty
	private String password;

	@NotEmpty
	@MatchWith(field = "password")
	private String confirmPassword;

	private LovType lovType;

	@LOV(name = "employeeLov")
	private String empName;

	/**
	 * Instantiates a new test bean.
	 */
	public TestBean()
	{}

	/**
	 * Instantiates a new test bean.
	 *
	 * @param name
	 *            the name
	 */
	public TestBean(String name, int age, String password, String confirmPassword)
	{
		this.name = name;
		this.age = age;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name
	 *            the new name
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	public Integer getAge()
	{
		return age;
	}

	public void setAge(Integer age)
	{
		this.age = age;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getConfirmPassword()
	{
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword)
	{
		this.confirmPassword = confirmPassword;
	}

	public LovType getLovType()
	{
		return lovType;
	}

	public void setLovType(LovType lovType)
	{
		this.lovType = lovType;
	}

	public String getEmpName()
	{
		return empName;
	}

	public void setEmpName(String empName)
	{
		this.empName = empName;
	}

}
