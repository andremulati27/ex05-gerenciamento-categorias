package com.am.gerenciamento_categorias.Repository;

import com.am.gerenciamento_categorias.Model.CategoriaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {
}
