package com.company;

public class PaintJob {

    //1.
    //write method getBucketCount eint 4 params
    // 1st param => width( double)
    //2nd => height (double)
    //3rd => areaPerBucket = area that can be covered with one buccket of paint
    //4th => extraBuckets = buckets at home
    //method returns the nr of buckets that Bob needs to buy before going to work
    // if one of the first 3 params <= 0  or extraBuckets < 0 => return -1


    public static int getBucketCount( double width, double height, double areaPerBucket, double extraBuckets) {

        if ( width > 0 && height > 0 && areaPerBucket > 0 && areaPerBucket >= 0) {
            double area = width * height;
            return (int) Math.ceil(area / areaPerBucket - extraBuckets);
        }
        return -1;
    }


    //2.
    //Bob does not like to enter 0 for extraBuckets, so:
    //write a second overloaded method named getBucketCount with 3 params (width, height, areaPerBucket)
    // returns a value of type int that represents the number of buckets needed for the paint job

    public static int getBucketCount( double width, double height, double areaPerBucket) {
        if ( width > 0 && height > 0 && areaPerBucket > 0) {
            return (int) Math.ceil(( width * height / areaPerBucket ));
        }
        return -1;
    }

}
