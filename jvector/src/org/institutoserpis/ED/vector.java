package org.institutoserpis.ED;

public class vector {

	public static void main(String[] args) {
		int[] v = new int[] {16,12,15,14,17};
		for (int item : v)
			System.out.println(item);
		
		int index = indexOf(v,12);
		System.out.println("index="+index);	
		
	}
	
	
	public static int indexOf(int[] v, int x) {
//		int index=0;
//		while(index < v.length && v[index]!=x)
//			index++;
//			if (index == v.length)
//				return -1;
//			return index;
		for (int index=0; index < v.length; index++)
			if (v[index]==x)
				return index;
		return-1;
	}
	
	
	
	public static int min(int[] v) {
		//int i=0, min=v[1];// v[1] elegimos la posicion 1 de v
		//while(i < v.length);//v.length= numero de caracteres en v
			//if(min > v[i] ) min =v[1];
				//	min++;	
	//	int min = v[0];
	//	for(int index = 1; index < v.length; index++)
	//		if(v[index] < min)
	//			min = v[index];
	int indexOfMin =indexOfMin(v);
		
	return v[indexOfMin];
	}
	public static int indexOfMin(int[] v) {
	int indexOfMin = 0;
	for(int index = 1; index < v.length;index++) 	
		if(v[index] < v[indexOfMin]) 
			indexOfMin =index;
		return indexOfMin;	
	
	}
	private static void swap(int[] v, int indexOne, int indexTwo) {
		int aux = v[indexOne];
		v[indexOne] = v[indexTwo];
		v[indexTwo] = aux;
	}
	public static void sort(int[] v) {
		//indexOfSelected;[0, n-2]elemento seleccionado
		//indexOfMin;[indexOfSelected, n-1]posicion mas pequeña desde el elemento seleccionado
		//index; ìndexOfSelected+1, n-1]auxiliar para obtener indexOfMin
//		int n= v.length;
//		for(int indexOfSelected =0; indexOfSelected < n-1; indexOfSelected++) {
//			int indexOfMin = indexOfSelected;
//			for(int index = indexOfSelected+1; index <n; index++) //{
//				if (v[index] < v[indexOfMin]) //{
//					indexOfMin = index;	
//				//}
//			//}
//			int aux = v[indexOfSelected];
//			v[indexOfSelected] =v[indexOfMin];
//			v[indexOfMin] = aux;
//		}
	for (int index =0; index< v.length - 1; index++)
		swap(v, index, indexOfMin(v,index));
	}
	
	public static int indexOfMin(int[] v, int initialIndex) {
		int indexOfMin = initialIndex;
		for(int index = initialIndex+1; index < v.length; index++) //{
			if (v[index] < v[indexOfMin]) //{
				indexOfMin = index;	
		return indexOfMin;
	}
}
	

		