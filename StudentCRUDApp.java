package com.studentmanagement.studentcrudapp;
import java.io.*;
import com.studentmanagement.studentcrudapp.controller.StudentController;
import com.studentmanagement.studentcrudapp.utils.DataBaseConnectionUtils;
public class StudentCRUDApp 
{
    public static void main( String[] args )throws IOException
    {
    	/*----- Creating object of Student controller ------*/
    	StudentController studentController =new StudentController();
    	studentController.studentOperation();
    	/*---- Closing connection -----*/
    	DataBaseConnectionUtils.closeConnection();
    }
}

