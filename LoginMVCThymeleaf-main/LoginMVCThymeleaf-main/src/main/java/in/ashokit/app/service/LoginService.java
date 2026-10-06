package in.ashokit.app.service;

import in.ashokit.app.entity.User;
import in.ashokit.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    UserRepository repo;

    public boolean saveUser(User user) {
        if(repo.findByUsername(user.getUsername()) != null) {
            return false;
        }
        else {
            repo.save(user);
            return true;
        }
    }

    public User loginUser(User user) {
        User fromDB = repo.findByEmail(user.getEmail());
        if(fromDB != null) {
            if(fromDB.getPassword().equals(user.getPassword())) {
                return fromDB;
            }
        }
        return null;
    }
}
