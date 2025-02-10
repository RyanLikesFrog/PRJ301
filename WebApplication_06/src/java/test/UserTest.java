/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.UserDAO;
import dto.UserDTO;
import java.util.List;

/**
 *
 * @author ACER
 */
public class UserTest {

    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        /*        UserDTO u1 = new UserDTO("TNM01", "Nguyen Minh Trung", "AD", "12345");
        /*        System.out.println(userDAO.create(u1));*/
        /*        for (int i = 0; i < 10; i++) {
        UserDTO ui = new UserDTO("USER No. " + i, "Nguyen " + i, "VN", " null");
        userDAO.create(ui);
        }*/
        /*        userDAO.delete("USER0");*/
        List<UserDTO> list = userDAO.readAll();
        for(UserDTO userDTO : list){
            System.out.println(userDTO);
        }
    }
}