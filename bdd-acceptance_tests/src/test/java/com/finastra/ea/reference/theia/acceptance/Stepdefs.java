package com.finastra.ea.reference.theia.acceptance;

import cucumber.api.java.en.Given;
import com.finastra.ea.reference.theia.doctorspractice.DoctorsPracticeService;
//import com.finastra.ea.reference.theia.doctorspractice

public class Stepdefs {
    @Given("^I have a patient's full name$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        DoctorsPracticeService svc = new DoctorsPracticeService();
        // Do something
    }
}
