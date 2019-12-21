package com.arrays.pkg;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiDeminesionalArray {

	public static void main(String[] args)
			throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("Get me the no of records want to insert ::");
		int i = Integer.parseInt(br.readLine());

		class Student {
			int studentId;
			String studentName;
			int[] subject = new int[5];
		}

		Student student = new Student();

		Student[] studentArray = new Student[i];
		for (int i1 = 0; i1 < i; i1++) {
			student = new Student();
			System.out.println("Please enter ID for student " + (i1 + 1));
			student.studentId = Integer.parseInt(br.readLine());
			System.out.println("Please enter NAME for " + i + " student");
			student.studentName = br.readLine();
			for (int k = 0; k < 5; k++) {
				System.out.println("Please enter " + k + " subject marks");
				student.subject[k] = Integer.parseInt(br.readLine());
			}
			studentArray[i1] = student;
		}

		System.out.println("Enter the StudentID you want to search !!");
		int input = Integer.parseInt(br.readLine());
		for (int j = 0; j < i; j++) {
			if (input == studentArray[j].studentId) {
				System.out
						.println("Student ID  :: " + studentArray[j].studentId);
				System.out.println(
						"Student Name  :: " + studentArray[j].studentName);
				int avg = 0;
				for (int k = 0; k < studentArray[j].subject.length; k++) {
					avg += studentArray[j].subject[k];
				}
				System.out.println("Student Marks avg.  :: "
						+ (avg / studentArray[j].subject.length));

			}
		}

	}

}
