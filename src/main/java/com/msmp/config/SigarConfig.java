package com.msmp.config;

import org.hyperic.sigar.Sigar;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;

import java.io.*;
import java.nio.channels.FileChannel;

/**
 * @author changxin
 * @version 1.0 2018/5/7
 * @discription 用于对sigar进行初始化的类，主要目的是将sigar需要的文件加入操作系统中
 * */
@Configuration
public class SigarConfig {
    public static Sigar sigar = initSigar();
    private static Sigar initSigar() {

        try {
            File sourceDir = ResourceUtils.getFile("classpath:source");
            String sourcePath = sourceDir.getPath().replace("\\","/");

            String jrePath = System.getProperties().getProperty("java.home");
            String jdkPath = jrePath.substring(0, jrePath.lastIndexOf("\\")).replace("\\","/") + "/bin";

            String[] filesName = sourceDir.list();
            for (String fileName : filesName) {
                File inputFile = new File(sourcePath + "/" + fileName);
                File outFile = new File(jdkPath + "/" + fileName);

                if (!outFile.exists()) {
                    copyFileUsingFileChannels(inputFile, outFile);
                }
            }

            return new Sigar();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void copyFileUsingFileChannels(File source, File dest) throws IOException {
        FileChannel inputChannel = null;
        FileChannel outputChannel = null;
        try {
            inputChannel = new FileInputStream(source).getChannel();
            outputChannel = new FileOutputStream(dest).getChannel();
            outputChannel.transferFrom(inputChannel, 0, inputChannel.size());
        } finally {
            inputChannel.close();
            outputChannel.close();
        }
    }
}
