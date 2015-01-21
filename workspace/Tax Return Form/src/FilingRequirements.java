import java.util.Scanner;

public class FilingRequirements {

	public static void main(String[] args) {

		boolean repeat = true;
		while (repeat == true) {
			Scanner scanLee = new Scanner(System.in);
			System.out.println("Are you a Single Dependent or a Married Dependent?\n");
			System.out.println("Single Dependent:  0");
			System.out.println("Married Dependent: 1");
			int dependentScanner = scanLee.nextInt();

			if (dependentScanner == 0) {
				repeat = false;
				System.out.println("-----Single Dependents-----");
				System.out.println("Are you blind?");
				System.out.println("No: 0");
				System.out.println("Yes:  1");
				int blindScanner = scanLee.nextInt();
				System.out.println("-----Single Dependents-----");
				System.out.println("How old are you?");
				int ageScanner = scanLee.nextInt();
				
		//S-I-N-G-L-E ----- D-E-P-E-N-D-E-N-T-S ----- S-I-N-G-L-E ----- D-E-P-E-N-D-E-N-T-S ----- S-I-N-G-L-E ----- D-E-P-E-N-D-E-N-T-S ----- S-I-N-G-L-E ----- D-E-P-E-N-D-E-N-T-S -----S-I-N-G-L-E ----- D-E-P-E-N-D-E-N-T-S		
				//Neither blind nor over 65.
				if (blindScanner == 0 && ageScanner <= 65) {
					System.out.println("How much was your unearned income?");//1000
					System.out.print("$");
					float unearnedIncome = scanLee.nextFloat();
						if (unearnedIncome >= 1000) {
							System.out.println("You are required to file a tax return.");
						}
						else {	
							System.out.println("How much was your earned income?");//6,100
							System.out.print("$");
							float earnedIncome = scanLee.nextFloat();
							if (earnedIncome >= 6100) {
								System.out.println("You are required to file a tax return.");
							}
							else {
								System.out.println("What was your gross income?");//1000/earned income up to 5,750 + $350.
								System.out.print("$");
								float grossIncome = scanLee.nextFloat();
								float baseline = 1000;
								if (earnedIncome > 1000) {
								baseline = (earnedIncome + 350);
								}
								if (grossIncome > baseline) {
									System.out.println("You are required to file a tax return.");
								}
								else {
									System.out.println("You are not required to file a tax return.");
								}
							}
						
						}
					}
				//Blind -OR- 65+
				if (blindScanner == 01 && ageScanner <= 65|| ageScanner >= 65 && blindScanner != 1) {
					System.out.println("cats");
					System.out.println("How much was your unearned income?");//2500
					System.out.print("$");
					float unearnedIncome = scanLee.nextFloat();
						if (unearnedIncome >= 2500) {
							System.out.println("You are required to file a tax return.");
						}
						else {	
							System.out.println("How much was your earned income?");//7,600
							System.out.print("$");
							float earnedIncome = scanLee.nextFloat();
							if (earnedIncome >= 7600) {
								System.out.println("You are required to file a tax return.");
							}
							else {
								System.out.println("What was your gross income?");//2500/earned income up to 5,750 + $1850.
								System.out.print("$");
								float grossIncome = scanLee.nextFloat();
								float baseline = 2500;
								if (earnedIncome > baseline) {
								baseline = (earnedIncome + 1850);
								}
								if (grossIncome > baseline) {
									System.out.println("You are required to file a tax return.");
								}
								else {
									System.out.println("You are not required to file a tax return.");
								}
							}
						
						}
					}
				
				//Blind -AND- 65+
				if (blindScanner == 1 && ageScanner >= 65) {
					System.out.println("dogs");
						System.out.println("How much was your unearned income?");//4000
						System.out.print("$");
						float unearnedIncome = scanLee.nextFloat();
							if (unearnedIncome >= 4000) {
								System.out.println("You are required to file a tax return.");
							}
							else {	
								System.out.println("How much was your earned income?");//9,100
								System.out.print("$");
								float earnedIncome = scanLee.nextFloat();
								if (earnedIncome >= 9100) {
									System.out.println("You are required to file a tax return.");
								}
								else {
									System.out.println("What was your gross income?");//5750/earned income up to 5,750 + $350.
									System.out.print("$");
									float grossIncome = scanLee.nextFloat();
									float baseline = 4000;
									if (earnedIncome > 4000) {
									baseline = (earnedIncome + 3350);
									}
									if (grossIncome > baseline) {
										System.out.println("You are required to file a tax return.");
									}
									else {
										System.out.println("You are not required to file a tax return.");
									}
								}
							
							}
						}
				}
			if (dependentScanner == 1) {
				repeat = false;
				System.out.println("-----Single Dependents-----");
				System.out.println("Are you blind?");
				System.out.println("No: 0");
				System.out.println("Yes:  1");
				int blindScanner = scanLee.nextInt();
				System.out.println("-----Single Dependents-----");
				System.out.println("How old are you?");
				int ageScanner = scanLee.nextInt();
				
		//M-A-R-R-I-E-D ----- D-E-P-E-N-D-E-N-T-S ----- M-A-R-R-I-E-D ----- D-E-P-E-N-D-E-N-T-S ----- M-A-R-R-I-E-D ----- D-E-P-E-N-D-E-N-T-S ----- M-A-R-R-I-E-D ----- D-E-P-E-N-D-E-N-T-S ----- M-A-R-R-I-E-D ----- D-E-P-E-N-D-E-N-T-S
				//Neither blind nor over 65.
				if (blindScanner == 0 && ageScanner <= 65) {
					System.out.println("How much was your unearned income?");//1000
					System.out.print("$");
					float unearnedIncome = scanLee.nextFloat();
						if (unearnedIncome >= 1000) {
							System.out.println("You are required to file a tax return.");
						}
						else {	
							System.out.println("How much was your earned income?");//6,100
							System.out.print("$");
							float earnedIncome = scanLee.nextFloat();
							if (earnedIncome >= 6100) {
								System.out.println("You are required to file a tax return.");
							}
							else {
								System.out.println("Was your gross income at least $5 and does your spouse file a separate return and itemize deductions?");
								System.out.println("No:  0");
								System.out.println("Yes: 1");
								int spouseFiling = scanLee.nextInt();
								if (spouseFiling == 1) {
									System.out.println("You are required to file a tax return.");
								}
								else {
								System.out.println("What was your gross income?");//1000/earned income up to 5,750 + $350.
								System.out.print("$");
								float grossIncome = scanLee.nextFloat();
								float baseline = 1000;
								if (earnedIncome > 1000) {
								baseline = (earnedIncome + 350);
								}
								if (grossIncome > baseline) {
									System.out.println("You are required to file a tax return.");
								}
								else {
									System.out.println("You are not required to file a tax return.");
								}
							}
						
						}
					}
				}
				//Blind -OR- 65+
				if (blindScanner == 01 && ageScanner <= 65|| ageScanner >= 65 && blindScanner != 1) {
					System.out.println("cats");
					System.out.println("How much was your unearned income?");//2200
					System.out.print("$");
					float unearnedIncome = scanLee.nextFloat();
						if (unearnedIncome >= 2200) {
							System.out.println("You are required to file a tax return.");
						}
						else {	
							System.out.println("How much was your earned income?");//7,300
							System.out.print("$");
							float earnedIncome = scanLee.nextFloat();
							if (earnedIncome >= 7300) {
								System.out.println("You are required to file a tax return.");
							}
							else {
								System.out.println("Was your gross income at least $5 and does your spouse file a separate return and itemize deductions?");
								System.out.println("No:  0");
								System.out.println("Yes: 1");
								int spouseFiling = scanLee.nextInt();
								if (spouseFiling == 1) {
									System.out.println("You are required to file a tax return.");
								}
								else {
								System.out.println("What was your gross income?");//2500/earned income up to 5,750 + $1850.
								System.out.print("$");
								float grossIncome = scanLee.nextFloat();
								float baseline = 2200;
								if (earnedIncome > baseline) {
								baseline = (earnedIncome + 1550);
								}
								if (grossIncome > baseline) {
									System.out.println("You are required to file a tax return.");
								}
								else {
									System.out.println("You are not required to file a tax return.");
								}
							}
						
						}
					}
				}
				//Blind -AND- 65+
				if (blindScanner == 1 && ageScanner >= 65) {
					System.out.println("dogs");
						System.out.println("How much was your unearned income?");//3400
						System.out.print("$");
						float unearnedIncome = scanLee.nextFloat();
							if (unearnedIncome >= 3400) {
								System.out.println("You are required to file a tax return.");
							}
							else {	
								System.out.println("How much was your earned income?");//8,500
								System.out.print("$");
								float earnedIncome = scanLee.nextFloat();
								if (earnedIncome >= 8500) {
									System.out.println("You are required to file a tax return.");
								}
								else {
									System.out.println("Was your gross income at least $5 and does your spouse files a separate return and itemize deductions?");
									System.out.println("No:  0");
									System.out.println("Yes: 1");
									int spouseFiling = scanLee.nextInt();
									if (spouseFiling == 1) {
										System.out.println("You are required to file a tax return.");
									}
									else {
									System.out.println("What was your gross income?");//5750/earned income up to 5,750 + $350.
									System.out.print("$");
									float grossIncome = scanLee.nextFloat();
									float baseline = 3400;
									if (earnedIncome > 3400) {
									baseline = (earnedIncome + 2750);
									}
									if (grossIncome > baseline) {
										System.out.println("You are required to file a tax return.");
									}
									else {
										System.out.println("You are not required to file a tax return.");
									}
								}
							
							}
						}
					}
				}
			}
		}
	}
