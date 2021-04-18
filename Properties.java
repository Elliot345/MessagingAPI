import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties {
  public static void setProperties(String UID, String password) {
    // hashing password
    String passwordHash = Hash.hash(password);

    // initiating properties file
    Properties props = new Properties();

    // populating properties file
    props.put("UID", UID);
    props.put("PasswordHash", passwordHash);

    // instantiating the FileInputStream for output file
    String path = System.getProperty("user.dir") + "/User.properties";
    FileOutputStream outputStream = new FileOutputStream(path);

    // storing properties file

    System.out.println("path:", path);
    System.out.println("password hash:", passwordHash);

    // props.store(outputStream, "This is the user information property file")

  }
}