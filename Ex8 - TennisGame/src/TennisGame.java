public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        StringBuilder score = new StringBuilder();
        int playerScore = 0;
        if (player1Score == player2Score) {
            String howCall = switch (player1Score) {
                case 0 -> "Love-All";
                case 1 -> "Fifteen-All";
                case 2 -> "Thirty-All";
                case 3 -> "Forty-All";
                default -> "Deuce";
            };
            score = new StringBuilder(howCall);
        }
        else if (player1Score >= 4 || player2Score >= 4) {
            int diffScore = player1Score-player2Score;
            if (diffScore == 1) score = new StringBuilder("Advantage player1");
            else if (diffScore ==-1) score = new StringBuilder("Advantage player2");
            else if (diffScore >= 2) score = new StringBuilder("Win for player1");
            else score = new StringBuilder("Win for player2");
        }
        else {
            for (int i = 1; i < 3; i++) {
                if ( i== 1) playerScore  = player1Score;
                else { score.append("-"); playerScore  = player2Score;}
                switch (playerScore ) {
                    case 0 -> score.append("Love");
                    case 1 -> score.append("Fifteen");
                    case 2 -> score.append("Thirty");
                    case 3 -> score.append("Forty");
                }
            }
        }
        return score.toString();
    }
}