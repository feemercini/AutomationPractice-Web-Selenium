package steps;

import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Então;
import pages.HomePage;
import runner.RunCucumberTest;

public class CadastroSteps extends RunCucumberTest {

    HomePage homepage = new HomePage(driver);

    @Dado("^acesso o cadastro de usuário$")
    public void acesso_o_cadastro_de_usuário(){
        homepage.acessar_site();
    }

    @Quando("^eu preencho o formulário de cadastro$")
    public void eu_preencho_o_formulário_de_cadastro(){

    }

    @Quando("^clico em registrar$")
    public void clico_em_registrar(){

    }

    @Então("^vejo a mensagem de cadastro realizado com sucesso$")
    public void vejo_a_mensagem_de_cadastro_realizado_com_sucesso(){

    }
}
