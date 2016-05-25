package cn.com.sixone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
 
    @Autowired
    private UserDAO userDAO;
     
    @Override
    public int insertUser(User user) {
        // TODO Auto-generated method stub
    	System.out.println("1111111111");
        return userDAO.insertUser(user);
    }
 
}
