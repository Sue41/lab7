
/**
 * Write a description of class VoteCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VoteCounter
{
    private String candidate1;
    private String candidate2;
    private int candidate1Votes;
    private int candidate2Votes;
    private boolean completed;
    
   public VoteCounter(String candidate1, String candidate2)
   {
       this.candidate1 = candidate1;
       this.candidate2 = candidate2;
       this.candidate1Votes = 0;
       this.candidate2Votes = 0;
       this.completed = false;
   }
   
   public VoteCounter()
   {
       this("CANDIDATE 1", "CANDIDATE 2");
       
       // or could implement as:
       //        this.candidate1 = "CANDIDATE 1";
       //        this.candidate2 = "CANDIDATE 2";
       //        this.candidate1Votes = 0;
       //        this.candidate2Votes = 0;
       //        this.completed = false;
   }
   public String getCandidate1()
   {
       return this.candidate1;
    }
   public String getCandidate2()
   {
       return this.candidate2;
    }
   public void setCompleted(boolean completed)
   {
       this.completed = completed;
    }
   public String vote(int x) 
   {
       String voting="your vote has been cast";
       String er= "invalid choice, no vote cast";
       String completed="Election closed or not yet started";
       //if elections are ongoing then the boolean operation should read false.
       if(this.completed==false){
        if (x==1){
            this.candidate1Votes++;
            return voting;
        }   else if(x==2){
            this.candidate2Votes++;
            return voting;
        }   else {
            return er;
        }
    }
    else{
    return completed;
    }
    
    }
   public void printResults()
    {
    int tally=this.candidate2Votes+this.candidate1Votes;
    double cd1=(double) candidate1Votes/tally*100;
    double cd2=(double) candidate2Votes/tally*100;
    if (tally>0&&this.completed==true){
    System.out.format(this.candidate1+"  "+"received %3.1f percent of the votes\n",
   cd1);
   System.out.format(this.candidate2+"  "+"received %3.1f percent of the votes\n",
   cd2);} else{System.out.println("Printing not successful");
    }
    
    }
   
}
