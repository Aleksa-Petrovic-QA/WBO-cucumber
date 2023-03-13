package wbo
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class GridViews {

	@Given("User navigates to the private board")
	def navigateToPrivateBoard() {
		WebUI.callTestCase(findTestCase('WBO/Actions/Navigate to private board'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User changes the pen color")
	def changePenColor() {
		WebUI.callTestCase(findTestCase('WBO/Actions/Change pen color'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("Clicks on the grid icon")
	def clickGridIcon1() {
		WebUI.click(findTestObject('Sidebar menu/Grid icon'))
	}

	@Then("The line view is displayed")
	def lineViewIsDisplayed() {
		WebUI.takeScreenshotAsCheckpoint('lineView', [])
	}

	@When("Changes grid view to dots view")
	def clickGridIcon2() {
		WebUI.click(findTestObject('Sidebar menu/Grid icon'))
	}

	@Then("The dots view is displayed")
	def dotsViewIsDisplayed() {
		WebUI.takeScreenshotAsCheckpoint('dotsView', [])
	}

	@When("Changes grid view to default")
	def clickGridIcon3() {
		WebUI.click(findTestObject('Sidebar menu/Grid icon'))
	}

	@Then("Default view is displayed")
	def defaultViewIsDisplayed() {
		WebUI.takeScreenshotAsCheckpoint('defaultView', [])
	}
}