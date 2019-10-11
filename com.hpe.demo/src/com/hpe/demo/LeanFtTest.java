package com.hpe.demo;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.*;

import com.hp.lft.sdk.*;
import com.hp.lft.sdk.web.*;
import com.hp.lft.verifications.*;

import unittesting.*;

@ExtendWith(UnitTestClassBase.class)
public class LeanFtTest {

    public LeanFtTest() {
        //Change this constructor to private if you supply your own public constructor
    }

    @BeforeAll
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterAll
    public static void tearDownAfterClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    @Test
    public void BuyTabletTest() throws GeneralLeanFtException {
    	
    	Browser browser = BrowserFactory.launch(BrowserType.CHROME);
    	browser.navigate("http://www.advantageonlineshopping.com/#/");
    	
    	browser.describe(WebElement.class, new WebElementDescription.Builder()
    			.accessibilityName("")
    			.className("shop_nowSub roboto-regular ng-scope")
    			.index(1)
    			.innerText("Shop Now")
    			.tagName("LABEL").build()).click();
    	
    	browser.describe(Button.class, new ButtonDescription.Builder()
    			.buttonType("submit")
    			.name("BUY NOW")
    			.tagName("BUTTON").build()).click();
    	
    	browser.describe(Button.class, new ButtonDescription.Builder()
    			.buttonType("submit")
    			.name("ADD TO CART")
    			.tagName("BUTTON").build()).click();
    	
    	browser.describe(Button.class, new ButtonDescription.Builder()
    			.buttonType("submit")
    			.name("CHECKOUT  ($1,009.00)")
    			.tagName("BUTTON").build()).click();
    	
    }
//echo
}