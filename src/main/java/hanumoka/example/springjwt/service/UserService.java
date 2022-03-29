package hanumoka.example.springjwt.service;

import hanumoka.example.springjwt.domain.Role;
import hanumoka.example.springjwt.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
