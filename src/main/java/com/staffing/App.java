package com.staffing;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

import org.hibernate.type.DateType;
import java.sql.SQLData;

import com.model.Candidates;
import com.model.Clients;
import com.model.Contracts;
import com.model.Interviews;
import com.model.Jobs;
import com.model.Payments;
import com.model.Placements;
import com.model.Submissions;
import com.staffing.service.*;
import com.staffing.serviceImpl.*;

@SuppressWarnings("unused")
public class App {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CandidatesService candidateService = new CandidatesServiceImpl();
        ClientsService clientService = new ClientsServiceImpl();
        ContractsService contractService = new ContractsServiceImpl();
        InterviewsService interviewService = new InterviewsServiceImpl();
        JobsService jobService = new JobsServiceImpl();
        PaymentsService paymentService = new PaymentsServiceImpl();
        PlacementsService placementService = new PlacementsServiceImpl();
        SubmissionsService submissionService = new SubmissionsServiceImpl();
        
        int choice;
        String input;
        
            System.out.println("Welcome to Staffing Management System,\n Hope you had a great day.\n");
            System.out.println("1. Insert Candidate Details");
            System.out.println("2. Insert Client Details");
            System.out.println("3. Insert Contract Details");
            System.out.println("4. Insert Interview Details");
            System.out.println("5. Insert Job Details");
            System.out.println("6. Insert Payments Details");
            System.out.println("7. Insert Placement Details");
            System.out.println("8. Insert Submission Details");
            System.out.println("0. Exit\n");
            System.out.print("Enter your choice: ");
            input = scanner.nextLine();
            
