package com.example.desafiodropbox.contract;

import com.example.desafiodropbox.impl.UserFacade;
import com.example.desafiodropbox.models.User;
import com.example.desafiodropbox.repository.Repository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Api(tags = "User control")
@Controller
@RestController
@RequestMapping("/v1")
public class UserController {

  @Autowired
  private UserFacade userFacade;


  @GetMapping("/users")
  @ApiOperation(value = "Get all users")
  @ApiResponses(value = {
    @ApiResponse(code = 204, response = User.class, message = "Success to get all users"),
    @ApiResponse(code = 400, response = User.class, message = "Invalid params"),
    @ApiResponse(code = 500, response = User.class, message = "Server internal error, please contact support")
  })
  @ResponseBody
  public List<User> getUsers() {
    return userFacade.getAllUsers ();
  }

  @GetMapping("/user/{id}")
  @ApiOperation(value = "Get user by id")
  @ApiResponses(value = {
    @ApiResponse(code = 204, response = User.class, message = "Success to get user by id"),
    @ApiResponse(code = 400, response = User.class, message = "Invalid params"),
    @ApiResponse(code = 500, response = User.class, message = "Server internal error, please contact support")
  })
  public Optional<User> getUserById(@PathVariable int id){
    return userFacade.getUserById ( id );
  }

  @PostMapping("/user")
  @ApiOperation(value = "Create user")
  @ApiResponses(value = {
    @ApiResponse(code = 204, response = User.class, message = "Success to create."),
    @ApiResponse(code = 400, response = User.class, message = "Invalid params"),
    @ApiResponse(code = 500, response = User.class, message = "Server internal error, please contact support")
  })
  public String newUser(@RequestBody User user){
    return userFacade.saveUser ( user );
  }

  @PutMapping("/user/{id}")
  @ApiOperation(value = "Edit user")
  @ApiResponses(value = {
    @ApiResponse(code = 204, response = User.class, message = "Success to edit"),
    @ApiResponse(code = 400, response = User.class, message = "Invalid params"),
    @ApiResponse(code = 500, response = User.class, message = "Server internal error, please contact support")
  })
  public String updateUser(@PathVariable int id,
                           @RequestBody @Valid User user){
    return userFacade.updateUser (id, user );
  }

  @DeleteMapping("/user/{id}")
  @ApiOperation(value = "Delete user by id")
  @ApiResponses(value = {
    @ApiResponse(code = 204, response = User.class, message = "Success to delete"),
    @ApiResponse(code = 400, response = User.class, message = "Invalid params"),
    @ApiResponse(code = 500, response = User.class, message = "Server internal error, please contact support")
  })
  public String deleteUser(@PathVariable int id){
    return userFacade.deleteUser ( id );
  }

}
