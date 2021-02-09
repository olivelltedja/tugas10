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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('C:\\Users\\Owner\\Downloads\\Ecommerce Store Demo_v1.4.apk', true)

Mobile.tap(findTestObject('Object Repository/Pendafataran_akun_ecommerce/android.widget.TextView - New here Sign Up'), 0)

Mobile.setText(findTestObject('Object Repository/Pendafataran_akun_ecommerce/android.widget.EditText'), 'Basuki', 0)

Mobile.setText(findTestObject('Object Repository/Pendafataran_akun_ecommerce/android.widget.EditText (1)'), 'basuki76@gmail.com', 
    0)

Mobile.setText(findTestObject('Object Repository/Pendafataran_akun_ecommerce/android.widget.EditText (2)'), 'basukiyahut', 
    0)

Mobile.setText(findTestObject('Object Repository/Pendafataran_akun_ecommerce/android.widget.EditText (3)'), 'basukiyahut', 
    0)

Mobile.tap(findTestObject('Object Repository/Pendafataran_akun_ecommerce/android.widget.Button - SIGN UP'), 0)

Mobile.tap(findTestObject('Object Repository/Pendafataran_akun_ecommerce/android.widget.TextView - Already have account Sign In'), 
    0)

Mobile.setText(findTestObject('Object Repository/Pendafataran_akun_ecommerce/android.widget.EditText (4)'), 'basuki76@gmail.com', 
    0)

Mobile.setText(findTestObject('Object Repository/Pendafataran_akun_ecommerce/android.widget.EditText (5)'), 'basukiyahut', 
    0)

Mobile.tap(findTestObject('Object Repository/Pendafataran_akun_ecommerce/android.widget.Button - SIGN IN'), 0)

Mobile.setText(findTestObject('Object Repository/Pendafataran_akun_ecommerce/android.widget.EditText (6)'), 'basuki76@gmail.com', 
    0)

Mobile.tap(findTestObject('Object Repository/Pendafataran_akun_ecommerce/android.widget.Button - RE-SEND EMAIL'), 0)

Mobile.closeApplication()

