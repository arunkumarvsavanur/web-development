$(document).ready(function() {
    $.ajax({
        type:"GET",
        url: "http://localhost:8080/getCompany",
        dataType: "json",
        cors:true,
        secure:true,
        success: function(data) {

            // console.log("connected",data);
            // console.log("connected")
            console.log(data);
            var table=data.company;
            console.log(table);
        }
    });
    });