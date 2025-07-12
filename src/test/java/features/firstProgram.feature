Feature: UI Automation on Rahul Shetty Academy Practice Page

  Background:
    Given I navigate to the automation practice page

  @RadioButtons
  Scenario: Select each radio button
    When I select "radio1" option
    Then "radio1" should be selected

    #When I select "Radio2" option
    #Then "Radio2" should be selected

  #@StaticDropdown
  #Scenario: Select an option from static dropdown
    #When I select "Option2" from the dropdown
    #Then the selected option should be "Option2"
#
  #@CheckBoxes
  #Scenario: Verify checkboxes functionality
    #When I select the checkboxes "Option1" and "Option3"
    #Then those checkboxes should be selected
    #When I deselect the checkbox "Option1"
    #Then "Option1" checkbox should not be selected
#
  #@AutoSuggest
  #Scenario: Select a country using autosuggest
    #When I type "Ind" in the autosuggest field
    #And I select "India" from the suggestions
    #Then the selected country should be "India"

  @SwitchWindow
  Scenario: Switch to new window and verify
    When I click on "Open Window"
    Then I switch to the new window
    And the window title should contain "Rahul Shetty"
    Then I close the new window and return to parent

  @SwitchTab
  Scenario: Switch to new tab and verify
    When I click on Open Tab
    Then I switch to the new tab
    And the tab URL should contain email
    Then I close the tab and return to parent

  #@IFrame
  #Scenario: Interact with iframe content
    #When I switch to iframe
    #And I click on "Courses" inside iframe
    #Then I switch back to main content
#
  #@MouseHover
  #Scenario: Hover on element and click option
    #When I hover over the "Mouse Hover" button
    #And I click on the "Top" option
    #Then I should be navigated to the top of the page
#
  #@Alerts
  #Scenario: Handle alert and confirm dialogs
    #When I enter "John" in the name field
    #And I click on "Alert" button
    #Then alert text should be "Hello John, share this practice page..."
    #And I accept the alert
#
    #When I click on "Confirm" button
    #Then confirm dialog should appear
    #And I dismiss the confirm alert
#
  #@ElementVisibility
  #Scenario: Show and hide textbox
    #When I click on "Hide" button
    #Then the textbox should not be visible
    #When I click on "Show" button
    #Then the textbox should be visible
#
  #@WebTable
  #Scenario: Validate content in web table
    #Then the price for "Python" course should be "25"
#
  #@Scroll
  #Scenario: Scroll to table using JavaScript
    #When I scroll down to the web table
    #Then I should see the table header as "Course"
#
  #@Synchronization
  #Scenario: Wait for auto-suggest dropdown
    #When I type "Uni" in the autosuggest field
    #Then I wait until "United States" appears and select it
#
