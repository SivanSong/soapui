/*
 *  soapUI, copyright (C) 2004-2010 eviware.com 
 *
 *  soapUI is free software; you can redistribute it and/or modify it under the 
 *  terms of version 2.1 of the GNU Lesser General Public License as published by 
 *  the Free Software Foundation.
 *
 *  soapUI is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without 
 *  even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
 *  See the GNU Lesser General Public License for more details at gnu.org.
 */

package com.eviware.soapui.security;

import com.eviware.soapui.model.propertyexpansion.DefaultPropertyExpansionContext;
import com.eviware.soapui.model.testsuite.TestCaseRunner;

/**
 * SecurityTestContext implementation for SecurityTests
 * 
 * @author soapUI team
 */

public class SecurityTestContext extends DefaultPropertyExpansionContext implements SecurityTestRunContext
{
	private final SecurityTestRunner runner;

	public SecurityTestContext( SecurityTestRunner runner )
	{
		super( runner.getSecurityTest().getTestCase() );
		this.runner = runner;
	}

	public SecurityTestRunner getSecurityTestRunner()
	{
		return runner;
	}

	@Override
	public Object get( Object key )
	{
		if( "securityTestRunner".equals( key ) )
			return runner;

		return super.get( key );
	}

	public Object getProperty( String testStep, String propertyName )
	{
		return null;
	}

	public TestCaseRunner getTestRunner()
	{
		return null;
	}
}
