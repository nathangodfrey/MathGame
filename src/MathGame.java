import javax.swing.JOptionPane;

public class MathGame {
	public static void main(String[] args) {
		String[] equations = { "1*1", "2*3", "4*17", "4*18" };
		String[] answers = { "1", "6", "68", "72" };
		int wrong = 0;
		int score = 0;
		for (int i = 0; i < equations.length; i++) {
		long currentTime=System.currentTimeMillis();
		
			
		String guess = JOptionPane.showInputDialog(equations[i]);
		long newTime=System.currentTimeMillis();
		long timePassed=newTime-currentTime;
		if (answers[i].equals(guess)&&timePassed<15000) {
			
			JOptionPane.showMessageDialog(null, "Correct");
				score = score+1;
				JOptionPane.showMessageDialog(null, "You have " +score+ " points");
			
			} else {
				wrong = wrong + 1;
				score=score;
				JOptionPane.showMessageDialog(null, "You have " +score+ " points");
				if (wrong == 3) {
					JOptionPane.showMessageDialog(null, "Game Over, Dont try again.");
					break;
				}
				JOptionPane.showMessageDialog(null, "WRONG!!");
		
			}
			

		}
	}

}
