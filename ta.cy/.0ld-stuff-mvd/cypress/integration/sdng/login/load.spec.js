/// <reference types="Cypress" />


describe("Load Login Page", function(){
    it("Access ITF login page", function(){
        cy
        .visit("https://itf.sdg2.mastercard.com")
        .should("have","/sdportal/home.view")
    });
});