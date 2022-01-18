package cse212_assignment7;

public class IDMismatchException extends Exception{
	public IDMismatchException(long x){
		System.err.println("--> !! "+x+" !! is not valid for ID !!!");
	}
}
