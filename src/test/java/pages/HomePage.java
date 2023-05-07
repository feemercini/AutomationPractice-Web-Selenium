package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public void acessar_site() throws InterruptedException {
        driver.get("https://demo.automationtesting.in/Index.html");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        String texto_homepage = driver.findElement(By.id("btn1")).getText();
        Assert.assertEquals("Sign In", texto_homepage);
    }

    public void irParaCadastro(){
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("teste@gmail.com");
        driver.findElement(By.id("enterimg")).click();
    }
    public void preenchePrimeiroNome(){
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Fernando");
    }

    public void preencheUltimoNome(){
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Emercini");
    }

    public void preencheEndereco(){
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Rua Ali do Lado, 717");
    }

    public void preencheEmailAddress(){
        driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("teste@gmail.com");
    }

    public void preencheTelefone(){
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("1111111111");
    }

    public void preencheGeneroMasculino(){
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();
    }

    public void preencheGeneroFeminino(){
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")).click();
    }

    public void preencheHobbieCricket(){
        driver.findElement(By.id("checkbox1")).click();
    }
    public void preencheHobbieMovie(){
        driver.findElement(By.id("checkbox2")).click();
    }

    public void preencheHobbieHockey(){
        driver.findElement(By.id("checkbox3")).click();
    }

    public void preencheLanguageFrench(){
        driver.findElement(By.id("msdd")).click();
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[12]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"section\"]/div/div")).click();
    }

    public void preencheSkillsJava(){
        driver.findElement(By.id("Skills")).click();
        driver.findElement(By.xpath("//*[@id=\"Skills\"]/option[39]")).click();
    }

    public void preencheSelectCountryJapan(){
       driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
       driver.findElement(By.xpath("//*[@id=\"select2-country-results\"]/li[7]")).click();
    }

    public void preencheAno(){
        driver.findElement(By.id("yearbox")).click();
        driver.findElement(By.xpath("//*[@id=\"yearbox\"]/option[84]")).click();
    }

    public void preencheMes(){
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")).click();
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select/option[12]")).click();
    }

    public void preencheDia(){
        driver.findElement(By.id("daybox")).click();
        driver.findElement(By.xpath("//*[@id=\"daybox\"]/option[30]")).click();
    }

    public void preencheSenha(){
        driver.findElement(By.id("firstpassword")).sendKeys("senha123");
    }

    public void preencheConfirmarSenha(){
        driver.findElement(By.id("secondpassword")).sendKeys("senha123");
    }

    public void clicarBotaoSubmit(){
        driver.findElement(By.id("submitbtn")).click();
    }
}