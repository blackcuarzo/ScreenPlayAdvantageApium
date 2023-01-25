package co.com.bancolombia.certification.advantagedemo.models;

public class CreateUserModel {

//        | userName   | email   | password   | confirmPassword   | firstName   | phoneNumber   | country   | state   | address   | city   | zip   |

  private String userName;
  private String email;
  private String password;
  private String confirmPassword;
  private String firstName;
  private String lastName;
  private String phoneNumber;
  private String country;
  private String state;
  private String address;
  private String city;
  private String zip;


  public CreateUserModel(String userName, String email, String password, String confirmPassword, String firstName, String lastName, String phoneNumber, String country, String state, String address, String city, String zip) {
    this.userName = userName;
    this.email = email;
    this.password = password;
    this.confirmPassword = confirmPassword;
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
    this.country = country;
    this.state = state;
    this.address = address;
    this.city = city;
    this.zip = zip;
  }

  public String getUserName() {
    return userName;
  }

  public String getEmail() {
    return email;
  }

  public String getPassword() {
    return password;
  }

  public String getConfirmPassword() {
    return confirmPassword;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName(){return lastName;}
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public String getCountry() {
    return country;
  }

  public String getState() {
    return state;
  }

  public String getAddress() {
    return address;
  }

  public String getCity() {
    return city;
  }

  public String getZip() {
    return zip;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setConfirmPassword(String confirmPassword) {
    this.confirmPassword = confirmPassword;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public void setState(String state) {
    this.state = state;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }
}
