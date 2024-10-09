import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.delay(5)

'Tap on Reports'
Mobile.tap(findTestObject('Home Actions and tab/HomeOBJ/android.view.View(Reports)'), 0)

Mobile.delay(5)

'Tap on Profit and Loss'
Mobile.tap(findTestObject('Home Actions and tab/HomeOBJ/android.view.View(ProfitAndLoss)'), 0)

Mobile.delay(5)

'Tap on 3M'
Mobile.tap(findTestObject('Home Actions and tab/HomeOBJ/android.view.View(3M)'), 0)

Mobile.delay(5)

Mobile.scrollToText('Scales By Payment Type')

Mobile.delay(5)

'Tap on Cash'
Mobile.tap(findTestObject('Home Actions and tab/HomeOBJ/android.view.View(CaashType)'), 0)

Mobile.delay(3)

'Tap on Cash'
Mobile.tap(findTestObject('Home Actions and tab/HomeOBJ/android.view.View(CaashType)'), 0)

'back to close the keyboard'
Mobile.pressBack()

'5s Delay'
Mobile.delay(5)