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

Mobile.startApplication('/Users/vb/Desktop/WorkFolder/littlefish_pos_ui/build/app/outputs/apk/lfLfposDev/debug/app-lf-lfpos-dev-debug.apk', 
    true)

Mobile.tap(findTestObject('User Profile Switching/User Details/android.widget.Button (4)'), 0)

Mobile.setText(findTestObject('User Profile Switching/User Details/android.widget.EditText'), 'sealegeneral@gmail.com', 
    0)

Mobile.tap(findTestObject('User Profile Switching/User Details/android.widget.Button (5)'), 0)

Mobile.setText(findTestObject('User Profile Switching/User Details/android.widget.EditText (3)'), 'Password123!', 
    0)

Mobile.tap(findTestObject('User Profile Switching/User Details/android.widget.Button (6)'), 0)

Mobile.tap(findTestObject('User Profile Switching/User Details/android.view.View (4)'), 0)

Mobile.tap(findTestObject('User Profile Switching/User Details/android.view.View(user details)'), 0)

Mobile.startApplication('/Users/vb/Desktop/WorkFolder/littlefish_pos_ui/build/app/outputs/apk/lfLfposDev/debug/app-lf-lfpos-dev-debug.apk', 
    true)

Mobile.tap(findTestObject('User Profile Switching/User Details/android.view.View(user details)'), 0)

Mobile.closeApplication()

