package no.cheatsheet.dao;

import java.util.Optional;

public class UserApplication {

//    The example is contrived, but it shows in a nutshell the motivations behind the DAO pattern. In this case, the main method just uses a UserDao instance to perform CRUD operations on a few User objects.
//
//    The most relevant facet of this process is how UserDao hides from the application all the low-level details on how the objects are persisted, updated and deleted.

    private static Dao<User> userDao;

    public static void main(String[] args) {
        userDao = new UserDao();

        User user1 = getUser(0);
        System.out.println(user1);
        userDao.update(user1, new String[]{"Jake", "jake@domain.com"});

        User user2 = getUser(1);
        userDao.delete(user2);
        userDao.save(new User("Julie", "julie@domain.com"));

        userDao.getAll().forEach(user -> System.out.println(user.getName()));
    }

    private static User getUser(long id) {
        Optional<User> user = userDao.get(id);

        return user.orElseGet(
                () -> new User("non-existing user", "no-email"));
    }
}