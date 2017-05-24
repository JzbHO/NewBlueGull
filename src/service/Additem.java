package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Additem {
	
	
	
	
	
	public static void addItem(String path) throws IOException{
		String line1;
		int begin=0;
		int end=0;
		String Allitem="";
		FileReader fw=new FileReader(path);
		BufferedReader br=new BufferedReader(fw);
		
		String [] SELECTITEM=new String[2];
		String []Line;
		
		int i=0;
		
		int ch=0;
		while((ch=fw.read())!=-1){
			//while(br.readLine()!=null)
			
			String s=br.readLine();
			if(s.substring(3, 6).equals("单选题")){
				 Line=analyse(s);
				 SELECTITEM[0]=br.readLine();
				 
				 String options=null;
				 String s2=br.readLine();
				while(!s2.isEmpty()){
					options+=s2;
					s2=br.readLine();
					
				}
				 SELECTITEM[1]=options;
			
			}
//			}else if(s.substring(4, 7).equals("多选题")){
//				
//			}
				else if(s.substring(4, 7).equals("判断题")){
					analyse(s);
			}
//				
//				else if(s.substring(4, 7).equals("简答题")){
//				
//			}
			
			
//		}
//		for(int m=0;m<ITEM.length;m++){
//			for(int n=0;n<ITEM[m].length;n++)
//				System.out.print(ITEM[m][n]);	
//			System.out.println();
//		}
		
		}
		
	}
	public static String[] analyse(String s){
		String [] cursor=new String [5];
		int p=0;
		for(int j=0;j<s.length();j++){
			for(int i=j;i<s.length();i++)
				if(s.charAt(j)==':'&&s.charAt(i)==')'&&(j+1)<s.length()){
					cursor[p]=s.substring(j+1,i);
					p++;
					j=i;
					
				}
		}
		for(String one:cursor){
			System.out.print(one+"    ");
		}
		return cursor;
		
	}
	public static void main(String[] args) throws IOException{
		//Additem m=new Additem();
		//m.analyse("(题型:单选题)(标准答案:A)(分数:5)(试题分类:Java开发工程师)(试题分析:无)");
		addItem("E:\\newME\\Project\\BuleGull\\informations.txt");
		
		
	}

}
