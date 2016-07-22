package com.finley.io;

import java.io.*;
import java.util.Date;

/**
 * Created by Lpp on 2016/3/24.
 */
/*

InputStream
    |_________________________
    |                        |
FileInputStream        FilterInputStream
                             |
                      BufferedInputStream

 Reader
  |___________________________________
  |                                  |
  InputStreamReader                 BufferedReader
  |
  |
  FileReader
*/
public class FileCopy {
    /**
     * 以字节流的方式拷贝文件
     */
    public static boolean copyFileUsingByteStream(String src, String dest) {
        FileInputStream reader = null;
        FileOutputStream writer = null;
        boolean bResult = false;
        try {
            reader = new FileInputStream(src);
            writer = new FileOutputStream(dest);
            int a;
            while ((a = reader.read()) != -1) {
                writer.write(a);
            }
            bResult = true;
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return bResult;
    }

    /**
     * 以带缓冲字节流的方式拷贝文件
     */
    public static boolean copyFileUsingBufferedByteStream(String src, String dest) {
        BufferedInputStream reader = null  ;
        BufferedOutputStream writer = null ;
        boolean bResult = false;
        try {
            reader = new BufferedInputStream(new FileInputStream(src));
            writer = new BufferedOutputStream(new FileOutputStream(dest));
            int a;
            while ((a = reader.read()) != -1) {
                writer.write(a);
            }
            bResult = true;
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return bResult;
    }

    /**
     * 字符流拷贝文件
     * */
    public static boolean copyFileUsingCharacterStream(String src, String dest) {
        FileReader reader = null;
        FileWriter writer = null;
        try {
            reader = new FileReader(src);
            writer = new FileWriter(dest);
            int a;
            while ((a = reader.read()) != -1) {
                writer.write(a);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return false;
    }

    /**
     * 带缓冲字符流拷贝文件
     * */
    public static boolean copyFileUsingBufferedCharacterStream(String src, String dest) {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new FileReader(src));
            writer = new BufferedWriter(new FileWriter(dest));
            int a;
            while ((a = reader.read()) != -1) {
                writer.write(a);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return false;
    }


    /**
     * 带缓冲字符流拷贝文件
     * */
    public static boolean copyFileUsingBufferedCharacterStream2(String src, String dest) {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new FileReader(src));
            writer = new BufferedWriter(new FileWriter(dest));
            String a;
            while ((a = reader.readLine()) != null) {
                writer.write(a);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return false;
    }
//    /**
//     * 字节流 读取文件
//     */
//    public void readfile(String src) {
//        FileInputStream reader = null;
//        try {
//            reader = new FileInputStream(src);
//            int c;
//            while ((c = reader.read()) != -1) {
//                System.out.print(c);
//            }
//        } catch (FileNotFoundException ex) {
//            System.out.println(ex.getMessage());
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        } finally {
//            if (reader != null) {
//                try {
//                    reader.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }

    public static void main(String[] args) {
        String src = "d:/study.zip" ;
        String dest = "e:/study.zip" ;

        /*字节拷贝，不带缓冲*/
        Date startTime = new Date() ;
        copyFileUsingByteStream(src,dest) ;
        Date endTime = new Date() ;
        long costMilliSeconds = endTime.getTime()-startTime.getTime() ;
        System.out.println("Copy File Using Byte Stream Without Buffer Cost " + costMilliSeconds + "ms");

        /*字符拷贝，不带缓冲*/
        startTime = new Date() ;
        copyFileUsingByteStream(src,"e:/study2.zip") ;
        endTime = new Date() ;
        costMilliSeconds = endTime.getTime()-startTime.getTime() ;
        System.out.println("Copy File Using Character Stream Without Buffer Cost " + costMilliSeconds + "ms");


        /*字节拷贝，带缓冲*/
        startTime = new Date() ;
        copyFileUsingBufferedByteStream(src,"e:/study3.zip") ;
        endTime = new Date() ;
        costMilliSeconds = endTime.getTime()-startTime.getTime() ;
        System.out.println("Copy File Using Byte Stream With Buffer,Cost " + costMilliSeconds + "ms");

        /*字符拷贝，带缓冲*/
        startTime = new Date() ;
        copyFileUsingBufferedCharacterStream(src,"e:/study4.zip") ;
        endTime = new Date() ;
        costMilliSeconds = endTime.getTime()-startTime.getTime() ;
        System.out.println("Copy File Using Character Stream With Buffer,Cost" + costMilliSeconds + "ms");


        /*字符拷贝，不带缓冲，按行读取*/
        startTime = new Date() ;
        copyFileUsingBufferedCharacterStream2(src,"e:/study5.zip") ;
        endTime = new Date() ;
        costMilliSeconds = endTime.getTime()-startTime.getTime() ;
        System.out.println("Copy File Using Character Stream With Buffer And Write One Line Once Time,Cost " + costMilliSeconds + "ms");
    }
}
