package bares.vi.csci3130_a2;


public class Validator {

    public int validate(String password){
        int c = 0;
        if (password.length()<8){
            c++;
        }
        if (password.toLowerCase().equals("password")){
            c++;
        }
        if ((password.toLowerCase().equals(password))&&(password.toUpperCase().equals(password))){
            c++;
        }
        if (password.matches(".*\\d+.*")){
            c++;
        }
        if(password.contains("%")){
            c++;
        }
        return c;
}
}