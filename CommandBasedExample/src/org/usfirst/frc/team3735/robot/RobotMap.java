package org.usfirst.frc.team3735.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	//inner classes can be made like this to organize numbers
	public static class DriveMap{
		
		public static int leftMotor1 =		4;//4
		public static int leftMotor2 = 		5;//5
		public static int leftMotor3 = 		6;//6
		
		public static int rightMotor1 = 	10;//10
		public static int rightMotor2 = 	11;//11
		public static int rightMotor3 = 	12;//12
	}
	
	public static class GearMap{
		public static int roller = 8;
	
	}
}
