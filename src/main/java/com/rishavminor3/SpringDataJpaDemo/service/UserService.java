package com.rishavminor3.SpringDataJpaDemo.service;

import com.rishavminor3.SpringDataJpaDemo.model.User;
import com.rishavminor3.SpringDataJpaDemo.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.boot.model.naming.IllegalIdentifierException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j  //log is available for debugging
public class UserService
{
     @Autowired
    UserRepository userRepository;

     public List<User>  findAllUsers(){
          return userRepository.findAll();
     }

     public User getUserById( Long id)
     {
             Optional <User> userOptional= userRepository.findById(id);

             if(userOptional.isPresent())
                log.debug("User with id : {} is ",id,userOptional.get());
             else
             {
                 throw new IllegalIdentifierException("id : "+id);
             }
             return userOptional.get();

     }

     public User createUser(User user)
     {
            return userRepository.save(user);
     }

     public User updateUser(User user)
     {

           return userRepository.save(user);
     }

     public User deleteUser(Long id)
     {
           User deletedUser=getUserById(id);
           userRepository.deleteById(id);
           return deletedUser;
     }
}
