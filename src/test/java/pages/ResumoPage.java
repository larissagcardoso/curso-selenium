package pages;

import org.openqa.selenium.By;

import core.BasePage;

public class ResumoPage extends BasePage {

	public void ExcluirMovimentacao() {
		clicarBotao(By.xpath("//span[@class='glyphicon glyphicon-remove-circle']"));
		
	
	}
	
	public String obterMensagemSucesso(){
		return obterTexto(By.xpath("//div[@class='alert alert-success']"));
	}
}
