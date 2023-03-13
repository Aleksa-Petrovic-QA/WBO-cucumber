package wbo
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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



class ZoomDrawing {

	@Given("User is on WBO home page")
	def navigateToHomePage() {
		WebUI.openBrowser('')

		WebUI.maximizeWindow()

		WebUI.navigateToUrl('https://wbo.ophir.dev/')
	}

	@And("Clicks zoom in icon")
	def clickZoom() {
		WebUI.click(findTestObject('Sidebar menu/Zoom in icon'))
	}
	
	@And("Zoom in page")
	def zoomIn() {
		WebUI.click(findTestObject('Canvas/Whiteboard'))
	}

	@Then("Verify page is zoomed in")
	def verifyPageIsZoomedIn() {
		WebUI.verifyElementAttributeValue(findTestObject('Canvas/Canvas_svg'), 'style', 'cursor: zoom-in; will-change: transform; transform: scale(1.5);',
				0)
	}

	@And("Zoom out page")
	def zoomOut() {
		WebUI.callTestCase(findTestCase('WBO/Actions/Zoom out'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Verify page is zoomed out")
	def verifyPageIsZoomedOut() {
		WebUI.takeScreenshotAsCheckpoint('zoomedOutPage', FailureHandling.STOP_ON_FAILURE)
	}
}