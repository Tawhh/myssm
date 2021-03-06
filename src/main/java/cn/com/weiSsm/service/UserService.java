package cn.com.weiSsm.service;

import cn.com.weiSsm.base.CrudService;
import cn.com.weiSsm.dao.UserDao;
import cn.com.weiSsm.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by weihh on 2017/4/20.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserService extends CrudService<UserDao, User> {
    @Resource
    private UserDao userDao;

    public List<User> selectAllUser(){
        return userDao.selectAllUser();
    }
    public User get(String ming ){
        return userDao.get(ming);
    }
    public void save(User user){
         super.save(user);
    }


}
