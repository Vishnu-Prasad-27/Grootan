package com.storydetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StoryDAO {
	Connection con=null;
	static int serialNumber=1;
	PreparedStatement preparedStatement=null;
	public String uploadStory(StoryDetails sd) {
		String by=sd.getBy();
		String name=sd.getStoryname();
		String type=sd.getType();
		String story=sd.getStory();
		try {
			con=DBConnection.createConnection();
			String query="insert into Story_Collection(Author,StoryName,Type,Story)values(?,?,?,?)";
			preparedStatement=con.prepareStatement(query);
			preparedStatement.setString(1, by);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, type);
			preparedStatement.setString(4, story);
			
			int i=preparedStatement.executeUpdate();
			if(i!=0)
				return "SUCCESS";
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return "OOPS...Something went wrong!!!";
	}
	
}
