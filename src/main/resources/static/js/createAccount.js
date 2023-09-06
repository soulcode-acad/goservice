import { initializeApp } from "https://www.gstatic.com/firebasejs/9.6.0/firebase-app.js";
import { getAuth, createUserWithEmailAndPassword } from "https://www.gstatic.com/firebasejs/9.6.0/firebase-auth.js";

const firebaseConfig = {
    apiKey: "AIzaSyD9Mrt2Rqmka21hLWWj0JOHrie8gYvrhQ4",
    authDomain: "goservice-e4609.firebaseapp.com",
    projectId: "goservice-e4609",
    storageBucket: "goservice-e4609.appspot.com",
    messagingSenderId: "92786282846",
    appId: "1:92786282846:web:67f7061a8c4ae1bdd23fcf"
};

const app = initializeApp(firebaseConfig);
const auth = getAuth(app);

document.getElementById("btn-confirm").addEventListener("click", function(){
    var email = document.getElementById("email").value;
    var password = document.getElementById("senha").value;
    createUserWithEmailAndPassword(auth, email, password)
    .then((userCredential) => {
        const user = userCredential.user;
        console.log("creted");
        console.log(user);
    }) 
    .catch((error) => {
        const errorMessage = error.message;
        console.log(errorMessage);
    })
});