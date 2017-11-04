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
         <h2>Renew balance</h2>		 
	     </div>
	     <article>
		
		<?php
		$account = $_POST["account"];
		$term = $_POST["term"];
		
		$query = "select FAMILY_SIZE, BALANCE from patients where ACCOUNT_NUM = '$account'";
		
		$result = mysqli_query($db, $query) or die('Error querying database.');
		$row = $result->fetch_assoc();
		
		$addBalance = ($row["FAMILY_SIZE"] * $term) + $row["BALANCE"];
		
		$query = "update PATIENTS 
				set BALANCE = '$addBalance'
				where ACCOUNT_NUM = '$account'";
		$result = mysqli_query($db, $query) or die('Error querying database.');
		
		if(!$result)
			echo "Prescription NOT renewed!";
		else
			echo "Prescription renewed!";

		?>