/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.pluto.thymeleaf.mvc.portlet.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.portlet.PortletConfig;
import javax.portlet.PortletContext;

import org.apache.pluto.thymeleaf.portlet.VariableValidator;


/**
 * This class is a CDI producer that provides the ability to generate an instance of {@link VariableValidator}.
 *
 * @author  Neil Griffin
 */
@ApplicationScoped
public class VariableValidatorProducer {

	@Produces
	@ApplicationScoped
	public VariableValidator getVariableValidator(PortletConfig portletConfig, PortletContext portletContext) {

		boolean includeStandardBeans = false;

		String initParameter = portletConfig.getInitParameter(VariableValidator.INCLUDE_STANDARD_BEANS);

		if (initParameter != null) {
			includeStandardBeans = Boolean.valueOf(initParameter.toString());
		}

		initParameter = portletContext.getInitParameter(VariableValidator.INCLUDE_STANDARD_BEANS);

		if (initParameter != null) {
			includeStandardBeans = Boolean.valueOf(initParameter.toString());
		}

		return new CDIVariableValidator(includeStandardBeans);
	}
}
