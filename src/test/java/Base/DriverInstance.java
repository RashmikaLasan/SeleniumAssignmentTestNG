package Base;

import TestCasePages.*;
import Utility.Utility;
import java.io.IOException;

public class DriverInstance {
    public static void main(String[] args) throws InterruptedException, IOException {
//
        Utility ut = new Utility();
        ut.initialDriverInstance();

        HomePage hb = new HomePage();
        hb.ClickMainDrop();
        hb.BookNameEnter("harry potter books");

        SearchResultPage srp = new SearchResultPage();
        CheckOutPage CHK = srp.BookSelect();

//        CheckOutPage CHK = new CheckOutPage();
        CHK.HardCover();
        CHK.TitleDetails();
        CHK.TitleLength();
        ShoppingCartPage1 Cart1 = CHK.AddToCartClick();

//        ShoppingCartPage1 Cart1 = new ShoppingCartPage1();
        Cart1.CartPage1();
        Cart1.CartPage11();
        Cart1.CartIconClick();

        ShoppingCartPage2 Cart2 = new ShoppingCartPage2();
        Cart2.CartPage2();
        Cart2.Quantity();
        Cart2.TotalAssertion();

        LoginPage Log = new LoginPage();
        Log.LoginUser("Lasan","lasanr@codegen.net","lasan@123");


    }

}
