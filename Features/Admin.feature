Feature:Admin
@smoke
Scenario:  Login with valid credentil
 Given User Lanch Chrome Browser
When  User open url "https://admin-demo.nopcommerce.com/login"
And   User enter Email as "admin@yourstore.com" and password as "admin"  
 And   User click on Login button
Then  Page Title Should be "Dashboard / nopCommerce administration"
Then   close browser
 
 @sanity
 Scenario Outline:  Login Data Driven
 Given User Lanch Chrome Browser
 When  User open url "https://admin-demo.nopcommerce.com/login"
 And   User enter Email as "<email>" and password as "<password>"  
 And   User click on Login button
 Then  Page Title Should be "Dashboard / nopCommerce administration"
 Then   close browser
 Examples:
 |email															|password|
 
 |admin@yourstore.com								|admin|
 |admin@yourstore.com								|admin1|
 |admin1@yourstore.com							|admin|