const registerForm = document.querySelector('form');

registerForm.addEventListener('submit', (event) => {
    event.preventDefault();

    const user = {
        firstName: document.getElementById('firstName').value,
        username: document.getElementById('username').value,
        password: document.getElementById('password').value,
    }

    fetch('http://localhost:9086/auth/register', {
        method: 'POST',
        headers: {
           'Content-Type': 'application/json'
        },
        body: JSON.stringify(user) 
    })
    .then(async response => {
        if (response.ok) {
            const message = await response.text();
            alert(message);
            document.getElementById('firstName').value = "";
            document.getElementById('username').value = "";
            document.getElementById('password').value = "";
        } else {
            const data = await response.json();
            alert(data.message);
        }
    })
})