import java.util.ArrayList;
import java.util.Scanner;

public class login {
    private String UserName;
    private int UserId;
    private String password;
    ArrayList<login> StudentsAccounts = new ArrayList<>();

    login(String username,int userid,String pasword)
    {

        setUserName(username);
        setUserId(userid);
        setPassword(pasword);

    }




     public  void LoginUser()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter your name : ");
        String userName = scanner.nextLine();
        
        System.out.println("Enter Your Password : ");

        String Password = scanner.nextLine();

        for (int i = 0; i < StudentsAccounts.size() - 1; i++) {
            if (userName.equals(getUserName()) && Password.equals(getPassword()) ) {
                System.out.println("Welcome! " + userName);
                
                break;
                
                
            }
            else
            {
                System.out.println("Access denied!");
                
            }
            
            
            
        }
        scanner.close();





    }
    public void AddStudentProfile()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dont have account?");
        String userprompt = scanner.nextLine();
        if (userprompt == "Yes") {
            System.out.println("Adding your account..");
            System.out.println("Enter Your name :");
            String userName = scanner.nextLine();
            
            System.out.println("Enter Your ID :");
            int userId = scanner.nextInt();
            
            System.out.println("Set a Strong 8 characters password :");
            String passward = scanner.nextLine();
           

            StudentsAccounts.add(new login(userName, userId, passward));
            
            


            
        }
        else
        {
            LoginUser();

        }
        scanner.close();

        




    }
   
    public String getUserName() {
        return UserName;
    }
    public void setUserName(String userName) {
        if (userName instanceof String) {
            UserName = userName;

            
        }
        else
        {
            System.out.println("Invalid Prompt! Try again");
        }
       
    }
    public int getUserId() {
       
        return UserId;
    }
    public void setUserId(int userId) {
        Integer coverted = (Integer) userId;
        if (coverted instanceof Integer){

            UserId = userId;


        }
        else
        {
            System.out.println("Invalid Prompt! Try again");

        }
            
        }
    
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        if (password.length() == 8) {

            this.password = password;

            
           
        }
        else
        {
            System.out.println("Must include 8 characters!");
        }

    }

    
    
}
