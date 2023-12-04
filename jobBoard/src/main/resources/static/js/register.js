function validation () {
    var Name = document.getElementById("name").value;
    var Email = document.getElementById("email").value;
    var PhoneNumber = document.getElementById("PhoneNumer").value;
    var JobRole = document.getElementById("Job_Role").value;
    var Address = document.getElementById("address").value;
    var City = document.getElementById("City").value;
    var DateOfBirth = document.getElementById("Date").value;
    var File = document.getElementById("file").value;
    var registrationDetails={address:Address ,city:City ,date_of_birth:DateOfBirth ,email:Email ,job_role:JobRole ,name:Name ,phone_number:PhoneNumber , upload_file:File}

    console.log(registrationDetails)
    $.ajax({
            type:"POST",
            url:"http://localhost:8080/addRegister",
            dataType:"json",
            contentType:'application/json',
            data:JSON.stringify(registrationDetails),
            success:function (jobRegistration){
                console.log("entered")
            }
        })




}