package com.sacral.SacralTesting.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.SacralTesting.model.User;
import com.sacral.SacralTesting.repository.UpdateUsersController2ManagementServiceRepository;

@Service
public class UpdateUsersController2ManagementService {

    @Autowired
    UpdateUsersController2ManagementServiceRepository updateUsersController2ManagementServiceRepository;

    public User findById(long id) {
        return updateUsersController2ManagementServiceRepository.findById(id);
    }

    public User save(User user) {
        return updateUsersController2ManagementServiceRepository.save(user);
    }

    public void deleteById(long id) {
        updateUsersController2ManagementServiceRepository.deleteById(id);
    }

    public boolean existsById(long id) {
        return updateUsersController2ManagementServiceRepository.existsById(id);
    }

    public User updateUserInfo(User user) {
        return updateUsersController2ManagementServiceRepository.updateUserInfo(user);
    }

    public boolean checkUserId(User user) {
        return updateUsersController2ManagementServiceRepository.checkUserId(user);
    }

    public boolean checkPassword(User user) {
        return updateUsersController2ManagementServiceRepository.checkPassword(user);
    }

    public boolean checkUsername(User user) {
        return updateUsersController2ManagementServiceRepository.checkUsername(user);
    }

    public boolean checkEmail(User user) {
        return updateUsersController2ManagementServiceRepository.checkEmail(user);
    }

    public boolean checkParentType(User user) {
        return updateUsersController2ManagementServiceRepository.checkParentType(user);
    }

    public boolean checkLevel(User user) {
        return updateUsersController2ManagementServiceRepository.checkLevel(user);
    }

    public void clearFields(User user) {
        updateUsersController2ManagementServiceRepository.clearFields(user);
    }

}