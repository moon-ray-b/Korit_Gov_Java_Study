package _32_LayeredArchitiecture2.repository;

import _32_LayeredArchitiecture2.entity.User;

public interface UserRepository {
    void insert(User user);
    User findByUsername(String username);
}
