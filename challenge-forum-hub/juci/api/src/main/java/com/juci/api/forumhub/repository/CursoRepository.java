package com.juci.api.forumhub.repository;

import com.juci.api.forumhub.domain.curso.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}

