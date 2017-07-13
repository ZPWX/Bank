/**********************BankHR****************************/
/*银行系统流程
 * 1、插卡
 * 2、输入密码
 * 3、选择服务
 *      1、取钱
 *          输入金额
 *              吐出金额
 *                  输出余额
 *      2、查询余额
 *              查询成功
 * 4、显示余额
 * 5、退卡
 * ***************************************************/
import java.util.Scanner;
import java.io.*;
import java.sql.*;

//import java.io.EFOException;
//import java.io.SQLException;
public class BankHR{
    public static void main(String[] args)throw Throwable
    {
        int a=Integer.parseInt(args[0]);
        System.out.println("main 1");
        ma(a);
        System.out.println("main 2");
    }
    static void ma(int a){
        try{
        System.out.println("ma 1");
        mb(a);
        System.out.println("ma 2");
        }
        catch(IOException e){
            System.out.println("Catch IOException");
        }
        catch(SQLException e){
            System.out.println("Catch SQLException");
        }
        catch(Exception e){
            System.out.pritnln("Catch Exception");
        }
       /* catch(Exception e){
            System.out.println("Catch Exception");
        }*/
        System.out.println("ma 3");

    }
    static void mb(int a)throw IOException,SQLException{
        System.out.println("mb 1");
        mc(a);
        System.out.println("mb 2");

    }
    static void mc(int a)throw FileNotFoundException,EOFException,SQLException{
        System.out.println("mc 1");
        if(a==0)throw new NullPointerException(); //未检查异常
        if(a==1)throw new FileNotFoundException(); //已检查异常
        if(a==2)throw new EOFException();
        if(a==3)throw new SQLException();
        System.out.println("mc 2");
        System.out.println("mc 3");
    }
}
