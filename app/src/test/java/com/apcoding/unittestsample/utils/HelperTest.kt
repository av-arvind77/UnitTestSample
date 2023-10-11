package com.apcoding.unittestsample.utils

import org.junit.After
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class HelperTest {
    lateinit var helper: Helper

    @Before
    fun setUp() {
        /** Repeated should be written here so that it executes before executing our test cases **/
        helper = Helper()
        println("BEFORE EVERY TEST CASE")
    }

    @After
    fun tearDown() {
        println(" AFTER EVERY TEST CASE ")
    }

    @Test
    fun isPalindrome() {
        // Arrange

        // Act
        val result = helper.isPalindrome("Hello")

        // Assert
        /** Use to assert value that is expected one value and result. **/
        assertEquals(false, result)
    }

    @Test
    fun isPalindrome_InputString_Level_ExpectedTrue() {
        // Arrange
        // Act
        val result = helper.isPalindrome("level")

        // Assert
        /** Use to assert value that is expected one value and result. **/
        assertEquals(true, result)
    }
}