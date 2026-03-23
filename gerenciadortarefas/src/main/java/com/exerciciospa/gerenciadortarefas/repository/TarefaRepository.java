package com.exerciciospa.gerenciadortarefas.repository;

import com.exerciciospa.gerenciadortarefas.entity.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}