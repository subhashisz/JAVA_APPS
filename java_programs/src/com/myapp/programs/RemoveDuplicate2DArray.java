package com.myapp.programs;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate2DArray {

	static Integer[][] test = new Integer[][] { { 1, 1, 2, 2, 3, 4, 5 }, { 1, 1, 1, 1, 1, 1, 1 }, { 1, 2, 3, 4, 5, 6, 7 },
			{ 1, 2, 1, 1, 1, 1, 1 } };

	public static Integer[][] removeDuplicate2DArray(Integer[][] matrix) {
		Integer[][] newMatrix = new Integer[matrix.length][matrix[0].length];
		int newMatrixRow = 1;

		for (int i = 0; i < matrix[0].length; i++)
			newMatrix[0][i] = matrix[0][i];

		for (int j = 1; j < matrix.length; j++) {
			List<Boolean> list = new ArrayList<>();
			for (int i = 0; newMatrix[i][0] != null; i++) {
				boolean same = true;
				for (int col = 2; col < matrix[j].length; col++) {
					if (!newMatrix[i][col].equals(matrix[j][col])) {
						same = false;
						break;
					}
				}
				list.add(same);
			}

			if (!list.contains(true)) {
				for (int i = 0; i < matrix[j].length; i++) {
					newMatrix[newMatrixRow][i] = matrix[j][i];
				}
				newMatrixRow++;
			}
		}

		int i;
		for (i = 0; newMatrix[i][0] != null; i++)
			;

		Integer finalMatrix[][] = new Integer[i][newMatrix[0].length];
		for (i = 0; i < finalMatrix.length; i++) {
			for (int j = 0; j < finalMatrix[i].length; j++)
				finalMatrix[i][j] = newMatrix[i][j];
		}

		return finalMatrix;
	}

	public static void main(String[] args) {

	}

}
