package bank;

public class Account {

    private static int nextId = 1000; //자동 증가할 계좌 번호
    //계좌 번호
    private int id;
    //계좌 소유자 이름
    private String owner;
    //계좌 잔액
    private double balance;
    //계좌 비밀번호
    private String accountNo;

    public Account(String owner, String accountNo) {
        this.id = nextId++;
        this.owner = owner;
        this.accountNo = accountNo;
    }

    public int getId() {
        return id;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println(amount + "원이 입금되었습니다.");
        }else {
            System.out.println("입금 금액을 정확히 입력하세요.");
        }
    }

    public void withdraw(double amount){
            if(amount <= balance) {
                balance -= amount;
                System.out.println(amount + "원이 출금되었습니다.");
                System.out.println("현재 잔액: " + balance);
            } else {
                System.out.println("잔액이 부족합니다. 현재 잔액: " + balance);
            }
    }
}
