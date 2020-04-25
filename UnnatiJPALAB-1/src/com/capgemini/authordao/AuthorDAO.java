package com.capgemini.authordao;

import com.capgemini.authorbean.Author;

public interface AuthorDAO {
	public boolean addAuthor(Author author);
	public boolean deleteAuthor(Author author);
	public Author updateAuthor(Author author);
	public Author findAuthor(Integer id);
}
