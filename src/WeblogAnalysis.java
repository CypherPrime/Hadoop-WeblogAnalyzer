
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class WeblogAnalysis {
    public static void main(String[] args) throws Exception {
        Configuration conf = new Configuration();
        Job job = Job.getInstance(conf, "Weblog Analysis");
        job.setJarByClass(WeblogAnalysis.class);

        // Set Mapper and Reducer classes
        job.setMapperClass(WeblogMapper.class);
        job.setReducerClass(WeblogReducer.class);

        // Set input and output paths
//        FileInputFormat.addInputPath(job, new Path(args[0]));
//        FileOutputFormat.setOutputPath(job, new Path(args[1]));

        // Set the input and output paths directly
        FileInputFormat.addInputPath(job, new Path("./../datasets/NASA_access_log_Aug95"));
        FileOutputFormat.setOutputPath(job, new Path("./../output"));

        // Set output key and value types
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(Text.class);

        // Submit the job and wait for completion
        System.exit(job.waitForCompletion(true) ? 0 : 1);
    }
}