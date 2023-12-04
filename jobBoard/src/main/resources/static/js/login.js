const name = document.getElementById('username');
const email = document.getElementById('password');
const form = document .getElementById('form');

form .addEventListener('submit',(e) =>{
    const errors = [];
    if(name.value.trim() ===""){
        errrs.push("name required")
    }
    if(password.value.length <8){
        error.push("password at lest 8 caracters")
    }
    
    if(error.length >0){
    e.preventdefault();
    errormessage.toggleAttribute('hidden');
    errormessage.innerHTML = error.join(',');
    }
})