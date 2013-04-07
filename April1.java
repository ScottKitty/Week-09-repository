
import java.util.Scanner;
import javax.swing.JOptionPane;

public class April1
{
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
		
		boolean GameDone = true;
		boolean InvalidMove = true;
		String Board = "";
		
		String  Box1 = "1",
				Box2 = "2",
				Box3 = "3",
				Box4 = "4",
				Box5 = "5",
				Box6 = "6",
				Box7 = "7",
				Box8 = "8",
				Box9 = "9";
		
		String User;
		
	GameDone = true;
	do
	{
		InvalidMove = true;
			do{
			
				Board = Box1 + " | " + Box2 + " | " +  Box3 + "\n";
				Board = Board + "---|---|---" + "\n";
				Board = Board + Box4 + " | " + Box5 + " | " +  Box6 + "\n";
				Board = Board + "---|---|---" + "\n";
				Board = Board +  Box7 + " | " +  Box8 + " | " +  Box9 + "\n";
				Board  = Board + "Enter a Number 1-9";
				User = JOptionPane.showInputDialog(Board);
			
				if(User.equalsIgnoreCase("1"))
					{
						if ( ! Box1.equals("1"))
							{
								JOptionPane.showMessageDialog(null,"Box Already Taken");
							}
						else 
							{
								Box1="X";
								InvalidMove = false;
							}
					}
				else if(User.equalsIgnoreCase("2"))
					{
						if ( ! Box2.equals("2"))
							{
								JOptionPane.showMessageDialog(null,"Box Already Taken");
							}
						else 
							{
								Box2="X";
								InvalidMove = false;
							}	
					}
				else if(User.equalsIgnoreCase("3"))
					{
						if ( ! Box3.equals("3"))
							{
								JOptionPane.showMessageDialog(null,"Box Already Taken");
							}
						else 
							{
								Box3="X";
								InvalidMove = false;
							}
					}
				else if(User.equalsIgnoreCase("4"))
					{
						if ( ! Box4.equals("4"))
							{
								JOptionPane.showMessageDialog(null,"Box Already Taken");
							}
						else 
							{
								Box4="X";
								InvalidMove = false;
							}
					}
				else if(User.equalsIgnoreCase("5"))
					{
						if ( ! Box5.equals("5"))
							{
								JOptionPane.showMessageDialog(null,"Box Already Taken");
							}
						else 
							{
								Box5="X";
								InvalidMove = false;
							}
					}
				else if(User.equalsIgnoreCase("6"))
					{
						if ( ! Box6.equals("6"))
							{
								JOptionPane.showMessageDialog(null,"Box Already Taken");
							}
						else 
							{
								Box6="X";
								InvalidMove = false;
							}
					}
				else if(User.equalsIgnoreCase("7"))
					{
						if ( ! Box7.equals("7"))
							{
								JOptionPane.showMessageDialog(null,"Box Already Taken");
							}
						else 
							{
								Box7="X";
								InvalidMove = false;
							}	
					}
				else if(User.equalsIgnoreCase("8"))
					{
						if ( ! Box8.equals("8"))
							{
								JOptionPane.showMessageDialog(null,"Box Already Taken");
							}
						else 
							{
								Box8="X";
								InvalidMove = false;
							}	
					}
				else if(User.equalsIgnoreCase("9"))
					{
						if ( ! Box9.equals("9"))
							{
								JOptionPane.showMessageDialog(null,"Box Already Taken");
							}
						else 
							{
								Box9="X";
								InvalidMove = false;
							}
					}
			}while (InvalidMove);
	}while (GameDone);
		{
			if ((Box1.equals("X")) && (Box2.equals("X")) && (Box3.equals("X")))
				{
					JOptionPane.showMessageDialog(null,"You win");
					GameDone = false;
				}
			if ((Box4.equals("X")) && (Box5.equals("X")) && (Box6.equals("X")))
				{
					JOptionPane.showMessageDialog(null,"You win");
				}
			if ((Box7.equals("X")) && (Box8.equals("X")) && (Box9.equals("X")))
				{
					JOptionPane.showMessageDialog(null,"You win");
				}
			if ((Box1.equals("X")) && (Box4.equals("X")) && (Box7.equals("X")))
				{
					JOptionPane.showMessageDialog(null,"You win");
				}
			if ((Box2.equals("X")) && (Box5.equals("X")) && (Box8.equals("X")))
				{
					JOptionPane.showMessageDialog(null,"You win");
				}
			if ((Box3.equals("X")) && (Box6.equals("X")) && (Box9.equals("X")))
				{
					JOptionPane.showMessageDialog(null,"You win");
				}
			if ((Box1.equals("X")) && (Box5.equals("X")) && (Box9.equals("X")))
				{
					JOptionPane.showMessageDialog(null,"You win");
				}
			if ((Box3.equals("X")) && (Box5.equals("X")) && (Box7.equals("X")))
				{
					JOptionPane.showMessageDialog(null,"You win");
				}
		}
	
	}
}
	

			
								
				
			
			
			
			 
			//Board = "Get Input 1-9";
			//JOptionPane.showMessageDialog(null, Board);
		
			
			//Board = "Processing: A) Validate Input";
			//JOptionPane.showMessageDialog(null, Board);
			
			//Board = "Processing: B) Validate Available Slot";
			//JOptionPane.showMessageDialog(null, Board);
			
			//Board = "Rebuild Board";
			//JOptionPane.showMessageDialog(null, Board);
					
			//Board = "Check Winner";
			//JOptionPane.showMessageDialog(null, Board);
			
			//Board = "Generate System Move";
			//JOptionPane.showMessageDialog(null, Board);
			 
			//Board = "Processing: B) Validate Available Slot";
			//JOptionPane.showMessageDialog(null, Board);
			
			//Board = "Check Winner";
			//JOptionPane.showMessageDialog(null, Board);



