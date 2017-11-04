<?php
	//echo "attempt to connect";
	$db = mysqli_connect('10.88.22.106','team15','team15Waves','wholesomewave')
	 or die('Error connecting to MySQL server.');
?>

<html>
   <head>
   <title>Wholesome Wave</title>
   <!--
         Wholesome Wave main web page
         Filename: enroll.php
		 -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width">
    <script src="modernizr.custom.40753.js"></script>
    <link rel="stylesheet" href="styles.css">

	</head>
<body>
<div class="container">
         <header>
		 <h1>Wholesome Wave</h1>
		 </header>
		 <nav class="sitenavigation">
			<p><a href="index.html">Home</a></p>
			<p><a href="account.html">Account Information</a></p>
		 </nav>
         <h2>Account Creation</h2>		 
	     </div>
	     <article>
		
	<dl>

		<?php
		$firstname = $_POST["1stname"];
		$lastname = $_POST["lastname"];
		$street = $_POST["street"];
		if(!empty($_POST['apartment']))
			$aptment = $_POST["apartment"];
		else
			$aptment = "";
		$city = $_POST["city"];
		$statecode = $_POST["statecode"];
		$zip = $_POST["zip"];
		$phone = $_POST["cellphone"];
		$email = $_POST["owneremail"];
		$familysize = $_POST["familysize"];
		$balance = $_POST["familysize"] * 30;
		
		$query = "insert into PATIENTS (FIRST_NAME, LAST_NAME, STREET, APARTMENT, CITY, STATE_CODE, ZIP_CODE,
				PHONE, EMAIL, FAMILY_SIZE, BALANCE)
				values('$firstname', '$lastname', '$street', '$aptment', '$city', '$statecode', '$zip', '$phone', '$email', '$familysize', '$balance')";
		$result = mysqli_query($db, $query) or die('Error querying database.');
		
		if(!$result)
			echo "Account creation failed.";
		else
			echo "Account creation successful!";

		?>