// // Load login page for ITF environment as SDNG 
// This is a simple call for Portal SDNG Home login page using the default Cobrand

/// <reference types="Cypress" />

describe ('Login page for SDNG HOME in ITF environment', function(){
    it ('Navigate to default URL', function(){
        cy
        .visit('https://itf.sdg2.mastercard.com/sdportal/home.view?cobrandHost=mastercard')
        .should('url.contain.text','itf')
    })
})
