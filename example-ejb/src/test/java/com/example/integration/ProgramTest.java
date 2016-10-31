package com.example.integration;

import com.example.dao.ProgramDao;
import com.example.entities.Program;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by jhenaoz on 10/30/16.
 */
public class ProgramTest {

    @Test
    public void testProgramCreation(){
        //1 Arrange
        ProgramDao programDao = new ProgramDao();
        Program program = new Program("test");
        //2 Act
        programDao.createProgram(program);
        //3 Assert
        assertEquals("test", program.getName());
        assertNotEquals(0, program.getName());
    }
}
