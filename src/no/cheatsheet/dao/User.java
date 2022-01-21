package no.cheatsheet.dao;

// The domain class of the DAO.
//  The User class is just a plain container for user data, so it doesn't implement any other behavior worth stressing.
//  Of course, the important design choice here is how to keep the application using this class isolated from any persistence mechanism that could be implemented.
//  And that's exactly the issue that the DAO pattern attempts to address.
public class User {
    private String name;
    private String email;

    // constructors / standard setters / getters

    public User(String name, String email){
        this.name = name;
        this.email = email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // JPA -------------------------
//    @Entity
//    @Table(name = "users")
//    public class User {
//
//        @Id
//        @GeneratedValue(strategy = GenerationType.AUTO)
//        private long id;
//
//        private String name;
//        private String email;
//
//        // standard constructors / setters / getters
//    }
}
