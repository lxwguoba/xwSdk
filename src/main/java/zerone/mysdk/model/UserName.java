package zerone.mysdk.model;

/**
 * Created by 锅巴哈哈 on 2019-03-11.
 * email liuxingwen_0511@163.com
 */

/**
 * 用户的实体类信息
 */
public class UserName {
    //用户id
    private Long userID;
    //用户名称
    private String username;
    //用户密码
    private String userpasswrod;
    //用户年龄
    private String userage;
    //用户爱好
    private String userhobby;
    //用户身份证
    private String userIDCard;
    //用户住址
    private String userAddress;

    public UserName() {
    }

    public UserName(Long userID, String username, String userpasswrod, String userage, String userhobby, String userIDCard, String userAddress) {
        this.userID = userID;
        this.username = username;
        this.userpasswrod = userpasswrod;
        this.userage = userage;
        this.userhobby = userhobby;
        this.userIDCard = userIDCard;
        this.userAddress = userAddress;
    }

    public Long getUserID() {
        return userID;
    }


    public void setUserID(Long userID) {
        this.userID = userID;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getUserpasswrod() {
        return userpasswrod;
    }


    public void setUserpasswrod(String userpasswrod) {
        this.userpasswrod = userpasswrod;
    }

    public String getUserage() {
        return userage;
    }


    public void setUserage(String userage) {
        this.userage = userage;
    }

    public String getUserhobby() {
        return userhobby;
    }

    public void setUserhobby(String userhobby) {
        this.userhobby = userhobby;
    }


    public String getUserIDCard() {
        return userIDCard;
    }

    public void setUserIDCard(String userIDCard) {
        this.userIDCard = userIDCard;
    }


    public String getUserAddress() {
        return userAddress;
    }


    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
}
