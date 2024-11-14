package DesafioDIO;

import java.util.ArrayList;
import java.util.List;

public class Iphone implements Browser, MusicPlayer , Telefone {

	
	List<String> contatos = new ArrayList<>();
		
	
	
    @Override
    public void ligar(String numero) {
        //Implementação aqui
    }

    @Override
    public void atender(String numero) {
        //Implementação aqui
    }

    @Override
    public void iniciarCorreioVoz(String mensagem, String destinatario) {
        //Implementação aqui
    }
    
   
    boolean conexaoInternet = false;

    @Override
    public void exibirPagina(String url) {
        //Implementação aqui
    }

    @Override
    public void adicionarNovaAba(String url) {
        //Implementação aqui
    }

    @Override
    public void atualizarPagina() {
        //Implementação aqui
    }

    List<String> musica = new ArrayList<>();
    
    @Override
    public void tocar() {
        //Implementação aqui
    }

    @Override
    public void pausar() {
        //Implementação aqui
    }

    @Override
    public void selecionarMusica() {
        //Implementação aqui
    }
}

