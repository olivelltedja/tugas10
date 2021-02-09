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

Mobile.tap(findTestObject('Object Repository/masukkan_barang_ke_keranjang/android.widget.TextView - SKIP LOGIN'), 0)

Mobile.tap(findTestObject('Object Repository/masukkan_barang_ke_keranjang/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/masukkan_barang_ke_keranjang/android.widget.TextView - Goodthreads Mens SlimFit LongSleeve Plaid Poplin Shirt with ButtonDown Collar'), 
    0)

Mobile.tap(findTestObject('Object Repository/masukkan_barang_ke_keranjang/android.widget.RelativeLayout'), 0)

Mobile.tap(findTestObject('Object Repository/masukkan_barang_ke_keranjang/android.widget.Button - Login'), 0)

Mobile.setText(findTestObject('Object Repository/masukkan_barang_ke_keranjang/android.widget.EditText'), 'basuki76@gmail.com', 
    0)

Mobile.setText(findTestObject('Object Repository/masukkan_barang_ke_keranjang/android.widget.EditText (1)'), 'basukiyahut', 
    0)

Mobile.tap(findTestObject('Object Repository/masukkan_barang_ke_keranjang/android.widget.Button - SIGN IN'), 0)

Mobile.setText(findTestObject('Object Repository/masukkan_barang_ke_keranjang/android.widget.EditText (2)'), 'basuki76@gmail.com', 
    0)

Mobile.tap(findTestObject('Object Repository/masukkan_barang_ke_keranjang/android.widget.Button - RE-SEND EMAIL'), 0)

Mobile.closeApplication()

