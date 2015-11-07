/*
 * The MIT License (MIT)
 * Copyright (c) 2015 "Yukthi Techsoft Pvt. Ltd." (http://yukthi-tech.co.in)

 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.test.yukthi.webutils.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.yukthi.webutils.Authorization;
import com.test.yukthi.webutils.SecurityRole;
import com.test.yukthi.webutils.models.TestBean;
import com.yukthi.webutils.annotations.ActionName;
import com.yukthi.webutils.common.models.BaseResponse;
import com.yukthi.webutils.controllers.BaseController;

/**
 * Test controller to test spring validation enablement
 * @author akiran
 */
@RestController
@RequestMapping("/test")
@ActionName("test")
public class TestController extends BaseController
{
	/**
	 * Simple test control method which is used by client test cases to 
	 * check for spring validation enabling.
	 * @param testBean
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/test")
	@ActionName("test")
	public BaseResponse test(@Valid @RequestBody TestBean testBean)
	{
		return new BaseResponse(0, "Sucess - " + testBean.getName());
	}
	
	@ResponseBody
	@RequestMapping("/secured1")
	@ActionName("secured1")
	@Authorization(SecurityRole.PROJ_ADMIN)
	public BaseResponse secured1(@Valid @RequestBody TestBean testBean)
	{
		return new BaseResponse(0, "Sucess - " + testBean.getName());
	}

	@ResponseBody
	@RequestMapping("/secured2")
	@ActionName("secured2")
	@Authorization({SecurityRole.PROJ_ADMIN, SecurityRole.CLIENT_ADMIN})
	public BaseResponse secured2(@Valid @RequestBody TestBean testBean)
	{
		return new BaseResponse(0, "Sucess - " + testBean.getName());
	}
}
