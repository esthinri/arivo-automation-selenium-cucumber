Feature: Annotation Module

Scenario: Create a New Annotation
    When I open Arivo SW
    When I sign in
    Then I digit a new annotation
     And I click in save
    Then I verify the annotation

Scenario: Delete Annotation
    When I open Arivo SW
    When I sign in
    Then I delete Annotation
