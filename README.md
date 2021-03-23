# Assesment
<p> Here we have both problems of the assesment </p>
<h3>Problem1</h3>
<p>As per the assesment this is a spring boot microservice to find the longest palindromic substring with specific urls for the storing and retrieving the longest palindrome</p><br>
<p><strong> Url to store: http://localhost:8080/add/longestpalindromes/{inputstring}</strong></p>
<p>This URL is a post method and it finds the longest palindromic substring adds it to the database and returns the success message, In case if the string already exists in the database than it returns a Bad request error.</p><br>

<p> <strong>Url to get palindromic substring: http://localhost:8080/get/longestpalindromes/{inputstring}</strong></p>
<p>This URL is a get method and it retrieves the longest palindromic substring from the database and returns it,In case if the string doesnot exist in the database than it returns a Bad request error.</p><br>

<h3>Problem2</h3>
<p> This is a general java program which takes the input from the command line using the scanner and finds the reversed binary's corresponding integer and returns it</p>
