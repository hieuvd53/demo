package hieuvd.demo.data.service;



import hieuvd.demo.data.model.Role;

import java.util.List;

public interface RoleService
{
    List<Role> getRoleNameExistOfUser(List<String> roleList, int userId);
    boolean deleteRoleExist(List<String> roleList, int userId);
}
