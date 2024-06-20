import  org.apache.hadoop.io.*;
import java.io.IOException;
import org.apache.hadoop.mapreduce.Mapper;


public class WeblogMapper extends Mapper<LongWritable, Text, Text, Text>{
    public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String line = value.toString();
        String[] fields = line.split(" ");
        String ipAddress = fields[0];
        String timestamp = fields[3] + " " + fields[4];
        String url = fields[6];
        String statusCode = fields[8];

        String outputKey = ipAddress + "_" + timestamp;
        String outputValue = url + "," + statusCode;

        context.write(new Text(outputKey), new Text(outputValue));
    }
    }
