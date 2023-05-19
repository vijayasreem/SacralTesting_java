package com.sacral.SacralTesting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sacral.SacralTesting.model.User; 

@Repository
public interface UpdateUsersController2ManagementServiceRepository extends JpaRepository<User, Long> {

    // Custom methods for updating user information
    public User findById(long id);
    public User save(User user);
    public void deleteById(long id);
    public boolean existsById(long id);
    public User updateUserInfo(User user);
    public boolean checkUserId(User user);
    public boolean checkPassword(User user);
    public boolean checkUsername(User user);
    public boolean checkEmail(User user);
    public boolean checkParentType(User user);
    public boolean checkLevel(User user);
    public void clearFields(User user);
}