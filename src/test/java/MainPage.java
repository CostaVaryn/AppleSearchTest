import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Главная страничка сайта Appleinsider.ru
 */

public class MainPage {
    private final SelenideElement textBoxInput = $x("//input[@type='text']");

    public MainPage(String url){
        Selenide.open(url);
    }

    /**
     * Выполняется поиск на сайте среди статей и нажимается кнопка ENTER
     * @param searchString поисковая строка
     * было при обращении к другим классам
     * public void search(String searchString){
     * textBoxInput.setValue(searchString);
     * textBoxInput.sendKeys(Keys.ENTER);
     */
    
    public SearchPage search(String searchString){
        textBoxInput.setValue(searchString);
        textBoxInput.sendKeys(Keys.ENTER);
        return new SearchPage();
    }
}
