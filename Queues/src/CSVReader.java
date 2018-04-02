import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CSVReader {
	private static int count = 0;
	public static SLLQueue<Job> readJobsFromCSV(String fileName) {
		SLLQueue<Job> jobs = new SLLQueue<>();
		Path pathToFile = Paths.get(fileName);

		// create an instance of BufferedReader
		// using try with resource, Java 7 feature to close resources
		try (BufferedReader br = Files.newBufferedReader(pathToFile,
				StandardCharsets.US_ASCII)) {

			// read the first line from the text file
			String line = br.readLine();

			// loop until all lines are read
			while (line != null) {

				// use string.split to load a string array with the values from
				// each line of
				// the file, using a comma as the delimiter
				String[] attributes = line.split(",");

				Job job = createJob(attributes);

				// adding book into ArrayList
				jobs.enqueue(job);

				// read next line before looping
				// if end of file reached, line would be null
				line = br.readLine();
			}

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		return jobs;
	}

	private static Job createJob(String[] metadata) {
		int arrivalTime = Integer.parseInt(metadata[0]);
		int remainingTime = Integer.parseInt(metadata[1]);
		count ++; // To assign the PID
		// create and return book of this metadata
		return new Job(count, arrivalTime, remainingTime);
	}

}
