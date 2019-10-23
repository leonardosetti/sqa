/// <reference types="Cypress" />

describe('Pick up a Language', function () {
    it('Land to ITF login page', function () {
        cy
            .clearCookies()
            .visit('https://itf.sdg2.mastercard.com/sdportal/home.view?cobrandHost=mastercard')

    })
    it('native DOM reference for el', function () {
        /* cy.get('select#langSelector').then(function ($select) {
                $select.val('fr').select().click({
                    force: true
                })
                //.focus('')
                ; */
        cy.get('select#langSelector').then(($el) => {
            $el.get(0)
        })

    })

});
