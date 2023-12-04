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

            function printrows() {
                            var j;
                            for (j = 0; j < date.length; j++) {
                                var data = header_result[j];
                                $("#jobs").append(
                                    '<div class="job-card">'+
                                            '<div class="job-name">'+
//                                                <img class="job-profile" src="../icons/te.jpg">
                                                '<div class="job-detail">'+
                                                    '<h4>'+ data.company_name +'</h4>'+
                                                    '<p>'+ data.company_founded_on +'</p>'+
                                                    '<p>'+ data.company_type +'</p>'+
                                                '</div>'+
                                            '</div>'
                                )

                            }


                        }
    });
    };