/*  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */


package org.apache.pluto.container.om.portlet.impl.fixtures;

import javax.portlet.ActionURL;
import javax.portlet.PortletURLGenerationListener;
import javax.portlet.RenderURL;
import javax.portlet.ResourceURL;
import javax.portlet.annotations.PortletConfiguration;
import javax.portlet.annotations.PortletConfigurations;
import javax.portlet.annotations.PortletListener;

/**
 * Test Listener annotation  
 *
 */
@PortletConfigurations({
   @PortletConfiguration(portletName = "portlet1"),
   @PortletConfiguration(portletName = "portlet2"),
   @PortletConfiguration(portletName = "portlet3")
})
@PortletListener(ordinal = 100, listenerName = "aListener")
public class MultipleAnnotatedListeners1 implements PortletURLGenerationListener<RenderURL, ActionURL> {

   @Override
   public void filterActionURL(ActionURL arg0) {
   }

   @Override
   public void filterRenderURL(RenderURL arg0) {
   }

   @Override
   public void filterResourceURL(ResourceURL arg0) {
   }

}
