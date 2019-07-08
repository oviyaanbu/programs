import java.util.*;
public class Test {
static List<Integer> permutationList = new ArrayList<>();
void printArr(int a[], int n) {
StringBuffer sb = new StringBuffer();
for (int i = 0; i < n; i++) {
sb.append(a[i]);
}
permutationList.add(Integer.valueOf(sb.toString()));
}
void heapPermutation(int a[], int size, int n) {
if (size == 1)
printArr(a, n);
for (int i = 0; i < size; i++) {
heapPermutation(a, size - 1, n);
if (size % 2 == 1) {
int temp = a[0];
a[0] = a[size - 1];
a[size - 1] = temp;
} else {
int temp = a[i];
a[i] = a[size - 1];
a[size - 1] = temp;
}
}
}
public static void main(String args[]) {
Test obj = new Test();
Scanner sc = new Scanner(System.in);
int input = sc.nextInt();
int input2 = sc.nextInt();
String temp = Integer.toString(input);
int[] a = new int[temp.length()];
for (int i = 0; i < temp.length(); i++) {
a[i] = temp.charAt(i) - '0';
}
obj.heapPermutation(a, a.length, a.length);
List<Integer> updatedPermutationList = new ArrayList<>();
for (Integer i : permutationList) {
if (i > input2) {
updatedPermutationList.add(i);
}
}
Collections.sort(updatedPermutationList);
if (!updatedPermutationList.isEmpty()) {
System.out.println(updatedPermutationList.get(0));
} else {
System.out.println("-1");
}
}
}
