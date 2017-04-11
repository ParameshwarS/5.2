import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class AssgnPartitioner extends Partitioner<Text, IntWritable> {

	private static final String p1= "ABCDEF";
	private static final String p2= "GHIJKL";
	private static final String p3= "MNOPQR";
	
	@Override
	public int getPartition(Text key, IntWritable value, int arg2) {
	
		String k = key.toString().toUpperCase().substring(0, 1);
		if (p1.contains(k) ) 
		{		
				return 0;
		}
		else if (p2.contains(k))
		{
			return 1;
		}
		else if (p3.contains(k))
		{
				return 2;
		}
		else
		{
			return 3;
		}
	
	}

}