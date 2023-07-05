package mate_academy.checking_emailDB;

public class UserService {
    public int getUserScore(String[] records, String email) {
        String[][] emailsAndScores = new String[records.length][2];
        for (int i = 0; i < records.length; i++){
            emailsAndScores[i] = records[i].split(":");
        }
            for (String[] emailAndScore : emailsAndScores) {
                if (emailAndScore[0].equals(email)) {
                    return Integer.parseInt(emailAndScore[1]);
                }
            }
            throw new UserNotFoundException("User with given email doesn't exist");
    }
}
