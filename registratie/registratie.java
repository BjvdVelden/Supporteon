package registratie;

import account.account;

public class registratie{

    public registratie(){
    }


    public boolean inputChecker(String input){
        String string = input;
        String specialCharacters = "<>[]{}*^/.,';][:\"";
        for (int i = 0; i < string.length(); i++)
        {
            char check = string.charAt(i);
            if(specialCharacters.contains(Character.toString(check))) {
                break;
            }
            else if(i == string.length()-1){
                return true;
            }
        }
        return false;
    }

    public boolean checkStringSize(String input){
        if (input.length() < 21){
            return true;
        }
        else{
            System.out.println("Je Inlognaam is groter dan 21 tekens");
            return false;
        }
    }

    public boolean wachtwoordChecker(String wachtwoord){
        String string = wachtwoord;
        boolean heeftCijfer = false;
        boolean heeftHoofdletter = false;
        boolean heeftkleineletter = false;

        for(int i = 0; i < string.length(); i++){
            char check = string.charAt(i);
            if(Character.isDigit(check)){
                heeftCijfer = true;
            }
            if(Character.isUpperCase(check)){
                heeftHoofdletter = true;
            }
            if(Character.isLowerCase(check)){
                heeftkleineletter = true;
            }
        }
        if(heeftCijfer && heeftHoofdletter && heeftkleineletter){
            return true;
        }
        System.out.println("Je moet minimaal 1 hoofletter, kleine letter en cijfer hebben in jouw wachtwoord!");
        return false;
    }

    public boolean checkIfCorrect(String username, String wachtwoord){
        int isCorrect = 0;

        if(inputChecker(username)){
            isCorrect++;
        }
        if(checkStringSize(username)){
            isCorrect++;
        }
        if(wachtwoordChecker(wachtwoord)){
            isCorrect++;
        }

        if(isCorrect == 3){
            account account = new account(username, wachtwoord);
            database.database.getInstance().getAccounts().add(account);
        }
        else{
            return false;
        }
        return true;
    }


}
