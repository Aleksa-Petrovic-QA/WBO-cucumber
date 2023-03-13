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



class MoveDrawing {
	
	@When("Draw a line")
	def drawSpecificLine() {
		WebUI.click(findTestObject('Sidebar menu/Straight line icon'))

		WebUI.dragAndDropByOffset(findTestObject('Canvas/Whiteboard'), -80, -80)
	}

	@When("Moves drawing with selector")
	def movesWithSelector() {
		WebUI.click(findTestObject('Sidebar menu/Hand icon'))

		WebUI.click(findTestObject('Sidebar menu/Hand icon'))

		WebUI.dragAndDropByOffset(findTestObject('Canvas/Whiteboard'), -50, -130)
	}

	@And("Verify drawing moved by selector")
	def verifyDrawingMovedBySelector() {
		WebUI.takeScreenshotAsCheckpoint('movedDrawingBySelector', [])
	}
	
	@When("Select the drawing")
	def selectLine() {
		WebUI.dragAndDropByOffset(findTestObject('Canvas/Whiteboard'), -140, -230)
	}
	
	@And("Verify drawing selected")
	def verifyDrawingSelected() {
		WebUI.takeScreenshotAsCheckpoint('selectedDrawing', [])
	}

	@When("Expand the drawing")
	def selectDrawing() {
		WebUI.dragAndDropByOffset(findTestObject('Canvas/Whiteboard'), 200, 200)
	}
	
	@And("Verify drawing expanded")
	def verifyDrawingExpanded() {
		WebUI.takeScreenshotAsCheckpoint('expandedDrawing', [])
	}
	
	@When("Moves drawing by hand")
	def moveWithSelector() {
		WebUI.click(findTestObject('Sidebar menu/Hand icon'))

		WebUI.dragAndDropByOffset(findTestObject('Canvas/Whiteboard'), 20, -240)
	}
		
	@Then("Verify drawing moved by hand")
	def verifyDrawingMovedByHand() {
		WebUI.takeScreenshotAsCheckpoint('movedDrawing', [])
	}
}