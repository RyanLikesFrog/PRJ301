/*
DTO (Data Transfer Object) :
DTO là một design patern dùng để đóng gói và truyền tải dữ liệu
Không chứa bất kỳ business logic nào

Map dự liệu database sang object
 */
package dto;

/**
 *
 * @author ACER
 */
public class UserDTO {
    private String userId;
    private String fullName;
    private String roleId;
    private String password;

    public UserDTO() {
    }

    public UserDTO(String userId, String fullName, String roleId, String password) {
        this.userId = userId;
        this.fullName = fullName;
        this.roleId = roleId;
        this.password = password;
    }

    public String getUserID() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDTO{" + "userId=" + userId + ", fullName=" + fullName + ", roleId=" + roleId + ", password=" + password + '}';
    }
    
}
