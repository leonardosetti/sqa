// Load login page for ITF environment as SDNG 
// This is a simple call for Portal SDNG Home login page using the default Cobrand

/// <reference types="Cypress" />

describe('Check Default Cobrand URL Health', function () {
    it('Navigate to default URL', function () {
        cy
        .clearCookie()
        .clearCookies()
        .clearLocalStorage()
        .visit('https://itf.sdg2.mastercard.com/sdportal/home.view?cobrandHost=mastercard')
    })
})



/* describe('Pick a Language', function () {
    it('select language', function () {
cy.get('select#langSelector')

.select('fr').should('have.value','fr')
    })
}) */
/* 
describe('Fill User ID Credentials', function () {
    it('type user ID in User Id Box', function () {
        cy.get('input#userid.gwt-TextBox').type('e047475')
    })
    it('type user password in User Password Box', function () {
        cy.get('input#password.gwt-PasswordTextBox').type('systest01')
                })
}) */


describe('Access level 1', function () {
    it('Submmit credentials to login', function ()  {
        cy
            .get().xpath('//*[@id="login-module"]/form/div/div[5]/div/button').click()



    })
})



/* describe ('Access to Accept Cookies page', function(){
it ('Access next page Cookies Conscent', function(){
    cy.get('#continue-button').click()
})
}) */