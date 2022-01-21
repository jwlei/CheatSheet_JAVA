package no.cheatsheet.dao;

import java.util.List;
import java.util.Optional;

//Let's define a basic DAO layer so we can see how it can keep the domain model completely decoupled from the persistence layer.
//Due to the high level of abstraction that the interface provides, it's easy to create a concrete, fine-grained implementation that works with User objects.

public interface Dao<T> {

        Optional<T> get(long id);

        List<T> getAll();

        void save(T t);

        void update(T t, String[] params);

        void delete(T t);
}
