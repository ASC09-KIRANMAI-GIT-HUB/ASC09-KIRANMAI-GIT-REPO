document.addEventListener('DOMContentLoaded', function () {
    const form = document.querySelector('.form-box');
    const outputBox = document.createElement('div');
    outputBox.className = 'output-box';
    document.body.appendChild(outputBox);

    form.addEventListener('submit', function (event) {
        event.preventDefault(); // prevent actual form submission

        // Get form data
        const name = document.getElementById('name').value;
        const username = document.getElementById('username').value;
        const password = document.getElementById('pword').value;
        const gender = document.querySelector('input[name="gender"]:checked')?.value || 'Not selected';
        const foodtype = document.querySelector('input[name="foodtype"]:checked')?.value || 'Not selected';
        const country = document.getElementById('country').value;
        const email = document.getElementById('email').value;
        const number = document.getElementById('number').value;
        const birthday = document.getElementById('birthday').value;
        const address = document.getElementById('address').value;

        // Display the data in a formatted way
        outputBox.innerHTML = `
            <h3>Submitted Details:</h3>
            <p><strong>Name:</strong> ${name}</p>
            <p><strong>Username:</strong> ${username}</p>
            <p><strong>Password:</strong> ${password}</p>
            <p><strong>Gender:</strong> ${gender}</p>
            <p><strong>Food Preference:</strong> ${foodtype}</p>
            <p><strong>Nationality:</strong> ${country}</p>
            <p><strong>Email:</strong> ${email}</p>
            <p><strong>Number:</strong> ${number}</p>
            <p><strong>Birthday:</strong> ${birthday}</p>
            <p><strong>Address:</strong> ${address}</p>
        `;

        // Optional: scroll to the output box
        outputBox.scrollIntoView({ behavior: 'smooth' });
    });
});
