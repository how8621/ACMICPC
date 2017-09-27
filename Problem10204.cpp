#include <iostream>
using namespace std;

int main() {
	int n;
	cin >> n;
	int scoreY[9];
	int scoreK[9];
	int sumY = 0, sumK = 0;
	string result[n];
	
	for(int i=0; i<n; i++) {
		for(int j=0; j<9; j++) {
			cin >> scoreY[j] >> scoreK[j];
			sumY += scoreY[j];
			sumK += scoreK[j];
		}
		if(sumY > sumK) result[i] = "Yonsei";
		else if(sumY < sumK) result[i] = "Korea";
		else result[i] = "Draw";
	}
	
	for(int i=0; i<n; i++) {
		cout << result[i] << endl;
	}
	
	
	return 0;
}
