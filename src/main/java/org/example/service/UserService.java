package org.example.service;

import org.example.dao.UserDao;
import org.example.dao.UserDaoImpl;
import org.example.model.UserModel;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/users")
public class UserService {

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response saveUser(UserModel userModel) {
        UserDao userDao = new UserDaoImpl();
        userDao.save(userModel);
        if (userModel != null) return Response.ok().entity("Все успешно выполнено!").build();
        else return Response.ok().entity("Что-то пошло не так...").build();
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response getAll() {
        UserDao userDao = new UserDaoImpl();
        List<UserModel> userModels = userDao.getAll();
        return Response.ok().entity(userModels).build();
    }

}
