package pku.ss.xuxin;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.*;
 

public class word {
    public static void main(String[] args) throws Throwable {
 //   	Map<String, Integer> map3 = new HashMap<String,Integer>();
    	Set<wordcount> set3 = new TreeSet<wordcount>();
 //       try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\one.txt"));
            String s;
            StringBuffer sb = new StringBuffer();
            while ((s = br.readLine()) != null) {
                sb.append(s);
            }
            Map<String,Integer> map1 = new HashMap<String, Integer>();
            StringTokenizer st = new StringTokenizer(sb.toString(),",.! \n");
            while (st.hasMoreTokens()) {
                String letter = st.nextToken();
                int count;
                if (map1.get(letter) == null) {
                    count = 1;
                } else {
                    count = map1.get(letter).intValue() + 1;
                }
                map1.put(letter,count);
            }
            Set<wordcount> set1 = new TreeSet<wordcount>();
            for (String key : map1.keySet()) {
                set1.add(new wordcount(key,map1.get(key)));
            }
            
//            result.clear();
//            result.addAll(map1);
//            result.retainAll(map2);
//            System.out.println("交集："+result);
//
//            result.clear();
//            result.addAll(set1);
//            result.removeAll(set2);
//            System.out.println("差集："+result);
//
//            result.clear();
//            result.addAll(set1);
//            result.addAll(set2);
//            System.out.println("并集："+result);

            System.out.println("*********第一个文件中的单词数目统计*********");
            for (Iterator<wordcount> it = set1.iterator(); it.hasNext(); ) {
            	wordcount w = it.next();
                System.out.println(w);
                
            }
            System.out.println("第一个文件单词总数："+set1.size());
//        } catch (FileNotFoundException e) {
//            System.out.println("文件未找到");
//        } catch (IOException e) {
//            System.out.println("文件读异常");
//        }
    
    
    
   // try {
        BufferedReader br2 = new BufferedReader(new FileReader("D:\\two.txt"));
        String s2;
        StringBuffer sb2 = new StringBuffer();
        while ((s2 = br2.readLine()) != null) {
            sb2.append(s2);
        }
        Map<String,Integer> map2 = new HashMap<String, Integer>();
        StringTokenizer st2 = new StringTokenizer(sb2.toString(),",.! \n");
        while (st2.hasMoreTokens()) {
            String letter2 = st2.nextToken();
            int count2;
            if (map2.get(letter2) == null) {
                count2 = 1;
            } else {
                count2 = map2.get(letter2).intValue() + 1;
            }
            map2.put(letter2,count2);
        }
        Set<wordcount> set2 = new TreeSet<wordcount>();
        for (String key : map2.keySet()) {
            set2.add(new wordcount(key,map2.get(key)));
        }

        
        System.out.println("**********第二个文件中的单词数目统计********");
        for (Iterator<wordcount> it2 = set2.iterator(); it2.hasNext(); ) {
        	wordcount w2 = it2.next();
            System.out.println(w2);
            
        }
        System.out.println("第二个文件单词总数："+set2.size());
//    } catch (FileNotFoundException r) {
//        System.out.println("文件未找到");
//    } catch (IOException e) {
//        System.out.println("文件读异常");
//    }
        set3.clear();
        set3.addAll(set1);
        set3.addAll(set2);
        System.out.println("并集："+set3);
        
        set3.clear();
        set3.addAll(set1);
        set3.retainAll(set2);
        System.out.println("交集："+set3);
/**
 * 在文件1中，但不在文件2中的单词
 */
        set3.clear();
        set3.addAll(set1);
        set3.removeAll(set2);
        System.out.println("在文件1中，但不在文件2中的单词数量为"+set3.size());
        System.out.println("差集1："+set3);
     //   double ab=set3.size()/set1.size();
        int num3 = set3.size();  
        
        int num4 = set1.size();  
  
        // 创建一个数值格式化对象  
  
        NumberFormat numberFormat = NumberFormat.getInstance();  
  
        // 设置精确到小数点后2位  
  
        numberFormat.setMaximumFractionDigits(2);  
  
        String yy = numberFormat.format((float) num3 / (float) num4 * 100);
        System.out.println("在文件1中，但不在文件2中的单词数量占文件1的百分比为："+yy);
        
        /**
         * 在文件2中，但不在文件1中的单词
         */
         set3.clear();
         set3.addAll(set2);
         set3.removeAll(set1);
         System.out.println("在文件2中，但不在文件1中的单词数量为"+set3.size());
         System.out.println("差集2："+set3);
//         double ba=new Double(set3.size()/set2.size());
//         NumberFormat nf = new NumberFormat("0.00%");
//         String xx = nf.format(ba);
         int num1 = set3.size();  
         
         int num2 = set2.size();  
   
         // 创建一个数值格式化对象  
   
         NumberFormat numberFormat1 = NumberFormat.getInstance();  
   
         // 设置精确到小数点后2位  
   
         numberFormat.setMaximumFractionDigits(2);  
   
         String xx = numberFormat1.format((float) num1 / (float) num2 * 100);  
         System.out.println("在文件2中，但不在文件1中的单词数量占文件2的百分比为："+xx);

//        map3.clear();
//        map3.putAll(map1);
//        map3.putAll(map2);
//        System.out.println("#######################并集#################："+map3);
        
//        while (keys.hasNext()) {
//            String key = keys.next();
//            map3.put(key, map1.get(key)+","+map2.get(key));
//        }
//         
//        System.out.println(map3);
}
}
