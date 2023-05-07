$("document").ready(function () {
    function fun(e) {
        const daysOfWeekend = $('#daysOfWeekend').val();
        const middleSalary = $('#middleSalary').val();

        const data = {
            daysOfWeekend,
            middleSalary
        }
        console.log(data);

        $.ajax({
            type: "GET",
            url: "/calculate",
            contentType: "text",
            dataType: 'json',
            data: data,
            success: function (responseData) {
                console.log(responseData);
                let result = document.getElementById('result');
                result.textContent = "Отпускные: " + responseData.weekendSalary;
            },
            error: function (responseData) {
                console.log(responseData);
                alert("Отпускныене не посчитаны, возникла ошибка!");
            }
        });
        e.preventDefault();
    }
    document.getElementById('calculate_btn').addEventListener('click', fun);
})