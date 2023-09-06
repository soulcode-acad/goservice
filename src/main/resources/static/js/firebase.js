import { initializeApp } from "https://www.gstatic.com/firebasejs/9.6.0/firebase-app.js";
import { getStorage, ref, getDownloadURL, getMetadata } from "https://www.gstatic.com/firebasejs/9.6.0/firebase-storage.js";

const firebaseConfig = {
    apiKey: "AIzaSyD9Mrt2Rqmka21hLWWj0JOHrie8gYvrhQ4",
    authDomain: "goservice-e4609.firebaseapp.com",
    projectId: "goservice-e4609",
    storageBucket: "goservice-e4609.appspot.com",
    messagingSenderId: "92786282846",
    appId: "1:92786282846:web:67f7061a8c4ae1bdd23fcf"
};

const app = initializeApp(firebaseConfig);
const storage = getStorage(app);

export function showPhoto(email, st = storage) {
    if (email != null) {
        var imgFirebase = ref(st, email);
        var profilePhoto = document.getElementById("photo");
        try {
            getDownloadURL(imgFirebase)
                .then((url) => {
                    profilePhoto.setAttribute('src', url);
                })
                .catch((error) => {
                    console.log("Foto de perfil padrão...");
                });
        } catch {
            console.log("Foto de perfil padrão...");
        }
    }
}