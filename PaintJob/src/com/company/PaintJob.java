package com.company;

public class PaintJob {

    //write method getBucketCount eint 4 params
    // 1st param => width( double)
    //2nd => height (double)
    //3rd => areaPerBucket = area that can be covered with one buccket of paint
    //4th => extraBuckets = buckets at home
    //method returns the nr of buckets that Bob needs to buy before going to work
    // if one of the first 3 params < 0 => return -1


    public static int getBucketCount( double width, double height, double areaPerBucket, double extraBuckets) {

        if ( width > 0 && height > 0 && areaPerBucket > 0 ) {
            double area = width * height;
            return (int) Math.ceil(area / areaPerBucket - extraBuckets);
        }
        return -1;
    }

    
}
