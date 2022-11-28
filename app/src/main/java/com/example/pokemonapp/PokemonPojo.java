package com.example.pokemonapp;

import java.util.ArrayList;
import java.util.List;

public class PokemonPojo{
	private String next;
	private Object previous;
	private int count;
	public ArrayList<ResultsItem> results;

	public String getNext(){
		return next;
	}

	public Object getPrevious(){
		return previous;
	}

	public int getCount(){
		return count;
	}

	public ArrayList<ResultsItem> getResults(){
		return results;
	}
}