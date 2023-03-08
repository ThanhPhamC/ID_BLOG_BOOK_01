package ra.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserId")
    private int userId;
    @Column(name = "UserName")
    private String userName;
    @Column(name = "FirstName")
    private String firstName;
    @Column(name = "LastName")
    private String lastName;
    @Column(name = "Email")
    private String email;
    @Column(name = "Passwords")
    private String passwords;
    @Column(name = "Address")
    private String address;
    @Column(name = "State")
    private String state;
    @Column(name = "City")
    private String city;
    @Column(name = "Post")
    private String post;
    @Column(name = "Phone")
    private String phone;
    @Column(name = "Avatar")
    private String avatar;
    @Column(name = "BirtDate")
    private Date birtDate;
    @Column(name = "StatusUser")
    private boolean statusUser;
    @Column(name = "Ranks")
    private int ranks;
    @Column(name = "Roles")
    private boolean roles;

}
