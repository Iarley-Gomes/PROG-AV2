package br.com.unijuazeiro.movies.domain.movie;

import java.util.UUID;

public class Movie {
	private String id;
	private String title;
	private Double price;

	public Movie() {
		this.id = UUID.randomUUID().toString();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public boolean equals(Object o) {
		return ((Movie) o).getId().equals(this.id);
	}
}
