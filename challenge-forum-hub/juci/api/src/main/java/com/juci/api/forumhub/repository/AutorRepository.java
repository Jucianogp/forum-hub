package com.juci.api.forumhub.repository;

import com.juci.api.forumhub.domain.autor.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}