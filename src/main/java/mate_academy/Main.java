package mate_academy;

import mate_academy.checking_emailDB.UserService;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        String[] dataBase = {"elf@gag:35","sanek@gag:157","gafin@gag:15"};
        System.out.println(userService.getUserScore(dataBase, "joh@gag"));
    }
}