            if (input.matches("\\d+")) {
                choice = Integer.parseInt(input);

                switch (choice) {
                    case 1: 
                        System.out.println("Enter Candidate ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine(); 
                        System.out.println("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.println("Enter Email: ");
                        String email = scanner.nextLine();
                        System.out.println("Enter Phone: ");
                        String phone = scanner.nextLine();
                        System.out.println("Enter Skills: ");
                        String skills = scanner.nextLine();
                        System.out.println("Enter Experience: ");
                        int experience = scanner.nextInt();
                        scanner.nextLine(); 
                        System.out.println("Enter Resume: ");
                        String resume = scanner.next();
                        scanner.nextLine(); 
                        
                        Candidates cndt=new Candidates();
                        cndt.setCandidateID(id);
                        cndt.setEmail(email);
                        cndt.setExperience(experience);
                        cndt.setName(name);
                        cndt.setPhone(phone);
                        cndt.setResume(resume);
                        cndt.setSkills(skills);

                       candidateService.insertCandidates(cndt);

                        System.out.println("Candidate inserted successfully.");
                        break;
                        
                    	case 2:
                    	System.out.println("Enter ClientID: ");
                    	int cid=scanner.nextInt();
                    	scanner.nextLine();
                    	System.out.println("Enter CompanyName: ");
                    	String cname=scanner.next();
                    	scanner.nextLine();
                    	System.out.println("Enter Contact of Recruiter Name");
                    	String ccon=scanner.next();
                    	scanner.nextLine();
                    	System.out.println("Enter Email of Recruiter: ");
                    	String cemail=scanner.next();
                    	scanner.nextLine();
                    	System.out.println("Enter Phone Number of Recruiter: ");
                    	String cphone=scanner.next();
                    	scanner.nextLine();
                    	System.out.println("Enter Client Address: ");
                    	String caddress=scanner.next();
                    	scanner.nextLine();
                    	
                    	Clients clnt=new Clients();
                    	clnt.setAddress(caddress);
                    	clnt.setClientID(cid);
                    	clnt.setCompanyname(cname);
                    	clnt.setContactperson(ccon);
                    	clnt.setEmail(cemail);
                    	clnt.setPhone(cphone);
                    	
                    	clientService.insertClients(clnt);
                    	
                    	System.out.println("Clients inserted successfully.");
                    	break;
                    	
                    case 3:
                    	System.out.println("Enter ContractID");
                    	int conid=scanner.nextInt();
                    	scanner.nextLine();
                    	System.out.println("Enter ClientID");
                    	int cnid=scanner.nextInt();
                    	scanner.nextLine();
                    	System.out.println("Enter StartDate");
                    	int sdate=scanner.nextInt();
                    	scanner.nextLine();
                    	System.out.println("Enter EndDate");
                    	int sdate1=scanner.nextInt();
                    	scanner.nextLine();
                    	System.out.println("Enter Terms");
                    	String terms=scanner.next();
                    	scanner.nextLine();
                    	System.out.println("Enter Status");
                    	String cstatus=scanner.next();
                    	scanner.nextLine();
                    	
                    	Contracts cnts = new Contracts();
                    	cnts.setContractID(conid);
                    	cnts.setClientID(cnid);
                    	cnts.StartDate(sdate1);
                    	cnts.setEndDate();
                    	cnts.setTerms(terms);
                    	cnts.setStatus(cstatus);
                    	
                    	contractService.insertContracts(cnts);
                    	
                    	System.out.println("Contracts inserted successfully.");
                    	break;
                    case 4:
                    	System.out.println("Enter InterviewID");
                    	int intid=scanner.nextInt();
                    	scanner.nextLine();
                    	System.out.println("Enter CandidateID");
                    	int canid=scanner.nextInt();
                    	scanner.nextLine();
                    	System.out.println("Enter JobID");
                    	int jid=scanner.nextInt();
                    	scanner.nextLine();
                    	System.out.println("Enter InterviewDate");
                    	int idate=scanner.nextInt();
                    	scanner.nextLine();
                    	System.out.println("Enter Interviewer");
                    	String intname=scanner.next();
                    	scanner.nextLine();
                    	System.out.println("Enter Interview Location");
                    	String intloc=scanner.next();
                    	scanner.nextLine();
                    	System.out.println("Enter Feedback of Interview");
                    	String fedint=scanner.next();
                    	scanner.nextLine();
                    	System.out.println("Enter Status of Interview");
                    	String staint=scanner.next();
                    	scanner.nextLine();
                    	
                    	Interviews intw = new Interviews();
                    	intw.setInterviewID(intid);
                    	intw.setInterviewDate(idate);
                    	intw.setInterviewer(intname);
                    	intw.setInterviewLocation(intloc);
                    	intw.setFeedback(fedint);
                    	intw.setStatus(staint);
                    	
                    	interviewService.insertInterviews(intw);
                    	
                    	System.out.println("Interviews inserted successfully.");
                    	break;
                    case 5:
                    	System.out.println("Enter JobID");
                    	int jobid=scanner.nextInt();
                    	scanner.nextLine();
                    	System.out.println("Enter Tittle");
                    	String jobtitle=scanner.next();
                    	scanner.nextLine();
                    	System.out.println("Enter Description");
                    	String des=scanner.next();
                    	scanner.nextLine();
                    	System.out.println("Enter Skills");
                    	String ski=scanner.next();
                    	scanner.nextLine();
                    	System.out.println("Enter Experience Required");
                    	String exre=scanner.next();
                    	scanner.nextLine();
                    	System.out.println("Enter Salary Range");
                    	String salrange=scanner.next();
                    	scanner.nextLine();
                    	System.out.println("Enter Location of Client");
                    	String cliloc=scanner.next();
                    	scanner.nextLine();
                    	System.out.println("Enter Status of Client");
                    	String clista=scanner.next();
                    	scanner.nextLine();
                    	
                    	Jobs jbs = new Jobs();
                    	jbs.setJobID(jobid);
                    	jbs.setTitle(jobtitle);
                    	jbs.setDescription(des);
                    	jbs.setSkillsRequired(ski);
                    	jbs.setExperienceRequired(exre);
                    	
                    	jobService.insertJobs(jbs);
                    	
                    	System.out.println("Jobs inserted successfully.");
                    	break;
                    case 6:
                    	System.out.println("Enter PaymentID");
                    	int payid=scanner.nextInt();
                    	scanner.nextLine();
                    	System.out.println("Enter ContractID");
                    	int coid=scanner.nextInt();
                    	scanner.nextLine();
                    	System.out.println("Enter Payment Due Date");
                    	int payduedate=scanner.nextInt();
                    	scanner.nextLine();
                    	System.out.println("Enter Amount");
                    	int amt=scanner.nextInt();
                    	scanner.nextLine();
                    	System.out.println("Enter Payment Method for payment");
                    	String pm=scanner.next();
                    	scanner.nextLine();
                    	System.out.println("Enter Status of Payment");
                    	String stapay=scanner.next();
                    	scanner.nextLine();
                    	System.out.println("Enter Status");
                    	String sta=scanner.next();
                    	scanner.nextLine();
                    	
                    	Payments p = new Payments();
                    	p.setPaymentID(payid);
                    	p.setContractID(coid);
                    	p.setPaymentDate(payduedate);
                    	p.setAmount(amt);
                    	p.setPaymentMethod(input);
                    	p.setStatus(sta);
                    	
                    	paymentService.insertPayments111(p);
                    	
                    	System.out.println("Payments inserted successfully.");
                    	break;
                    case 7:
                    	System.out.println("Enter PlacementID: ");
                    	int plid=scanner.nextInt();
                    	scanner.nextLine();
                    	System.out.println("Enter CandidateID");
                    	int caid=scanner.nextInt();
                    	scanner.nextLine();
                    	System.out.println("Enter JobID");
                    	int joid=scanner.nextInt();
                    	scanner.nextLine();
                    	System.out.println("Enter PlacementDate ('YYYY-MM-DD')");
                    	String pdString = scanner.nextLine(); // Read the date input as a string
                        LocalDate pd = LocalDate.parse(pdString);
                    	System.out.println("Enter ClientID");
                    	int cid1=scanner.nextInt();
                    	scanner.nextLine();
                    	System.out.println("Enter ContractID");
                    	int contid=scanner.nextInt();
                    	scanner.nextLine();
                    	System.out.println("Enter SalaryOffered");
                    	BigDecimal sal=scanner.nextBigDecimal();
                    	scanner.nextLine();
                    	System.out.println("Enter Status");
                    	String stat=scanner.next();
                    	scanner.nextLine();
                    	
                    	Placements pl = new Placements();
                    	pl.setPlacementId(contid);
                    	pl.setPlacementDate(pd);
                    	pl.setSalaryOffered(sal);
                    	pl.setStatus(stat);
                    	
                    	placementService.insertPlacement(pl);
                    	
                    	System.out.println("Placements inserted successfully.");
                    	break;
                    case 8:
                        System.out.println("Enter SubmissionID");
                        int sid = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter CandidateID");
                        int cid11 = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter JobID");
                        int jid1 = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter SubmissionDate (YYYY-MM-DD):"); // Prompt the user for the date format
                        String subdate = scanner.nextLine(); // Read the date input as a string
                        LocalDate pd1 = LocalDate.parse(subdate);
                        System.out.println("Enter Status");
                        String sts = scanner.next();
                        scanner.nextLine();
                        
                        Submissions subs = new Submissions();
                        subs.setSubmissionId(sid);
                        subs.setCandidateID(cid11);
                        subs.setJobID(jid1);
                        subs.setSubmissionDate(submissionService); // Set the converted java.sql.Date object
                        subs.setStatus(sts);
                        
                        submissionService.insertSubmissions(subs);
                        
                        System.out.println("Submissions inserted successfully.");
                        break;


                    case 0:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } else {
                System.out.println("Please enter a valid option.");
                choice = -1;
            }
        
        scanner.close();
    }

	
}
