import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;


public class WeblogReducer extends Reducer<Text, Text, Text, Text>{
    public void reduce(Text key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
        int requestCount = 0;
        Set<String> uniqueUrls = new HashSet<>();
        int totalResponseTime = 0;

        for (Text value : values) {
            String[] fields = value.toString().split(",");
            String url = fields[0];
            String statusCode = fields[1];

            requestCount++;
            uniqueUrls.add(url);
            totalResponseTime += Integer.parseInt(statusCode);
        }

        int averageResponseTime = totalResponseTime / requestCount;

        String outputValue = "Requests: " + requestCount + ", Unique URLs: " + uniqueUrls.size() + ", Average Response Time: " + averageResponseTime;

        context.write(key, new Text(outputValue));
    }

}
