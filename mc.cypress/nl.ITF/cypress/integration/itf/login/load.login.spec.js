// Load login page for ITF environment as SDNG 
// This is a simple call for Portal SDNG Home login page using the default Cobrand

/// <reference types="Cypress" />

describe ('Login page for SDNG HOME in ITF environment', function(){
    it ('Navigate to default URL', function(){
        cy.visit('https://itf.sdg2.mastercard.com/sdportal/home.view?cobrandHost=mastercard')
    })
})


describe ('Pick a Language', function(){
    it ('select language', function(){
        cy.get('select#langSelector').then (function(_select){
                _select.val('fr_CA')
              })
    })
})

describe ('Fill User ID Credentials', function(){
    it ('type user ID in User Id Box', function(){
        cy.get('input#userid.gwt-TextBox').type('e047475')
    })
    it ('type user password in User Password Box', function(){
        cy.get('input#password.gwt-PasswordTextBox').type('systest01')
    })
})


describe ('Access level 1',function(){
        it ('Submmit credentials to login',function(){
            cy.get('button.button.r').click()
        })
})