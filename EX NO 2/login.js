function login() {
  let user = document.getElementById("username").value;
  let pass = document.getElementById("password").value;

  // simple demo validation
  if (user === "Harrish" && pass === "123456") {
    window.location.href = "About.html";
  } else {
    alert("Invalid Username or Password");
  }
}
