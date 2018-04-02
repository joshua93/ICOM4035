import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SLLQueue<Job> inputQueue = CSVReader.readJobsFromCSV("input.txt");

		ArrayQueue<Job> processingQueue = new ArrayQueue<>();
		ArrayList<Job> terminatedJobs = new ArrayList<>();

		int time = 0;
		float totalTime=0;

		while(!inputQueue.isEmpty() || !processingQueue.isEmpty()){
			if(!processingQueue.isEmpty()){
				processingQueue.first().isServed(1);
				if(processingQueue.first().getRemainingTime() == 0){
					processingQueue.first().setDepartureTime(time);
					terminatedJobs.add(processingQueue.dequeue());
				}
				else{
					processingQueue.enqueue(processingQueue.dequeue());
				}
			}
			if(!inputQueue.isEmpty() && (inputQueue.first().getArrivalTime() == time)){
				processingQueue.enqueue(inputQueue.dequeue());
			}

			time++;
		}


		for( Job j : terminatedJobs){
			totalTime = totalTime + j.getTotalTime();
		}
		totalTime = totalTime / terminatedJobs.size();
		System.out.println("Average Time in System is: " + totalTime);




	}




}
