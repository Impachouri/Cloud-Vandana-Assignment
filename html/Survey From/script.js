const form = document.getElementById("survey-form");
const popup = document.getElementById("popup");
const closePopup = document.getElementById("close-popup");

popup.style.display = "none";

form.addEventListener("submit", function (e) {
  e.preventDefault();

  const firstName = document.getElementById("first-name").value;
  const lastName = document.getElementById("last-name").value;
  const dateOfBirth = document.getElementById("date-of-birth").value;
  const country = document.getElementById("country").value;
  const gender = document.getElementById("gender").value;
  const profession = document.getElementById("profession").value;
  const email = document.getElementById("email").value;
  const mobile = document.getElementById("mobile").value;

  document.getElementById("popup-first-name").textContent = firstName;
  document.getElementById("popup-last-name").textContent = lastName;
  document.getElementById("popup-date-of-birth").textContent = dateOfBirth;
  document.getElementById("popup-country").textContent = country;
  document.getElementById("popup-gender").textContent = gender;
  document.getElementById("popup-profession").textContent = profession;
  document.getElementById("popup-email").textContent = email;
  document.getElementById("popup-mobile").textContent = mobile;

  // Show the popup
  console.log("Button clicked");
  popup.style.display = "block";
});

closePopup.addEventListener("click", function () {
  popup.style.display = "none";
  document.getElementById("survey-form").reset();
});
