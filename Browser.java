package DesafioDIO;

public interface Browser {
	
	boolean conexaoInternet = false;
	public void exibirPagina(String url);
    public void adicionarNovaAba(String url);
    public void atualizarPagina();
}
