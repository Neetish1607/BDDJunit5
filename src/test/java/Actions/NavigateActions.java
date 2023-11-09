package Actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class NavigateActions extends UIInteractions {

    @Step("Navigate to Home Page")
    public void toTheDuckDuckGoSearchPage(){
        openUrl("https://duckduckgo.com/");
    }
}
