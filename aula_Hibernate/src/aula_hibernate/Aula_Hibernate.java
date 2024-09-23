
package aula_hibernate;

import javax.persistence.Persistence;

public class Aula_Hibernate {

    public static void main(String[] args) {
        Persistence.createEntityManagerFactory("aula_HibernatePU");
    }
    
}
