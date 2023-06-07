/*
 * @Retention is also a meta-annotation that comes with some retention policies. 
 * These retention policies determine at which point an annotation is discarded.
 *  There are three types of retention policies: SOURCE, CLASS, and RUNTIME.
 * RetentionPolicy.SOURCE: The annotations annotated using the SOURCE retention policy are discarded at runtime.
RetentionPolicy.CLASS: The annotations annotated using the CLASS retention policy are recorded in the .class file but are discarded during runtime. CLASS is the default retention policy in Java.
RetentionPolicy.RUNTIME: The annotations annotated using the RUNTIME retention policy are retained during runtime and can be accessed in our program during runtime.

 */

import java.lang.annotation.Retention;

import java.lang.annotation.RetentionPolicy;


class RetentionAnnotation {
    public static void main(String[] args) {

    }
}

@Retention(RetentionPolicy.RUNTIME) // retained during runtime and can be accessed in our program during runtime

@java.lang.SuppressWarnings("unused") 

@interface Duck {

}
