public class Project3User {
    static int  balance(String num){
        int balance=0;
        switch(num){
            case "ABJ5000":
                balance=10000;
                break;
            case "ABJ5001":
                balance=5000;
                break;
            case "ABJ5002":
                balance= 50000;
                break;
            case "ABJ5003":
                balance= 2000;
                break;
            case "ABJ5004":
                balance= 100;
                break;
            default:
                break;
        }
        return balance;
    }
}
