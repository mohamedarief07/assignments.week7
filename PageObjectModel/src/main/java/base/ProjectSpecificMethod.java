package base;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;


public class ProjectSpecificMethod {
	public RemoteWebDriver driver;
	public String excelFilePath;
	@Parameters({"URL","Broweser-Name"})
	@BeforeMethod
	public void BeforeMethods(String url, String browser)
	{
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@DataProvider (name ="TC001")
	public String[][] testdata() throws IOException {
		
		String[][] data= ReadExcel.getData(excelFilePath);
				
		return data;
	}
		
	@DataProvider (name ="TC002")
	public String[][] testdataEdit() throws IOException {
			
	String[][] data= ReadExcel.getData(excelFilePath);
					
	return data;
				
	}
	
	@DataProvider (name ="TC003")
	public String[][] testdataDuplicate() throws IOException {
			
	String[][] data= ReadExcel.getData(excelFilePath);
					
	return data;
				
	}
	
	@DataProvider (name ="TC004")
	public String[][] testdataMerge() throws IOException {
			
	String[][] data= ReadExcel.getData(excelFilePath);
					
	return data;
				
	}	
	
	@DataProvider (name ="TC005")
	public String[][] testdataDelete() throws IOException {
			
	String[][] data= ReadExcel.getData(excelFilePath);
					
	return data;
				
	}	
	
	  @AfterMethod
	  public void AfterMethods() 
	  { 
		  driver.close(); 
		  }
	 
	
	
}