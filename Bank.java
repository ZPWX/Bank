/*##################BankOS###################*/
/*银行系统开发流程
 * 1、插卡
 * 2、输入金额
 * 3、选择服务
 *      1、取钱
 *         输入金额
 *              -=金额
 *      2、查询余额
 * 4、显示余额
 * 5、退卡
 * *******************************************/
import java.util.*;
import java.io.*;
import java.sql.*;

public class Bank{
    public static void main(String[] args)throw Throwabke{
        //System.out.println("please Insert Your Card!");
        int a=Integer.parseInt(args[0]); //a为密码
        int m;//总金额
        int n;//要取金额
        //int l;//剩余金额
        System.out.println("插卡");
        ma(a);
        System.out.println("");
    }
    static void ma(int a){
        System.out.println("输入金额");
        m=-l;

        try{
            System.out.println("密码错误");
            mb(a);
            System.out.println("ma 2");

        }
        catch(IOException e){
            System.out.prinltn("密码错误！");
        }
        catch(SQLException e){
            System.out.println("余额不足！");
        }
        catch(Exception e){
            System.out.println("错误！");
        }
        finally{
            System.out.println("收回卡！");
        }

        System.out.println("ma 3");
    }
    static void DrawM(int a)throw IOException{
        System.out.println("mb 1");
        mc(a);
        System.out.println("mb 2");
    }
    static void mc(int a)throw FileNotFoundException,EOFException,SQLException{
        System.out.println("mc 1");
        //if(a==0)throw new NullPointerException();
        if(a==1)throw new FileNotFoundException();
        if(a==2)throw new EOFException();
        if(a==3)throw new SQLException();
        System.out.println();
    }
}
