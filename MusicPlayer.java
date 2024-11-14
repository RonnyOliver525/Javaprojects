package DesafioDIO;

import java.util.ArrayList;
import java.util.List;

public interface MusicPlayer {

	List<String> musica = new ArrayList<>();
	public void tocar();
    public void pausar();
    public void selecionarMusica();
}
