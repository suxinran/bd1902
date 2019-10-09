package reduce;

import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.Reducer;
import pojo.Clmonth;

import java.io.IOException;

public class clreduce extends Reducer<Clmonth, NullWritable, Clmonth,NullWritable> {
    @Override
    protected void reduce(Clmonth key, Iterable<NullWritable> values, Context context) throws IOException, InterruptedException {
        for (NullWritable value : values) {
            context.write(key,NullWritable.get());
        }
    }
}
