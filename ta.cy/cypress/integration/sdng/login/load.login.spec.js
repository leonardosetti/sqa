/// <reference types="Cypress" />

describe("Basic Load Login Page", function () {
    it("Call main Login Page for ITF environment", function () {
        cy
            .visit("https://itf.sdg2.mastercard.com/sdportal/home.view")    
            .pause()

    });

});