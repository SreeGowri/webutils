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
package com.yukthi.webutils.common.models;

import java.util.Set;

import com.yukthi.webutils.common.HttpMethod;

/**
 * Represents server action details that can be invoked from client
 * @author akiran
 */
public class ActionModel
{
	/**
	 * Name of the action
	 */
	private String name;
	
	/**
	 * Corresponding url of the action
	 */
	private String url;
	
	/**
	 * HTTP method of the action - GET, POST
	 */
	private HttpMethod method;
	
	/**
	 * Flag indicating if the request is expected as a body
	 */
	private boolean bodyExpected;
	
	/**
	 * List of expected request parameters
	 */
	private String requestParameters[];
	
	/**
	 * List of url parameters
	 */
	private String urlParameters[];
	
	/**
	 * attachments expected by the current action
	 */
	private boolean attachmentsExpected;
	
	/**
	 * List of file fields expected in this action
	 */
	private Set<String> fileFields;
	
	/**
	 * Instantiates a new action model.
	 */
	public ActionModel()
	{}
	
	/**
	 * Instantiates a new action model.
	 *
	 * @param name the name
	 * @param url the url
	 * @param method the method
	 * @param bodyExpected is request expected as body
	 * @param requestParameters List of expected request parameters
	 * @param urlParameters List of expected url parameters
	 * @param attachmentsExpected Attachments are expected with this action
	 */
	public ActionModel(String name, String url, HttpMethod method, boolean bodyExpected, String requestParameters[], String urlParameters[], boolean attachmentsExpected, Set<String> fileFields)
	{
		this.name = name;
		this.url = url;
		this.method = method;
		this.bodyExpected = bodyExpected;
		this.requestParameters = requestParameters;
		this.urlParameters = urlParameters;
		this.attachmentsExpected = attachmentsExpected;
		this.fileFields = fileFields;
	}
	
	/**
	 * Gets the name of the action.
	 *
	 * @return the name of the action
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the name of the action.
	 *
	 * @param name the new name of the action
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * Gets the corresponding url of the action.
	 *
	 * @return the corresponding url of the action
	 */
	public String getUrl()
	{
		return url;
	}

	/**
	 * Sets the corresponding url of the action.
	 *
	 * @param url the new corresponding url of the action
	 */
	public void setUrl(String url)
	{
		this.url = url;
	}

	/**
	 * Gets the hTTP method of the action - GET, POST.
	 *
	 * @return the hTTP method of the action - GET, POST
	 */
	public HttpMethod getMethod()
	{
		return method;
	}

	/**
	 * Sets the hTTP method of the action - GET, POST.
	 *
	 * @param method the new hTTP method of the action - GET, POST
	 */
	public void setMethod(HttpMethod method)
	{
		this.method = method;
	}

	/**
	 * Checks if is flag indicating if the request is expected as a body.
	 *
	 * @return the flag indicating if the request is expected as a body
	 */
	public boolean isBodyExpected()
	{
		return bodyExpected;
	}

	/**
	 * Sets the flag indicating if the request is expected as a body.
	 *
	 * @param bodyExpected the new flag indicating if the request is expected as a body
	 */
	public void setBodyExpected(boolean bodyExpected)
	{
		this.bodyExpected = bodyExpected;
	}

	/**
	 * Gets the list of expected request parameters.
	 *
	 * @return the list of expected request parameters
	 */
	public String[] getRequestParameters()
	{
		return requestParameters;
	}

	/**
	 * Sets the list of expected request parameters.
	 *
	 * @param requestParameters the new list of expected request parameters
	 */
	public void setRequestParameters(String[] requestParameters)
	{
		this.requestParameters = requestParameters;
	}

	/**
	 * Gets the list of url parameters.
	 *
	 * @return the list of url parameters
	 */
	public String[] getUrlParameters()
	{
		return urlParameters;
	}

	/**
	 * Sets the list of url parameters.
	 *
	 * @param urlParameters the new list of url parameters
	 */
	public void setUrlParameters(String[] urlParameters)
	{
		this.urlParameters = urlParameters;
	}

	/**
	 * Checks if is attachments expected by the current action.
	 *
	 * @return the attachments expected by the current action
	 */
	public boolean isAttachmentsExpected()
	{
		return attachmentsExpected;
	}

	/**
	 * Sets the attachments expected by the current action.
	 *
	 * @param attachmentsExpected the new attachments expected by the current action
	 */
	public void setAttachmentsExpected(boolean attachmentsExpected)
	{
		this.attachmentsExpected = attachmentsExpected;
	}

	/**
	 * Gets the list of file fields expected in this action.
	 *
	 * @return the list of file fields expected in this action
	 */
	public Set<String> getFileFields()
	{
		return fileFields;
	}

	/**
	 * Sets the list of file fields expected in this action.
	 *
	 * @param fileFields the new list of file fields expected in this action
	 */
	public void setFileFields(Set<String> fileFields)
	{
		this.fileFields = fileFields;
	}
	
	
}
