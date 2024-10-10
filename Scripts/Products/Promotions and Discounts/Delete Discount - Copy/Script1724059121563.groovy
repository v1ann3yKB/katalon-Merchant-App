import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

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

Mobile.startApplication('/Users/vb/Desktop/WorkFolder/littlefish_pos_ui/build/app/outputs/apk/lfLfposDev/debug/app-lf-lfpos-dev-debug.apk', true)

Mobile.delay(2)

'Tap on the login button from first screen '
Mobile.tap(findTestObject('Stock/android.widget.Button'), 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Stock/android.widget.EditText (1)'), 0)

Mobile.setText(findTestObject('Products/New fix/android.widget.EditText'), 'demo@littlefishapp.com', 0)

Mobile.delay(3)

Mobile.tap(findTestObject('Stock/android.widget.EditText(Password)'), 0)

Mobile.setText(findTestObject('Stock/android.widget.EditText(Password)'), 'Password123!', 0)

Mobile.delay(3)

'Tap on login'
Mobile.tap(findTestObject('Stock/android.widget.Button(Login)'), 0)

Mobile.delay(15)

'Tap on profile switching icon'
Mobile.tap(findTestObject('Products/New fix/android.widget.ImageView(PFLsw)'), 0)

Mobile.delay(5)

'Tap on manage workSpace'
Mobile.tap(findTestObject('Stock/StockPageOBJ/android.view.View(ManageWorkSpace)'), 0)

Mobile.delay(5)

'Tap on Products'
Mobile.tap(findTestObject('Products/Products Main Page/android.view.View(ManageProductsSection)'), 0)

Mobile.delay(5)

//'Get Device Height and Store in device_height variable'
//device_Height = Mobile.getDeviceHeight()
//
//'Get Device Width and Store in device_Width variable'
//device_Width = Mobile.getDeviceWidth()
//
//'Storing the startX,endX values by dividing device height by 2 Because Y coordinates are constant'
//int startY = device_Height / 2
//
//'Here endY and startY values are equal for vertical Swiping for that assigning startY value to endY'
//int endY = startY
//
//'Storing the startX value'
//int startX = device_Width * 0.30
//
//'Storing the endX value'
//int endX = device_Width * 0.70
//
//'Here Y constant for Swipe Vertical Left to Right'
//
//Mobile.swipe(startX, startY, endX, endY)

// Locate the element
TestObject yourElement = findTestObject('Products/Products Main Page/Products/android.view.View(ProductFirstItem)')

Mobile.delay(5)

// Get the element's position (top-left corner coordinates)
int elementTopLeftX = Mobile.getElementLeftPosition(yourElement, 0)
int elementTopLeftY = Mobile.getElementTopPosition(yourElement, 0)

Mobile.delay(5)

// Get the element's width and height
int elementWidth = Mobile.getElementWidth(yourElement, 0)
int elementHeight = Mobile.getElementHeight(yourElement, 0)

Mobile.delay(5)

// Calculate start and end X coordinates for swiping right to left
// Start near the right side of the element
int startX = elementTopLeftX + (elementWidth * 0.80)  
// End near the left side of the element
int endX = elementTopLeftX + (elementWidth * 0.20)    

Mobile.delay(5)

// Calculate the Y coordinate (middle of the element)
int startY = elementTopLeftY + (elementHeight / 2)
// Y remains constant as swipe is horizontal
int endY = startY  

Mobile.delay(5)

// Perform swipe from right to left on the specific element
Mobile.swipe(startX, startY, endX, endY)

Mobile.delay(5)

'Tap on First Products'
//Mobile.tap(findTestObject('Products/Products Main Page/Products/android.view.View(ProductFirstItem)'), 0)
//
//Mobile.waitForElementPresent('Products/Products Main Page/Products/android.view.View(ProductFirstItem)', 0)
//
//Mobile.delay(5)
//
//Mobile.checkElement(findTestObject('Products/Products Main Page/Products/android.view.View(ProductFirstItem)'), 0)
//
//Mobile.delay(5)


//"Wait for Element Present of checkbox Don't Show this message again.\\r\\nif element present return true otherwise false."
// 
//alert_Status = Mobile.waitForElementPresent(findTestObject('Swipe ListView Demos/checkbox_Dont show this message again'),
// 
//20)
//
//'checking the if statement based on element present of alert check box'
//if (alert_Status == true) {
//
//'Tap on check box'
//Mobile.tap(findTestObject('Swipe ListView Demos/checkbox_Dont show this message again'), 30)
//
//'Tap on Ok'
//Mobile.tap(findTestObject('Swipe ListView Demos/button_Ok'), 30)
//}
//
//'Wait for element Present of Heading API Demos'
//Mobile.waitForElementPresent(findTestObject('Swipe ListView Demos/header_text SwipeListView Demo'), 45)
// 

