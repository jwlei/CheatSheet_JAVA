//package no.cheatsheet.dao;
//
//import javax.management.Query;
//import java.util.List;
//import java.util.Objects;
//import java.util.Optional;
//
////  There's a tendency among developers to think that the release of JPA downgraded to zero the DAO pattern's functionality.
////  The pattern becomes just another layer of abstraction and complexity on top of the one provided by JPA's entity manager.
////  This is true in some scenarios. Even so, we sometimes just want to expose to our application only a few domain-specific methods of the entity manager's API.
////  The DAO pattern has its place in such cases.
//
////  The JpaUserDao class can work with any relational database supported by the JPA implementation.
////  Also, if we look closely at the class, we'll realize how the use of Composition and Dependency Injection allows us to call only the entity manager methods required by our application.
////  Simply put, we have a domain-specific tailored API, rather than the entire entity manager's API.
//
//public class JpaUserDao implements Dao<User> {
//
//    private EntityManager entityManager;
//
//    // standard constructors
//
//    @Override
//    public Optional<User> get(long id) {
//        return Optional.ofNullable(entityManager.find(User.class, id));
//    }
//
//    @Override
//    public List<User> getAll() {
//        Query query = entityManager.createQuery("SELECT e FROM User e");
//        return query.getResultList();
//    }
//
//    @Override
//    public void save(User user) {
//        executeInsideTransaction(entityManager -> entityManager.persist(user));
//    }
//
//    @Override
//    public void update(User user, String[] params) {
//        user.setName(Objects.requireNonNull(params[0], "Name cannot be null"));
//        user.setEmail(Objects.requireNonNull(params[1], "Email cannot be null"));
//        executeInsideTransaction(entityManager -> entityManager.merge(user));
//    }
//
//    @Override
//    public void delete(User user) {
//        executeInsideTransaction(entityManager -> entityManager.remove(user));
//    }
//
//    private void executeInsideTransaction(Consumer<EntityManager> action) {
//        EntityTransaction tx = entityManager.getTransaction();
//        try {
//            tx.begin();
//            action.accept(entityManager);
//            tx.commit();
//        }
//        catch (RuntimeException e) {
//            tx.rollback();
//            throw e;
//        }
//    }
//}
