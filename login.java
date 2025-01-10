public class login {
    private String username = "priyanka@25";
    private String password = "Pihu@25";

//    login(String username, String password){
//        this.username = username;
//        this.password = password;
//    }

    public void userLogin(String user, String pass){
        if(user.equals(username) && pass.equals(password)){
            System.out.println("Login Successfully!!!");
        }
        else{
            System.out.println("Please insert correct password");
        }
    }

}
