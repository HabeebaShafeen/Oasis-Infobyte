import java.util.Scanner; 
public class ATM
{   
    public static void main(String args[] )  
    {  
        //declare and initialize balance, withdraw, and deposit  
        int bal = 500000, withdraw, deposit;
         
        Scanner input = new Scanner(System.in);
        while(true)  
        {  
            System.out.println("Here's your Automated Teller Machine");  
            System.out.println("Choose 1 to Debit");  
            System.out.println("Choose 2 to Credit");  
            System.out.println("Choose 3 to Check Balance");  
            System.out.println("Choose 4 to EXIT");  
            System.out.print("Choose the operation you want to perform:");
            //get choice from user  
            int choice = input.nextInt();  
            switch(choice)  
            {  
                case 1:  
                System.out.print("Enter money to be withdrawn:");
                //get the withdrawl money from user
                withdraw = input.nextInt();
                //check whether the balance is greater than or equal to the withdrawal amount  
                if(bal >= withdraw)
                { 
                   //remove the withdrawl amount from the total balance 
                   bal = bal - withdraw;
                   System.out.println("Please collect the Cash"+"\n"); 
                }
                else  
                {  
                   //show Custom error message   
                   System.out.println("Insufficient Balance ,Sorry you cannot withdraw"+"\n");  
                }  
                break;
                
                case 2:
                System.out.print("Enter amount to be deposited:"); 
                //get deposite amount from to user
                deposit = input.nextInt();
                //add the deposit amount to the total balanace 
                bal = bal + deposit;
                System.out.println("Your Money has been successfully deposited to your account"+"\n");
                break;
                
                case 3:
                //displaying the total balance of the user  
                System.out.println("Your Balance  is : "+bal+"\n");  
                break; 
                
                case 4:  
                //exit from the menu  
				return;
            } 
        }
    }
}  