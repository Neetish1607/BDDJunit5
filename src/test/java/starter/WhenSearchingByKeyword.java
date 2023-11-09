package starter;

import Actions.NavigateActions;
import Actions.SearchActions;
import Component.SearchResultSidebar;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;


@ExtendWith(SerenityJUnit5Extension.class)
public class WhenSearchingByKeyword{

    @Managed(driver = "chrome", options = "headless")
    WebDriver driver;

    NavigateActions navigate;
    SearchActions search;
    SearchResultSidebar searchResultSidebar;

    @Test
    void theKeywordShouldAppearInTheResultSidebar(){

        navigate.toTheDuckDuckGoSearchPage();
        search.byKeyword("Cucumber");
        assertThat(searchResultSidebar.heading()).isEqualTo("Cucumber");
        Serenity.reportThat("The keyword should appear in the sidebar Heading",
                () ->assertThat(searchResultSidebar.heading()).isEqualTo("Cucumber"));
    }
}
