package com.infinity.test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("NomeDaUnidadeDePersistencia");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario novoUsuario = new Usuario();
        novoUsuario.setNome("João");
        novoUsuario.setIdade(30);

        em.persist(novoUsuario);

        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
