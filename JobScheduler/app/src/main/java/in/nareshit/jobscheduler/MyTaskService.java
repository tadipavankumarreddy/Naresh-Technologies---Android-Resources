package in.nareshit.jobscheduler;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.widget.Toast;

public class MyTaskService extends JobService {

    // This is the method in which we can define the task that we want to run
    // this method is called by the system when the specified conditions are met
    // This method returns true if the work is off-loaded
    // This method returns false if the work is finished
    @Override
    public boolean onStartJob(JobParameters jobParameters) {
        Toast.makeText(this, "JOB STARTED AND FINISHED", Toast.LENGTH_SHORT).show();
        return false;
    }

    // This method is called by the system when the task is cancelled during the execution
    @Override
    public boolean onStopJob(JobParameters jobParameters) {
        Toast.makeText(this, "JOB STOPPED FOR CONDITIONS NOT MEETING AFTER SCHEDULING!", Toast.LENGTH_SHORT).show();
        return false;
    }
}
