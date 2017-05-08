package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider 
{
	Properties pro;	
	public ConfigDataProvider()
	{
		File src=new File("./Configuration/config.properties");
		try 
		{
		 FileInputStream fis=new FileInputStream(src);
		  pro=new Properties();
		  pro.load(fis);
		 
		} catch (Exception e) {
			System.out.println("Exception Is:"+e.getMessage());
		}
		
	}
	public String getaplicationurl()
	{
		String url=pro.getProperty("url");
		return url;
	}
	public String getMozillPath()
	{
		String url=pro.getProperty("mozilla");
		return url;
	}
	public String getChromePath()
	{
		String url=pro.getProperty("ChromePath");
		return url;
	}
	public String getIEPath()
	{
		String url=pro.getProperty("IEPath");
		return url;
	}

}