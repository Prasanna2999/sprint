Feature: Login to website

Scenario Outline: login to website
Given I want to login the website
   
   When I enter number as <phoneNumber>
   And click continue
   And enter otp
   And click verify
   Then enter into the website
   Examples: 
   |phoneNumber|
   |"8919600952"|
   |"9908511051"|
   
   Scenario: Add members
 Given I want to login the website
 When I enter number as "8919600952"
   And click continue
   And enter otp
   And click verify
   Then enter into the website
 Given When i click on profile
 When i click on manage family members
 And i click add member
 And enter details 
 Then save the details
   
   Scenario: Logging out of the website
   Given I want to login the website
   When I enter number as "8919600952"
   And click continue
   And enter otp
   And click verify
   Then enter into the website
 Given click on the profile
 When i click on logout
 Then logging out 
 
 #
 #Scenario: Add Address
 #Given I want to login the website
   #When I enter number as "9398299618"
   #And click continue
   #And enter otp
   #And click verify
   #Then enter into the website
 #Given i click on profile
 #When i click on add aress
 #And i click on add aress
 #And Enter the details
 #Then save the address 
 #
 #
 #
 Scenario: UNUTHORIZED OTP
 
   Given I want to login the website
   When I enter phonenumber as "8919600952"
   And click continue button
   And enter  wrong otp 
   And click verify button
   Then print the message
   
   #Scenario: Using the need help
   #Given I want to login the website
   #When I enter number as "8522855258"
   #And click continue
   #And enter otp
   #And click verify
   #Then enter into the website
 #Given click on the profile
 #When I click on need help
 #And choose the category 
 #And choose the issue
 #Then enter into the solution page
 Scenario: Using the need help
   Given I want to login the website
   When I enter number as "8919600952"
   And click continue
   And enter otp
   And click verify
   Then enter into the website
 Given click on the profile
 When i  click on one membership
 Then click on My Membership
 #Then click on My Transaction
 
   
   
 
 
 
  
 
   