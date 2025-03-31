package bank;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();

    //계좌 생성
    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("새 계좌가 생성되었습니다." );
    }

    //계좌 조회


    //계좌 삭제
    public void deletAccount(Account account) {
        accounts.remove(account);
        System.out.println("계좌가 삭제되었습니다.");
    }


}
