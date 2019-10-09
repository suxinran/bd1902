package map;


import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import pojo.Clmonth;

import java.io.IOException;


public class clmap extends Mapper<LongWritable, Text, Clmonth, NullWritable> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String words[] = value.toString().split("\t");
        String words1[]= words[4].split(" ");
        Clmonth mt = new Clmonth();
        mt.setChannelOrderId(words[0]);
        mt.setChannelName(words[1]);
        mt.setCityName(words[2]);
        mt.setProductName(words[3]);
        mt.setUseTime(words1[0]);
        mt.setBeginAddr(words[5]);
        mt.setEndAddr(words[6]);
        mt.setCarType(words[7]);
        mt.setBrandName(words[8]);
        mt.setEstimatePrice(Double.parseDouble(words[9]));
        mt.setEstimateDistance(Double.parseDouble(words[10]));
        mt.setEstimateTimeLength(Double.parseDouble(words[11]));
        mt.setClimbTime(words[4]);
        mt.setCreateTime(words1[1]);
        context.write(mt,NullWritable.get());
    }
}

