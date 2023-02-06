package Agi.io.home;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.commands.ScrollTo;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class BasePage {

    private SelenideElement BotaoLupa                = $(By.xpath("//*[@id='search-open']"));
    private SelenideElement CampoPesquisa            = $(By.xpath("//*[@id='masthead']/div[1]/div[2]/form/label/input"));
    private SelenideElement BotaoPesquisar           = $(By.xpath("//*[@id='masthead']/div[1]/div[2]/form/input"));
    private SelenideElement PrimeiraPesquisaRetorno  = $(By.xpath("//*[@id='primary']/header/h1/span"));
    private SelenideElement PesquisaInvalidaRetorno  = $(By.xpath("//*[@id='primary']/section/header/h1"));


    public BasePage ClicarBotaoLupa() {
        BotaoLupa.shouldBe(visible, Duration.ofSeconds(10));
        BotaoLupa.click();
        return page(BasePage.class);
    }

    public BasePage ClicarCampoPesquisa() {
        CampoPesquisa.shouldBe(visible, Duration.ofSeconds(10));
        return page(BasePage.class);
    }

    public BasePage PreencheCampoPesquisa(String PesquisaValida) {
        CampoPesquisa.shouldBe(visible, Duration.ofSeconds(10));
        CampoPesquisa.sendKeys(PesquisaValida);
        return page(BasePage.class);
    }

    public BasePage ClicarBotaoPesquisar() {
        BotaoPesquisar.shouldBe(visible, Duration.ofSeconds(10));
        BotaoPesquisar.click();
        return page(BasePage.class);
    }

    public String validaRetornoPrimeiraPesquisa() {
        PrimeiraPesquisaRetorno.shouldBe(visible, Duration.ofSeconds(10));
        String retornoPrimeiraPesquisa = PrimeiraPesquisaRetorno.getText();
        return retornoPrimeiraPesquisa;
    }

    public BasePage LimparCampoPesquisar(){
        CampoPesquisa.shouldBe(visible, Duration.ofSeconds(10));
        CampoPesquisa.clear();
        return page(BasePage.class);
    }


}
