/*
 * Copyright 2008 The Apache Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.pluto.om.portlet;

import java.util.List;

import javax.xml.namespace.QName;

import org.apache.pluto.om.ElementFactoryList;
import org.apache.pluto.om.common.Description;

public interface PublicRenderParameter {

	ElementFactoryList<Description> getDescriptions();

	String getIdentifier();

	void setIdentifier(String id);

	QName getQName();

    void setQName(QName qname);

	List<QName> getAliases();
	
    String getName();
    
	void setName(String name);

	void setAliases(List<QName> aliases);
	
	String getId();
	
	void setId(String id);
}