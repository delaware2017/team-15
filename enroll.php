<?php
	//echo "attempt to connect";
	$db = mysqli_connect('10.88.22.106','team15','team15Waves','wholesomewave')
	 or die('Error connecting to MySQL server.');
?>

<html>
<body>
	Name: <?php echo $_POST["1stname"] . " " . $_POST["lastname"]; ?><br>

		<?php
//		$query = "SELECT * FROM providers";
//		mysqli_query($db, $query) or die('Error querying database.');

//		$result = mysqli_query($db, $query);
//		$row = mysqli_fetch_array($result);

//		while ($row = mysqli_fetch_array($result)) {
//		 echo $row['PROVIDER_NUM'] . " " . $row['PASSCODE'] . ": " . $row['NAME'] . " " . $row['TYPE'] ."<br />";
//		}

		?>