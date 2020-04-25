package com.cg.authorservice;

import com.capgemini.authorbean.Author;

public interface AuthorService {
	public boolean addAuthor(Author author);
	public Author updateAuthor(Author author);
	public boolean deleteAuthor(Integer id);
}
