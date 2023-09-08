package lk.ijse.hibernate_d24.dao.custom.impl;

import lk.ijse.hibernate_d24.dao.custom.UserDAO;
import lk.ijse.hibernate_d24.entity.User;
import lk.ijse.hibernate_d24.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDAOImpl implements UserDAO {
    @Override
    public boolean valid(String userName, String pw) throws SQLException, ClassNotFoundException {
//        ResultSet rst = SQLUtil.execute("SELECT * FROM user WHERE username = ? AND pw = ?" , userName, pw);
//
//        if(rst.next()) {
//            return true;
//        }else {
//            return false;
//        }
        return false;
    }

    @Override
    public boolean save(User entity) throws SQLException, ClassNotFoundException {
//        boolean isSaved = SQLUtil.execute("INSERT INTO user (username, pw) VALUES (?,?)", entity.getUserName(), entity.getpW());
//        return isSaved;

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        try {

            User user1 = new User();
            user1.setUserName(entity.getUserName());
            user1.setpW(entity.getpW());
            user1.setUser(entity.getUserName());

            session.persist(user1);

            /*persist() is also used for update*/
            /*sout - for select queries*/
            //session.remove(customer);
            transaction.commit();
            return true;

        }catch (Exception e){
            return false;
        }finally {
            session.close();
        }

    }

    @Override
    public boolean update(User entity) throws SQLException, ClassNotFoundException {
//        boolean isUpdated = SQLUtil.execute("UPDATE user SET username = ?, pw = ? WHERE username = ?", entity.getUserName(), entity.getpW(), entity.getUser());
//        return isUpdated;

        Session session = FactoryConfiguration.getInstance().getSession();


        try {

            User user = session.load(User.class, entity.getUser());
            if(user!=null) {
                user.setUserName(entity.getUserName());
                user.setpW(entity.getpW());
                Transaction transaction = session.beginTransaction();
                session.update(user);
                transaction.commit();
                session.close();
                return true;
            }

        }catch (Exception e){
            return false;
        }finally {
            session.close();
        }
        return false;
    }

    @Override
    public boolean delete(String id) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public ArrayList<User> getAll() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public User search(String id) throws SQLException, ClassNotFoundException {
        return null;
    }

}
