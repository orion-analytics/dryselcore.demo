/*
 * Copyright (c) Orchestral Developments Ltd and the Orion Health group of companies (2001 - 2017).
 * Author: Kuldeep Sinh Chauhan (@KuldeepSinhC)
 * emails: kuldeeps@orionhealth.com, chauhan.kuldeep.sinh@gmail.com
 *
 * This file is provided to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an  "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,  either express or implied.  See the License for the specific language governing    
 * permissions and limitations under the License.
 */
package com.orchestral.automation.dryselcore.demo.stepdefs;

import com.orchestral.automation.dryselcore.TestScriptExecutor;
import com.orchestral.automation.dryseltools.SeleniumDriverFactory;

import cucumber.api.java.After;

public class StepDefHelper {

	private final TestScriptExecutor testExecutor;

	public StepDefHelper() {
		this.testExecutor = new TestScriptExecutor(SeleniumDriverFactory.getWebDriver());
	}

	public TestScriptExecutor getTestExecutor() {
		return this.testExecutor;
	}

	@After
	public void teardownWebDriver() {
		SeleniumDriverFactory.tearDown();
	}
}
