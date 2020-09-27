

function valid() {
	

   console.log("sdhkjbbjj");
  
   var name= document.getElementById('fname').value;
console.log(name);
   
   var reg_name=/^[a-zA-z]*$/; 

   var pass= document.getElementById('pass').value;
   var p=/^[a-zA-Z0-9]*$/;

    var email = document.getElementById("email").value;
    var e_name=/^[0-9a-zA-Z._]+@[a-zA-Z]+.[a-zA-Z]{2,3}$/

    var male= document.getElementById('m').checked;
        var fmale= document.getElementById('f').checked;

         var country= document.getElementById("location").value;

     var n=0,pa=0,e=0,g=0;
     var gender;

     if(name=='')
		{
			document.getElementById('nv').innerHTML="enter name";
			

		}else if(!reg_name.test(name))
		{
			document.getElementById('nv').innerHTML="enter valid name";
           
		}else
		{
			document.getElementById('nv').innerHTML='';
			n=1;
		}


		if(pass=='')
		{
			document.getElementById('np').innerHTML="enter password";

		}else if(!p.test(pass))
		{
			document.getElementById('np').innerHTML="enter valid password";
           
		}else
		{
			document.getElementById('np').innerHTML='';
			pa=1;
		}


         if(email == '') {
			document.getElementById("email_error").innerHTML = "Enter Your Email !";
		}
       else if(!e_name.test(email))
        {
			document.getElementById("email_error").innerHTML = "Enter valid Email !";

        }
		 else {
			document.getElementById("email_error").innerHTML = "";	
			e=1;		
		}


		

		if(male==false && fmale==false)
		{
			document.getElementById('gv').innerHTML="check any value";

		}
		else
		{
			document.getElementById('gv').innerHTML='';
			if(male==true)
			{
			  gender=document.getElementById('m').value;
			}
			else
			{
				gender=document.getElementById('f').value;
			}
			
			g=1;
		}
   
      function Customer(name,password,email,gender,country) {
	  this.name=name;
	  this.password=password;
	  this.email=email;
	  this.gender=gender;
	  this.country=country;
	  };
	
    if(n==1 && pa==1 && e==1 && g==1)
    {

      var ob=new Customer(name,pass,email,gender,country);
      var myJson=JSON.stringify(ob);
      alert(myJson);

    }
    else
    {
    	alert("Enter Detalis");
    }
  

}
