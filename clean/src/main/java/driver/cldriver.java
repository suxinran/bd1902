package driver;

import map.clmap;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import pojo.Clmonth;
import reduce.clreduce;

public class cldriver  {
    public static void main(String[] args) throws Exception{
        Configuration  conf = new Configuration();
        //创建任务
        Job job = Job.getInstance(conf,"clean");

        job.setJarByClass(cldriver.class);
        job.setMapperClass(clmap.class);
        job.setReducerClass(clreduce.class);
        job.setMapOutputKeyClass(Clmonth.class);
        job.setMapOutputValueClass(NullWritable.class);
        job.setOutputKeyClass(Clmonth.class);
        job.setOutputValueClass(NullWritable.class);

        //job.setNumReduceTasks(1);
        //设置输入的文件  输出文件
        FileInputFormat.setInputPaths(job, new Path("D:\\音乐\\qqq"));
        FileOutputFormat.setOutputPath(job, new  Path("D:\\音乐\\qqq\\out"));
        //提交任务
        boolean resutl = job.waitForCompletion(true);
         System.out.println(resutl?"成功":"失败");
        System.out.println("ok");
        System.exit(resutl?0:1);
    }
}
