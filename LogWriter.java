package com.upgrad.ublog.utils;

import jdk.internal.access.JavaIOFileDescriptorAccess;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * TODO: 5.1. Implement writeLog() method with the following method signature.
 *  public static void writeLog(String logMessage, String path) throws IOException
 *  This method should append the log message to the log file that is stored at the
 *  Input path.
 */

public class LogWriter {

    public static void writeLog(String logMessage, String path) throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;

        try {
            pw.println();

            System.out.println(logMessage);
            pw.flush();
        } finally {
            try {

                pw.close();
            } catch (IOException io) {

            }
        }
        try (FileWriter f = new FileWriter("User.dir", true);
             BufferedWriter b = new BufferedWriter(f);
             PrintWriter p = new PrintWriter(b);) {

            p.println("appending the message into file");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}