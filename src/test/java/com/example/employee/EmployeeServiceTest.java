package com.example.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeServiceTest {

    @Test
    void testGetEmployee() {
        EmployeeService service = new EmployeeService();

        assertEquals(
            "Employee API updated after collaboration",
            service.getEmployee()
        );
    }
}
