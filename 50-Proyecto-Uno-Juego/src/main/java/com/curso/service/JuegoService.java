package com.curso.service;

import com.curso.modelo.Juego;

public interface JuegoService {
	void pasar();
	void poner(int id_carta, int tipo, int numero, String color);
	void reiniciarJuego();
	int turno();
	Juego obtenerJuego();
}
