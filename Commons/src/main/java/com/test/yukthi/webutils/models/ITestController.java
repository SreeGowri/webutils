package com.test.yukthi.webutils.models;

import com.yukthi.webutils.common.RemoteService;
import com.yukthi.webutils.common.models.BaseResponse;

@RemoteService
public interface ITestController
{

	/**
	 * Simple test control method which is used by client test cases to 
	 * check for spring validation enabling.
	 * @param testBean
	 * @return
	 */
	BaseResponse test(TestBean testBean);

	BaseResponse secured1(TestBean testBean);

	BaseResponse secured2(TestBean testBean);

	BaseResponse sendMail(TestMailModel model);

	BaseResponse sendMailByTemplate(TestMailBean model);

}