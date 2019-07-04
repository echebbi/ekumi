/*******************************************************************************
 * Copyright (C) 2018-2019 Emmanuel CHEBBI
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 ******************************************************************************/
package fr.kazejiyu.ekumi.specs.eds.design.ui.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

@RunWith(OsgiCucumberRunner.class)
@CucumberOptions(
        strict = true, 
        monochrome = true, 
//        tags = "~@ignored", 
        plugin = { "pretty" }
)
@SuppressWarnings("squid:S2187") // Avoid Sonar's "Add some tests to this class" rule
public class EKumiEDSUiFeaturesTest {

}
