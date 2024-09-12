package com.orion.bird.backEnd.dataBase.dataBaseLogic;
import com.orion.bird.backEnd.dataBase.entities.Users;
import com.orion.bird.backEnd.dataBase.repository.IUsersRepository;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;

public class FirstViewDB {

    @Autowired
    private IUsersRepository repositoryUsers = null;

    public void getUser(TextField field, PasswordField pass)
    {
        Users users = new Users(field.getText(), pass.getText());
        repositoryUsers.save(users);
    }
}