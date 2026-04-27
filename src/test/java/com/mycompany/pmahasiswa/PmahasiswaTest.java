/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.pmahasiswa;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ridho
 */
public class PmahasiswaTest {
    
    public PmahasiswaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getNama method, of class Pmahasiswa.
     */
    @Test
    void testLulus() {
        Pmahasiswa mhs = new Pmahasiswa("Budi", 75);
        assertTrue(mhs.isLulus());
    }

    @Test
    void testTidakLulus() {
        Pmahasiswa mhs = new Pmahasiswa("Andi", 50);
        assertFalse(mhs.isLulus());
    }
    
}
