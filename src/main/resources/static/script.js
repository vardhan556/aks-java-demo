// Fake login
function login(event) {
  event.preventDefault();
  const username = document.getElementById("login-username").value;
  const password = document.getElementById("login-password").value;

  // Normally, you'd validate with backend
  if (username && password) {
    localStorage.setItem("username", username);
    window.location.href = "dashboard.html";
  } else {
    alert("Please enter valid credentials!");
  }
}

// Fake signup
function signup(event) {
  event.preventDefault();
  const username = document.getElementById("signup-username").value;
  const email = document.getElementById("signup-email").value;
  const password = document.getElementById("signup-password").value;

  if (username && email && password) {
    localStorage.setItem("username", username);
    alert("Account created! Redirecting to dashboard...");
    window.location.href = "dashboard.html";
  } else {
    alert("Please fill all fields!");
  }
}
