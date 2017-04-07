 /*
  * @(#)TrainDataBuilderFactory.java   
  *
  * Copyright (C) 2005-17 www.interpss.org
  *
  * This program is free software; you can redistribute it and/or
  * modify it under the terms of the GNU LESSER GENERAL PUBLIC LICENSE
  * as published by the Free Software Foundation; either version 2.1
  * of the License, or (at your option) any later version.
  *
  * This program is distributed in the hope that it will be useful,
  * but WITHOUT ANY WARRANTY; without even the implied warranty of
  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  * GNU General Public License for more details.
  *
  * @Author Mike Zhou
  * @Version 1.0
  * @Date 04/7/2017
  * 
  *   Revision History
  *   ================
  *
  */

package org.interpss.service.train;

import org.interpss.service.train.impl.IEEECDFTrainCaseBuilder;

import com.interpss.core.aclf.AclfNetwork;

/**
 * Training data builder factory
 * 
 * @author Mike
 *
 */
public class TrainDataBuilderFactory {
	/**
	 * create a training data builder object
	 * 
	 * @param aclfNet AclfNetwork object
	 * @return the builder object
	 */
	public static ITrainCaseBuilder createITrainCaseBuilder(AclfNetwork aclfNet) {
		return new IEEECDFTrainCaseBuilder(aclfNet);
	}
}
 