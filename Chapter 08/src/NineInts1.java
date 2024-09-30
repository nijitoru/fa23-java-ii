
public class NineInts1 {
	public static void main(String args[]) {
		int integerNum = 0;
        int integers[] = {10, 15, 19, 23, 26, 29, 31, 34, 38};
		for (int i = 0 ; i < integerNum-1; ++i)
			for (int j=0 ; j < integerNum-1; ++j)
				if (integers[j] > integers[j+1])
				{
					int org = integers[j];
					integers[j]= integers [j+1];
					integers[j+1]=org;
				}
		System.out.print("integers from first to last: ");
		for (int x=0; x<= integerNum-1; x++ )
			System.out.print(integers[x]);
		System.out.print(" integers from last to first: ");
		for (int n=0; n<= integerNum-1; n++ )
			System.out.print(integers[integerNum-(1+n)]);

	}
}
