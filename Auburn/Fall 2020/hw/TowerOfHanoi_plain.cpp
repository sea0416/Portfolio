/*
 * Midterm Exam 2
 * Software Construction COMP2710
 * Instructor: Xuechao Li @ Auburn University
 * Name : Haegang Yang
 * Compile : g++ TowerOfHanoi_plain.cpp -o TowerOfHanoi_plain.out
 */

#include<iostream>
#include<time.h>
using namespace std;
//Counter of seconds
int count = 0;

void moveOneDisk(int disk, char startPeg, char endPeg) {
	count++;
	cout << "Move Disk " << disk << " from " << startPeg << " to " << endPeg << endl;
}
// tower of HANOI function implementation
void moveDisk(int numDisks, char startPeg, char tempPeg, char endPeg)
{ 
// when there just one disk
	if (numDisks == 1) {
		moveOneDisk(numDisks, startPeg, endPeg);
	} 
	//when there are more than one disk
	else {
		moveDisk(numDisks-1, startPeg, endPeg, tempPeg);
		moveOneDisk(numDisks, startPeg, endPeg);
		moveDisk(numDisks-1, tempPeg, startPeg, endPeg);
	}
}

// main program
int main()
{ 
	int n;
    time_t start, end;

	cout << "Enter the number of disks:";
	cin >> n;

	// calling the moveDisk
    time (&start);
	moveDisk(n, 'A', 'B', 'C');
	time (&end);

    double elapse = difftime (end, start);
    cout << "The elapsed time is " << elapse << " seconds" << " for moving " << n << " disks " << endl;

	return 0;
}
