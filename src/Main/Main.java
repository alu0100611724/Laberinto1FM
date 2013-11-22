package Main;

import laberinto.fm.fabricas.JuegoDelLaberinto;
import laberinto.fm.fabricas.Laberinto;
import laberinto.luchas.JuegoDelLaberintoLuchas;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("\nMortal Kombat Maze\n");
		JuegoDelLaberinto mortalKombat = new JuegoDelLaberintoLuchas();
		Laberinto laberintoLucha = mortalKombat.crearLaberinto();
		laberintoLucha.play();
		
		System.out.println("\nHogwarts Maze\n");
		JuegoDelLaberinto elSecrtoDeHogwarts = new JuegoDelLaberintoLuchas();
		Laberinto hogwarts = elSecrtoDeHogwarts.crearLaberinto();
		hogwarts.play();
	}

}

