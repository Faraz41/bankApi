package dev.armancodeblock.restfulBankApi.repository;

import dev.armancodeblock.restfulBankApi.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

// Repository Job is to interact with DataBase
// it provides to perform CRUD operations.
// Query Methods
// Pagination and Sorting

// Explain Spring Data JPA ( it part of spring data project. it builds on top of JPA and Hibernate (or another JPA implementation) to simplify the data access layer.)
// what JPA (JAVA Persistence API) does ? = JPA is a specification for Object-relational mapping (ORM)
// it defines a set of concepts and API for managing data in Java application
// an implementation
// Hibernate (Hibernate is an ORM framework that implements the JPA specification. HQL )
public interface BankAccountRepository extends JpaRepository<BankAccount,Long> {
}
