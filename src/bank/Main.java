package bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("------------------");
            System.out.println("1. 계좌 생성");
            System.out.println("2. 계좌 잔액 조회");
            System.out.println("3. 입금");
            System.out.println("4. 출금");
            System.out.println("5. 계좌 삭제");
            System.out.println("6. 종료");
            System.out.print("선택: ");


            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("이름: ");
                    String owner = sc.nextLine();
                    System.out.print("비밀번호: ");
                    String accountNo = sc.nextLine();

                    Account newAccount = new Account(owner,accountNo);
                    bank.addAccount(newAccount);
                    System.out.println("계좌가 개설되었습니다.");
                    System.out.println("계좌번호: " + newAccount.getId());
                case 2:


            }
        }
    }
}
