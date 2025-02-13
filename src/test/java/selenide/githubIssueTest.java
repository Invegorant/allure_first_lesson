package selenide;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class githubIssueTest {

    @Test
    public void nameOfIssueTest(){
        open("https://github.com/");
        $("[data-test-selector='nav-search-input']").setValue("eroshenkoam/allure-example")
                                                              .pressEnter();
        $("[href*='eroshenkoam/allure-example']").click();
        $("#issues-tab").click();
        $$("[data-hovercard-type='issue']").findBy(text("с днем археолога")).shouldBe(visible);
    }
}
