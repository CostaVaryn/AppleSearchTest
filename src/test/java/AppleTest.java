import org.junit.Assert;
import org.junit.Test;

public class AppleTest extends BaseTest{

    private final static String BASE_URL = "https://appleinsider.ru/";
    private final static String SEARCH_STRING = "Чем iPhone 13 отличается от iPhone 12";
    private final static String EXPECTED_WORD = "iphone-12";

    @Test
    public void checkHref(){
        // сокращение до двух строк, жестко
        // Assert.assertTrue(new MainPage(BASE_URL).search(SEARCH_STRING).getHrefFromFirstArticle().contains("iphone-13"));

        // MainPage mainPage = new MainPage(BASE_URL);

        // mainPage.openWebSite(BASE_URL);

        // было при обращении к классу
        // mainPage.search(SEARCH_STRING);
        // SearchPage searchPage = new SearchPage();
        // String href = searchPage.getHrefFromFirstArticle();
        // сократили и видим что осталось

        //String href = mainPage.search(SEARCH_STRING).getHrefFromFirstArticle();

        // переменная href будет содержать ссылку
        // boolean contains = href.contains("iphone-13");
        // проверка что ссылка содердит слово iphone-13

        // Assert.assertTrue(new MainPage(BASE_URL).search(SEARCH_STRING).getHrefFromFirstArticle().contains("iphone-13"));
        /** Assert.assertTrue(new MainPage(BASE_URL)
                .search(SEARCH_STRING)
                .getHrefFromFirstArticle()
                .contains("iphone-13"));
         */
        Assert.assertTrue(new MainPage(BASE_URL)
                .search(SEARCH_STRING)
                .getHrefFromFirstArticle()
                .contains(EXPECTED_WORD));
    }
}
