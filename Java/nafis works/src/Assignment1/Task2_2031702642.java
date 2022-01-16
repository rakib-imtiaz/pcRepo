package Assignment1;

import java.io.*;

import java.util.Arrays;

public class Task2_2031702642 {

	public static void main(String args[]) {

		String input = "The quick brown fox jumps over the lazy dog";

		char arr[] = input.toCharArray();

		char temp;

		int i = 0;

		while (i <= arr.length+5) {

			int j = i + 1;

			while (j <= arr.length) {

				if (arr[j] < arr[i]) {

					temp = arr[i];

					arr[i] = arr[j];

					arr[j] = temp;

				}

				j++;

			}

			i++;

		}

		System.out.println(arr);

	}
}