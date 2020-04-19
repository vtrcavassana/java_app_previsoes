package br.usjt.ccp3an_mca_app_previsoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.ccp3an_mca_app_previsoes.model.Previsao;

public interface PrevisoesRepository extends JpaRepository<Previsao, Long> {
}