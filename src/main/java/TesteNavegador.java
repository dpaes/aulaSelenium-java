import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TesteNavegador {
    private WebDriver driver;

    @BeforeMethod
    public void iniciar(){
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Aluno\\Downloads\\chromedriver_win32\\chromedriver.exe");
    }

    @Test
    public void testarLoginInvalido(){

        // ABRE A PAGINA SEGUNDO O LINK DENTRO DO GET
        driver.get("https://demo.automationtesting.in/");

        //DIGITA NO CAMPO COLOCADO NO XPATH
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("daniel_3xd@hotmail.com");

        //CLICA NO CAMPO COLOCADO NO XPATH
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/span/a")).click();

        //DIGITA O PRIMEIRO NOME NO CAMPO FIRST NAME
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Daniel");

        //DIGITA O SOBRENOME NO CAMPO LASTLANE
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Paes");

        //DIGITA NO CAMPO ENDEREÇO O ENDEREÇO DIGITADO
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Rua Pioneiro Victorio Leonardi");

        //DIGITA O EMAIL NO CAMPO EMAIL
        driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("daniel_3xd@hotmail.com");

        //DIGITA O NUMERO NO CAMPO PHONE
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("1234567891");

        //CLICA NO GENDER MALE
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();

        //CLICA NO CHECKBOX MOVIES
        driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();

        //CLICA NO CAMPO LANGUAGES
        driver.findElement(By.xpath("//*[@id=\"msdd\"]")).click();
        //CLICA NA OPTION ENGLISH
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]/a")).click();
        //CLICA NA OPTION PORTUGUESE
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[29]/a")).click();

        //SELECIONA AS SKILLS Java
        driver.findElement(By.xpath("//*[@id=\"Skills\"]/option[39]")).click();

        //SELECIONA O SELECT COUNTRY USA
        driver.findElement(By.xpath("//*[@id=\"country\"]/option[11]")).click();

        //SELECIONA O ANO DA DATA DE NASCIMENTO
        driver.findElement(By.xpath("//*[@id=\"yearbox\"]/option[79]")).click();

        //SELECIONA O MÊS DA DATA DE NASCIMENTO
        driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select/option[10]")).click();

        //SELECIONA O DIA DA DATA DE NASCIMENTO
        driver.findElement(By.xpath("//*[@id=\"daybox\"]/option[18]")).click();

        driver.findElement(By.xpath("//*[@id=\"firstpassword\"]")).sendKeys("123456");

        driver.findElement(By.xpath("//*[@id=\"secondpassword\"]")).sendKeys("123456");

        WebElement importarArquivo = driver.findElement(By.xpath("//*[@id=\"imagesrc\"]"));
        importarArquivo.sendKeys("C:\\Users\\Aluno\\Downloads\\how-upload-file-using-selenium-webdriver-3-methods-3.png");

        driver.findElement(By.xpath("//*[@id=\"submitbtn\"]")).click();

        // Limpa o texto digitado
        //driver.findElement(By.xpath("XPATH")).clear();

        // Armazana o texto do elemento
        //String Texto = driver.findElement(By.xpath("XPATH")).getText();

        //Compara o texto retornado com o que deveria retornar de fato
        //Assert.assertEquals("SEU_TEXTO", Texto);

        // Elementos Select
        //Select Day = new Select(driver.findElement(By.xpath("XPATH")));
       // Day.selectByVisibleText("Atributo_que_deseja_selecionar");
    }

    // Finalizar teste e fechar o navegador
    @AfterMethod
    public void finalizar() throws InterruptedException {
        Thread.sleep(5000); // aguarda 5 segundos e fecha o navegador
        // Esse metodo irá fechar o navegador
        driver.quit();
    }
}
