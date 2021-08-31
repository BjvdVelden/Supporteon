package rankingSysteem;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ranking {
    private String rank;
    private LocalDate dateSubscribed;
    private int monthsPassed;
    private String subscribed;


    public ranking(String subscribed){
        this.rank = "Bronze";
        this.monthsPassed = 0;
        this.subscribed = subscribed;
        this.dateSubscribed = LocalDate.now();


        for (int i = 0; i < database.database.getInstance().getContentAccounts().size(); i++){
        if(database.database.getInstance().getContentAccounts().get(i).getUsername().equals(subscribed)){
            int subscribedNumber = database.database.getInstance().getContentAccounts().get(i).getSubscribers();
            subscribedNumber++;
            database.database.getInstance().getContentAccounts().get(i).setSubscribers(subscribedNumber);
            }
        }


    }


    public void setRanking(){
        if(rank.equals("Bronze")){
            if(monthsPassed >= 3){
                this.rank = "Silver";
            }
            else if(monthsPassed >= 8) {
                this.rank = "Goud" ;
            }
        }
    }

    public String getRank() {
        return rank;
    }

    public String getSubscribed() {
        return subscribed;
    }

    public void calculateMonthsPassed(){
        LocalDate today = LocalDate.now();
        Period age = Period.between(this.dateSubscribed, today);
        this.monthsPassed = age.getMonths();;
    }

    public int getMonthsPassed() {
        return monthsPassed;
    }

    public String getDateSubscribed(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        return this.dateSubscribed.format(formatter);
    }

    public void setMonthsPassed(int monthsPassed) {
        this.monthsPassed = monthsPassed;
    }
}
