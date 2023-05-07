package steps;

import cucumber.api.java.es.Dado;
import pages.HomePage;
import runner.RunCucumberTest;

public class LoginSteps extends RunCucumberTest{

    HomePage homepage = new HomePage(driver);

    @Dado("^que estou na tela de login$")
    public void que_estou_na_tela_de_login() throws InterruptedException {
        homepage.acessar_site();
    }
}
