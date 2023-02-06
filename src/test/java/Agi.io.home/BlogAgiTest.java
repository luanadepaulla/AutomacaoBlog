package Agi.io.home;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Agi.io.home.BasePage;
import static Agi.io.constantes.variaveis.*;
import static com.codeborne.selenide.Selenide.clearBrowserCookies;
import static com.codeborne.selenide.Selenide.open;

public class BlogAgiTest {

    private BasePage BasePage = new BasePage();


    @Test
    public void AcessaUrl() {
        clearBrowserCookies();
        open(AMBIENTE_TESTE);
    }

    @Test
    public void ValidaPesquisaBlog() throws InterruptedException {
        BasePage.ClicarBotaoLupa();
        BasePage.ClicarCampoPesquisa();
        BasePage.PreencheCampoPesquisa(PESQUISA_VALIDA);
        BasePage.ClicarBotaoPesquisar();
        Thread.sleep(1000);
        Assert.assertEquals(PESQUISA_VALIDA, BasePage.validaRetornoPrimeiraPesquisa());
    }

    @Test
    public void ValidaPesquisaInvalidaBlog() throws InterruptedException {
        BasePage.ClicarBotaoLupa();
        BasePage.ClicarCampoPesquisa();
        BasePage.LimparCampoPesquisar();
        BasePage.PreencheCampoPesquisa(PESQUISA_INVALIDA);
        Thread.sleep(1000);
    }


}




