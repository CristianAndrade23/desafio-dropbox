package com.example.desafiodropbox.impl;

import com.example.desafiodropbox.models.User;
import com.example.desafiodropbox.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserFacade {

  @Autowired
  private Repository mongoRepositorio;

  public List<User> getAllUsers(){
    return mongoRepositorio.findAll();
  }

  public Optional<User> getUserById(int id){
    return mongoRepositorio.findById ( id );
  }

  public String saveUser(User newUser){
    mongoRepositorio.save ( newUser );
    return "Usuário: " + newUser.getName() + " criado!";
  }

  public String updateUser(int id, User user){
    mongoRepositorio.save ( user );
    return "Usuário: " + user.getName() + " editado!";
  }

  public String deleteUser(int id){
    mongoRepositorio.deleteById ( id );
    return "Usuário: " + id + " deletado!";
  }




}
