//============================================================================
// Name        : CPPProject1.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <fstream>
#include <string>
using namespace std;

void printInput(string inputParam, string inputValue, std::ostream& jobFile){
	    cout << inputParam;
	    jobFile << inputParam;
	    cin >> inputValue;
		jobFile << inputValue << endl;
	}



int main() {
	cout << "Job Process" << endl; // prints Job Process
	string inputParam;
			string inputValue;

			string jobInviteDate;
			string jobRecruitingCompanyName;
			string jobRecruiterName;
			string jobRecruiterEmail;
			string jobTitle;
			string jobRespondDate;
			string jobAppliedDate;
			string jobApplicationConfirmDate;
			string jobApplicationStatus;
			string jobRecruiterCallDate;
			string jobInterviewDate;
			string jobInterviewStatus;
			string jobStartDate;
			ofstream jobFile;

			jobRecruiterName = jobRecruiterName.append("XXXXX");
			cout << jobRecruiterName;

			jobFile = std::ofstream("C:\\Users\\prpraramlikm\\eclipse-workspace\\cpp\\jobFile.txt", std::fstream::app);
			cout << "!!!Hello World!!!" << endl; // prints !!!Hello World!!!

			jobFile << "!!!Hello World!!!" << endl;

			cout << "Please enter Job Search data";

		    printInput("\nInvite Date : ", jobInviteDate, jobFile);
		    printInput("\nRecruiting Company Name : ", jobRecruitingCompanyName, jobFile);
		    printInput("\nRecruiter Name : ", jobRecruiterName, jobFile);
		    printInput("\nRecruiter Email : ", jobRecruiterEmail, jobFile);
		    printInput("\nCandidate Response Date : ", jobRespondDate, jobFile);
		    printInput("\nCandidate Applied Date : ", jobAppliedDate, jobFile);
		    printInput("\nJob Title : ", jobTitle,jobFile);

		    printInput("\nRecruiter Call Date :", jobRecruiterCallDate,jobFile);


		    printInput("\nJob Application Confirm Date :", jobApplicationConfirmDate,jobFile);
		    printInput("\nJob Application Status :", jobApplicationStatus,jobFile);

		    printInput("\nInterview Date :", jobInterviewDate,jobFile);
		    printInput("\nInterview Status :", jobInterviewStatus,jobFile);

		    printInput("\nJob Start Date :", jobStartDate,jobFile);


	return 0;
}
