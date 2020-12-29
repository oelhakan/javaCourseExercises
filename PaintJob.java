public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket<=0 || extraBuckets <0){
            return -1;
        }
        double area = width*height;
        double bucketCount = area/areaPerBucket;
        double bucketCountRoundedCeilDouble = Math.ceil(bucketCount);
        int bucketCountRoundedCeilInt = (int) bucketCountRoundedCeilDouble;
        int finalValue = bucketCountRoundedCeilInt - extraBuckets;
        return finalValue;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <=0){
            return -1;
        }
        double area = width*height;
        double bucketCount = area/areaPerBucket;
        double bucketCountRoundedCeilDouble = Math.ceil(bucketCount);
        int bucketCountRoundedCeilInt = (int) bucketCountRoundedCeilDouble;
        return bucketCountRoundedCeilInt;
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        double bucketCount = area/areaPerBucket;
        double bucketCountRoundedCeilDouble = Math.ceil(bucketCount);
        int bucketCountRoundedCeilInt = (int) bucketCountRoundedCeilDouble;
        return bucketCountRoundedCeilInt;
    }

    public static void main(String[] args) {
        System.out.println("**************WIDTH - HEIGHT - AREA PER BUCKET - EXTRA BUCKET METHOD**************");
        System.out.println(getBucketCount(-3.4,2.1,1.5,2)); //-1
        System.out.println(getBucketCount(3.4,2.1,1.5,2));  //3
        System.out.println(getBucketCount(2.75,3.25,2.5,1));  //3
        System.out.println("**************WIDTH - HEIGHT - AREA PER BUCKET METHOD**************");
        System.out.println(getBucketCount(-3.4,2.1,1.5));   //-1
        System.out.println(getBucketCount(3.4,2.1,1.5));    //5
        System.out.println(getBucketCount(7.24,4.3,2.35));  //14
        System.out.println("**************AREA - AREA PER BUCKET METHOD**************");
        System.out.println(getBucketCount(3.4,1.5));     //3
        System.out.println(getBucketCount(6.26,2.2));    //3
        System.out.println(getBucketCount(3.26,0.75));   //5
    }
}
