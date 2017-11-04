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
			<p><a href="index.html">Home</a></P>
			<p><a href="enrollment.html">Physician Enrollment</a></p>
		 </nav>
         <h2>Account Information</h2>		 
	     </div>
	     <article>
		
	<dl>
	
		<?php
		$account = $_POST["account_num"];
		$name;
		
		$query = "select FIRST_NAME, BALANCE from patients where ACCOUNT_NUM = '$account'";
		
		$result = mysqli_query($db, $query) or die('Error querying database.');
		$row = $result->fetch_assoc();
		
		echo $row["FIRST_NAME"] . ", you are logged in. <br>";
	
		echo "Your balance is $" . $row["BALANCE"];
		
		?>  
		
		<p>
		Here is your scanner code for shopping.  You may scan it on your phone or print it to use.
		<p>
		<img src="qr_code.png">