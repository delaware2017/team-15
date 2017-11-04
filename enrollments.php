
<?php
//echo "attempt to connect";
$db = mysqli_connect('10.88.22.106','team15','team15Waves','wholesomewave')
 or die('Error connecting to MySQL server.');
?>

<html lang="en">
   <head>
   <title>Wholesome Wave</title>
   <!--
         Wholesome Wave main web page
         Filename: enrollment.html
		 -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width">
    <script src="modernizr.custom.40753.js"></script>
	<link href='http://fonts.googleapis.com/css?family=Krona+One' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="styles.css">
	<link rel="shortcut icon" href="images/favicon.ico">
	<link rel="apple-touch-icon" href="images/apple-touch-icon.png">
	<link rel="icon" sizes="192x192" href="images/android.png">
	</head>
	<body>
	     <div class="container">
         <p class="skipnavigation"><a href="#contentstart">Skip navigation</a></p> 
         <header>
		 <h1>Wholesome Wave</h1>
		 </header>
		 <nav class="sitenavigation">
			<p><a href="index.html">Index</a></p>
			<p><a href="physician.html">Physician</a></p>
		 </nav>
         <h2>Patient Information</h2>		 
	     </div>
	     <article>
		
	<dl>
	<form action="/enroll.php" method="post">
		<input type="hidden" name="recipients" value="N3UZJim_at_aol.com" />
		<input type="hidden" name="good_url" value="thanks.html" />
		<input type="hidden" name="mail_options" value="CharSet=UTF-8,HTMLTemplate=emailtemplate.html,
			NoPlain,KeepLines,TemplateMissing=n/a,Exclude=realname;submit" />
		<input type="date" id="date" name="date">
						
		<fieldset class="ownername">
			<legend>Account Owner</legend>
				  <label for="nameinput">
						  First Name
					<input type="1stname" name="1stname" id="1stnameinput" placeholder="First name">
				  </label>
				  <label for="nameinput">
						  Last Name
					<input type="lastname" name="lastname" id="lastnameinput" placeholder="Last name">
				  </label>
		</fieldset>
		<fieldset class="address">
			<legend>Address</legend>
				  <label for="street">
						  Street
					<input type="street" name="street" id="street" placeholder="Street">
				  </label><br>
				  <label for="city">
						  City
					<input type="city" name="city" id="city" placeholder="City">
				  </label>
				  <label for="statecode">
					  <select name="statecode">
						<option value="AL">Alabama</option>
						<option value="AK">Alaska</option>
						<option value="AZ">Arizona</option>
						<option value="AR">Arkansas</option>
						<option value="CA">California</option>
						<option value="CO">Colorado</option>
						<option value="CT">Connecticut</option>
						<option value="DE">Delaware</option>
						<option value="FL">Florida</option>
						<option value="GA">Georgia</option>
						<option value="HI">Hawaii</option>
						<option value="ID">Idaho</option>
						<option value="IL">Illinois</option>
						<option value="IN">Indiana</option>
						<option value="IA">Iowa</option>
						<option value="KS">Kansas</option>
						<option value="KY">Kentucky</option>
						<option value="LA">Louisiana</option>
						<option value="ME">Maine</option>
						<option value="MD">Maryland</option>
						<option value="MA">Massachusetts</option>
						<option value="MI">Michigan</option>
						<option value="MN">Minnesota</option>
						<option value="MS">Mississippi</option>
						<option value="MO">Missouri</option>
						<option value="MT">Montana</option>
						<option value="NE">Nebraska</option>
						<option value="NV">Nevada</option>
						<option value="NH">New Hampshire</option>
						<option value="NJ">New Jersey</option>
						<option value="NM">New Mexico</option>
						<option value="NY">New York</option>
						<option value="NC">North Carolina</option>
						<option value="ND">North Dakota</option>
						<option value="OH">Ohio</option>
						<option value="OK">Oklahoma</option>
						<option value="OR">Oregon</option>
						<option value="PA">Pennsylvania</option>
						<option value="RI">Rhode Island</option>
						<option value="SC">South Carolina</option>
						<option value="SD">South Dakota</option>
						<option value="TN">Tennessee</option>
						<option value="TX">Texas</option>
						<option value="UT">Utah</option>
						<option value="VT">Vermont</option>
						<option value="VA">Virginia</option>
						<option value="WA">Washington</option>
						<option value="WV">West Virginia</option>
						<option value="WI">Wisconsin</option>
						<option value="WY">Wyoming</option>
					  </select>
					</label>
				  <br>
				  <label for="zip">
						  Zip Code
					<input type="zip" name="zip" id="zip" placeholder="ZIP code">
				  </label>
			</fieldset>
			<fieldset class="contact">
			<legend>Contact Information</legend>
				  <label for="cellphone">
						  Cell Phone
					<input type="cellphone" name="cellphone" id="cellphone" placeholder="cellphone">
				  </label>
				  <label for="nameinput">
						  Last Name
					<input type="lastname" name="lastname" id="lastnameinput" placeholder="Last name">
				  </label>
		</fieldset>
		
	</form>

		<?php
		$query = "SELECT * FROM providers";
		mysqli_query($db, $query) or die('Error querying database.');

		$result = mysqli_query($db, $query);
		$row = mysqli_fetch_array($result);

		while ($row = mysqli_fetch_array($result)) {
		 echo $row['PROVIDER_NUM'] . " " . $row['PASSCODE'] . ": " . $row['NAME'] . " " . $row['TYPE'] ."<br />";
		}

		?>
		

	</dl>
		    
	</body>
</html>