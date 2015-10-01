package com.sourcebits.task2;

import java.io.*;
import java.util.*;

public class Task2 
{

	public static void main(String[] args) throws IOException
	{
		ArrayList<Collection1> arrayList = new ArrayList<Collection1>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0;i<args.length;++i)
		{
			Collection1 object = new Collection1((int)(100*Math.random()), args[i]);
			arrayList.add(object);
			System.out.println(arrayList.get(i).getId() + "     " + arrayList.get(i).getName());
		}
		System.out.println("Enter the ID which need to be removed ");
		int removeId = Integer.parseInt(br.readLine());
		int l = arrayList.size();
		for(int i=0;i<l;++i)
		{
			if(removeId == arrayList.get(i).getId())
			{
				arrayList.remove(i);
				--l;
			}
		}
		for(int i=0;i<l;++i)
		{
			System.out.println(arrayList.get(i).getId() + "     " + arrayList.get(i).getName());
		}
		for(int i=0;i<l;++i)
		{
			for(int j=0;j<l-i-1;j++)
			{
				if(arrayList.get(j).getId()>arrayList.get(j+1).getId())
				{
					int t=arrayList.get(j).getId();
					String name = arrayList.get(j).getName();
					arrayList.get(j).setId(arrayList.get(j+1).getId());	
					arrayList.get(j).setName(arrayList.get(j+1).getName());	
					arrayList.get(j+1).setId(t);	
					arrayList.get(j+1).setName(name);	
				}
					
			}
		}
		System.out.println("Ascending order");
		File file = new File("c:/newfile.txt");
		if (!file.exists()) 
		{
			file.createNewFile();
		}
		
		FileOutputStream fileOutput = new FileOutputStream(file);
		
		for(int i=0;i<l;++i)
		{
			System.out.println(arrayList.get(i).getId() + "     " + arrayList.get(i).getName());
			byte[] contentInBytes = arrayList.get(i).getName().getBytes();
			fileOutput.write(contentInBytes);
			
		}
		fileOutput.flush();
		fileOutput.close();
		
		
		

	}

}
