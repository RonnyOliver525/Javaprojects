package DesafioDIO;

import java.util.ArrayList;
import java.util.List;

public interface Telefone {
	
	List<String> contatos = new ArrayList<>();
	public void ligar(String numero);
    public void atender(String numero);
    public void iniciarCorreioVoz(String mensagem, String destinatario);
}
