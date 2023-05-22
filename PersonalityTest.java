import java.util.Scanner;
//This is just a test for fun, it is not an officially verified test and the result should not be taken seriously
//The result is based on the theory of cognitive functions by Carl Jung
//To find out more about your 4-letter result, simply type the 4 letters into google
import java.util.ArrayList;
public class PersonalityTest {
	public int introvertedIntuition;
	public int extravertedIntuition;
	public int introvertedSensing;
	public int extravertedSensing;
	public int introvertedFeeling;
	public int extravertedFeeling;
	public int introvertedThinking;
	public int extravertedThinking;
	public int pointsToAdd (int answer) {
		return answer-1;
	}
	public void printResult() {
		ArrayList <Integer> listOfFunctions= new ArrayList<Integer>();
		listOfFunctions.add(introvertedSensing);
		listOfFunctions.add(extravertedSensing);
		listOfFunctions.add(introvertedIntuition);
		listOfFunctions.add(extravertedIntuition);
		listOfFunctions.add(introvertedThinking);
		listOfFunctions.add(extravertedThinking);
		listOfFunctions.add(introvertedFeeling);
		listOfFunctions.add(extravertedFeeling);
		int strongestFunction=0;
		int strongestFunctionStrength=0;
		String personalityType="";
		for (int i=0; i<listOfFunctions.size(); i++) {
			for (int j=i+1; j<listOfFunctions.size(); j++) {
				if (listOfFunctions.get(i)>listOfFunctions.get(j)) {
					if (listOfFunctions.get(i)>strongestFunctionStrength) {
						strongestFunction=i;
						strongestFunctionStrength=listOfFunctions.get(i);
						break;
					}
				}
			}
		}
		switch (strongestFunction) {
		case 0:
			if (listOfFunctions.get(5)>listOfFunctions.get(7) || (listOfFunctions.get(5)==listOfFunctions.get(7)&&listOfFunctions.get(6)>listOfFunctions.get(4))) {
				personalityType="ISTJ";
			}
			else if (listOfFunctions.get(5)<listOfFunctions.get(7)|| (listOfFunctions.get(5)==listOfFunctions.get(7)&&listOfFunctions.get(6)<=listOfFunctions.get(4))) {
				personalityType="ISFJ";
			}
			break;
		case 1:
			if (listOfFunctions.get(4)>listOfFunctions.get(6) || (listOfFunctions.get(4)==listOfFunctions.get(6)&&listOfFunctions.get(7)>listOfFunctions.get(5))) {
				personalityType="ESTP";
			}
			else if (listOfFunctions.get(4)<listOfFunctions.get(6)|| (listOfFunctions.get(4)==listOfFunctions.get(6)&&listOfFunctions.get(7)<=listOfFunctions.get(5))) {
				personalityType="ESFP";
			}
			break;
		case 2:
			if (listOfFunctions.get(5)>listOfFunctions.get(7) || (listOfFunctions.get(5)==listOfFunctions.get(7)&&listOfFunctions.get(6)>listOfFunctions.get(4))) {
				personalityType="INTJ";
			}
			else if (listOfFunctions.get(5)<listOfFunctions.get(7)|| (listOfFunctions.get(5)==listOfFunctions.get(7)&&listOfFunctions.get(6)<=listOfFunctions.get(4))) {
				personalityType="INFJ";
			}
			break;
		case 3:
			if (listOfFunctions.get(4)>listOfFunctions.get(6) || (listOfFunctions.get(4)==listOfFunctions.get(6)&&listOfFunctions.get(7)>listOfFunctions.get(5))) {
				personalityType="ENTP";
			}
			else if (listOfFunctions.get(4)<listOfFunctions.get(6)|| (listOfFunctions.get(4)==listOfFunctions.get(6)&&listOfFunctions.get(7)<=listOfFunctions.get(5))) {
				personalityType="ENFP";
			}
			break;
		case 4:
			if (listOfFunctions.get(1)>listOfFunctions.get(3) || (listOfFunctions.get(1)==listOfFunctions.get(3)&&listOfFunctions.get(2)>listOfFunctions.get(0))) {
				personalityType="ISTP";
			}
			else if (listOfFunctions.get(1)<listOfFunctions.get(3)|| (listOfFunctions.get(1)==listOfFunctions.get(3)&&listOfFunctions.get(2)<=listOfFunctions.get(0))) {
				personalityType="INTP";
			}
			break;
		case 5:
			if (listOfFunctions.get(0)>listOfFunctions.get(2) || (listOfFunctions.get(0)==listOfFunctions.get(2)&&listOfFunctions.get(3)>listOfFunctions.get(1))) {
				personalityType="ESTJ";
			}
			else if (listOfFunctions.get(0)<listOfFunctions.get(2)|| (listOfFunctions.get(0)==listOfFunctions.get(2)&&listOfFunctions.get(3)<=listOfFunctions.get(1))) {
				personalityType="ENTJ";
			}
			break;
		case 6:
			if (listOfFunctions.get(1)>listOfFunctions.get(3) || (listOfFunctions.get(1)==listOfFunctions.get(3)&&listOfFunctions.get(2)>listOfFunctions.get(0))) {
				personalityType="ISFP";
			}
			else if (listOfFunctions.get(1)<listOfFunctions.get(3)|| (listOfFunctions.get(1)==listOfFunctions.get(3)&&listOfFunctions.get(2)<=listOfFunctions.get(0))) {
				personalityType="INFP";
			}
			break;
		case 7:
			if (listOfFunctions.get(0)>listOfFunctions.get(2) || (listOfFunctions.get(0)==listOfFunctions.get(2)&&listOfFunctions.get(3)>listOfFunctions.get(1))) {
				personalityType="ESFJ";
			}
			else if (listOfFunctions.get(0)<listOfFunctions.get(2)|| (listOfFunctions.get(0)==listOfFunctions.get(2)&&listOfFunctions.get(3)<=listOfFunctions.get(1))) {
				personalityType="ENFJ";
			}
			break;
		}
		System.out.println("Your personality type is " + personalityType);
	}
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Welcome to this MBTI test!\nWe will ask you a series of questions, and your answer will be a number between 1 and 5.\n1 - strongly disagree\n2 - disagree\n3 - neutral\n4 - agree\n5 - strongly agree");
		PersonalityTest MBTI= new PersonalityTest();
		System.out.println("Sometimes I find myself standing in a room wondering how I got there");
		int userAnswer=input.nextInt();
		MBTI.introvertedIntuition+=MBTI.pointsToAdd(userAnswer);
		System.out.println("I spend a lot of time completing tasks because I'm a perfectionist");
		userAnswer=input.nextInt();
		MBTI.introvertedIntuition+=MBTI.pointsToAdd(userAnswer);
		MBTI.introvertedSensing+=MBTI.pointsToAdd(userAnswer);
		System.out.println("I often feel misunderstood");
		userAnswer=input.nextInt();
		MBTI.introvertedIntuition+=MBTI.pointsToAdd(userAnswer);
		System.out.println("Whenever I lose a friend, I spend hours psychonalysing the situation in retrospect");
		userAnswer=input.nextInt();
		MBTI.introvertedIntuition+=MBTI.pointsToAdd(userAnswer);
		System.out.println("I can be forgetful");
		userAnswer=input.nextInt();
		MBTI.introvertedIntuition+=MBTI.pointsToAdd(userAnswer);
		System.out.println("I am very productive at work and I see tangible results that prove it");
		userAnswer=input.nextInt();
		MBTI.extravertedThinking+=MBTI.pointsToAdd(userAnswer);
		System.out.println("I get anxious if I haven't gotten a good result in a while");
		userAnswer=input.nextInt();
		MBTI.extravertedThinking+=MBTI.pointsToAdd(userAnswer);
		System.out.println("Instead of being with my sad/uncomfortable feelings I just get really mad");
		userAnswer=input.nextInt();
		MBTI.extravertedThinking+=MBTI.pointsToAdd(userAnswer);
		System.out.println("I get angry easily");
		userAnswer=input.nextInt();
		MBTI.extravertedThinking+=MBTI.pointsToAdd(userAnswer);
		System.out.println("I always put 100% into whatever I'm doing");
		userAnswer=input.nextInt();
		MBTI.extravertedThinking+=MBTI.pointsToAdd(userAnswer);
		System.out.println("I don't panic when there's an emergency");
		userAnswer=input.nextInt();
		MBTI.extravertedSensing+=MBTI.pointsToAdd(userAnswer);
		System.out.println("I love a good fight");
		userAnswer=input.nextInt();
		MBTI.extravertedSensing+=MBTI.pointsToAdd(userAnswer);
		System.out.println("I seek out risky situations");
		userAnswer=input.nextInt();
		MBTI.extravertedSensing+=MBTI.pointsToAdd(userAnswer);
		System.out.println("I like action movies");
		userAnswer=input.nextInt();
		MBTI.extravertedSensing+=MBTI.pointsToAdd(userAnswer);
		MBTI.extravertedIntuition+=MBTI.pointsToAdd(userAnswer);
		System.out.println("I love being outside");
		userAnswer=input.nextInt();
		MBTI.extravertedSensing+=MBTI.pointsToAdd(userAnswer);
		System.out.println("I'm a good conversationalist");
		userAnswer=input.nextInt();
		MBTI.extravertedFeeling+=MBTI.pointsToAdd(userAnswer);
		System.out.println("People don't get bored when talking to me");
		userAnswer=input.nextInt();
		MBTI.extravertedFeeling+=MBTI.pointsToAdd(userAnswer);
		System.out.println("I'm good at being nice to people in situations where I have to be nice");
		userAnswer=input.nextInt();
		MBTI.extravertedFeeling+=MBTI.pointsToAdd(userAnswer);
		System.out.println("I don't hesitate to join group conversations");
		userAnswer=input.nextInt();
		MBTI.extravertedFeeling+=MBTI.pointsToAdd(userAnswer);
		System.out.println("I make friends quickly");
		userAnswer=input.nextInt();
		MBTI.extravertedFeeling+=MBTI.pointsToAdd(userAnswer);
		System.out.println("I miss high fives a lot");
		userAnswer=input.nextInt();
		MBTI.extravertedIntuition+=MBTI.pointsToAdd(userAnswer);
		System.out.println("I was never good at PE");
		userAnswer=input.nextInt();
		MBTI.extravertedIntuition+=MBTI.pointsToAdd(userAnswer);
		System.out.println("I don't like receiving expensive gifts");
		userAnswer=input.nextInt();
		MBTI.extravertedIntuition+=MBTI.pointsToAdd(userAnswer);
		System.out.println("I don't mind being pranked");
		userAnswer=input.nextInt();
		MBTI.extravertedIntuition+=MBTI.pointsToAdd(userAnswer);
		System.out.println("I'm not mean to people");
		userAnswer=input.nextInt();
		MBTI.introvertedFeeling+=MBTI.pointsToAdd(userAnswer);
		System.out.println("I am genuinely concerned if someone else experiences a misfortune");
		userAnswer=input.nextInt();
		MBTI.introvertedFeeling+=MBTI.pointsToAdd(userAnswer);
		System.out.println("I experience emotions very intensely");
		userAnswer=input.nextInt();
		MBTI.introvertedFeeling+=MBTI.pointsToAdd(userAnswer);
		System.out.println("I like to read romance novels and watch romance on TV");
		userAnswer=input.nextInt();
		MBTI.introvertedFeeling+=MBTI.pointsToAdd(userAnswer);
		System.out.println("I daydream a lot");
		userAnswer=input.nextInt();
		MBTI.introvertedFeeling+=MBTI.pointsToAdd(userAnswer);
		System.out.println("I don't like buying expensive things");
		userAnswer=input.nextInt();
		MBTI.introvertedSensing+=MBTI.pointsToAdd(userAnswer);
		System.out.println("I don't tip much");
		userAnswer=input.nextInt();
		MBTI.introvertedSensing+=MBTI.pointsToAdd(userAnswer);
		System.out.println("I'm a neat freak");
		userAnswer=input.nextInt();
		MBTI.introvertedSensing+=MBTI.pointsToAdd(userAnswer);
		System.out.println("I love organisation and schedules");
		userAnswer=input.nextInt();
		MBTI.introvertedSensing+=MBTI.pointsToAdd(userAnswer);
		System.out.println("I get stressed easily");
		userAnswer=input.nextInt();
		MBTI.introvertedSensing+=MBTI.pointsToAdd(userAnswer);
		System.out.println("I like playing logical games like chess");
		userAnswer=input.nextInt();
		MBTI.introvertedThinking+=MBTI.pointsToAdd(userAnswer);
		System.out.println("I'm good at maths");
		userAnswer=input.nextInt();
		MBTI.introvertedThinking+=MBTI.pointsToAdd(userAnswer);
		System.out.println("I need my alone time to recharge");
		userAnswer=input.nextInt();
		MBTI.introvertedThinking+=MBTI.pointsToAdd(userAnswer);
		System.out.println("I like playing video games");
		userAnswer=input.nextInt();
		MBTI.introvertedThinking+=MBTI.pointsToAdd(userAnswer);
		System.out.println("I find it easier to talk to people online than irl");
		userAnswer=input.nextInt();
		MBTI.introvertedThinking+=MBTI.pointsToAdd(userAnswer);
		MBTI.printResult();
		input.close();
	}

}
