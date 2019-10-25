// // Load login page for ITF environment as SDNG 
// This is a simple call for Portal SDNG Home login page using the default Cobrand

/// <reference types="Cypress" />

describe ('ITF Login Page', function(){
    it ('Check ITF URL (Default Cobrand) ', function(){
        cy
        .visit('https://itf.sdg2.mastercard.com/sdportal/home.view?cobrandHost=mastercard')
        .url().should('contain','itf')
        .url().should ('contain','cobrandHost=mastercard')
    })
})
