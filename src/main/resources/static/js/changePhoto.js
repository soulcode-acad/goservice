import { initializeApp } from "https://www.gstatic.com/firebasejs/9.6.0/firebase-app.js";
import { getStorage, ref, uploadBytes, deleteObject, getDownloadURL } from "https://www.gstatic.com/firebasejs/9.6.0/firebase-storage.js";

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

document.getElementById("change").addEventListener("click", function () {
    var email = document.getElementById("email").value
    var file = document.getElementById("foto").files[0]
    var imgFirebase = ref(storage, email);
    getDownloadURL(imgFirebase)
        .then((url) => {
            deleteObject(imgFirebase)
                .then(() => {
                    console.log("Foto antiga deletada...");
                })
                .catch((error) => {
                    console.error("Erro ao deletar foto antiga:", error);
                });

            uploadBytes(imgFirebase, file)
                .then((snapshot) => {
                    console.log("Upload da imagem...");
                })
                .catch((error) => {
                    console.error("Erro ao carregar nova imagem:", error);
                });
        })
        .catch((error) => {
            uploadBytes(imgFirebase, file)
                .then((snapshot) => {
                    console.log("Upload da imagem...");
                })
                .catch((error) => {
                    console.error("Erro ao carregar nova imagem:", error);
                });
        });
})