const API = "/friends";

function loadFriends(){

   fetch(API)
      .then(res => res.json())
      .then(data => {
            const container = document.getElementById("friends-container");
            container.innerHTML = "";
            data.forEach(friend => {
                container.innerHTML += `
                  <p>
                     ${friend.name} - ${friend.phone} - ${friend.email}
                     <button onclick="deleteFriend(${friend.id})">Delete</button>
                  </p>
               `;
      });
    });

}

function addFriend(){

      const name = document.getElementById("name").value;
      const phone = document.getElementById("phone").value;
      const email = document.getElementById("email").value;

      fetch(API_URL, {
         method: "POST",
         headers: {"Content-Type":"application/json"},
         body:JSON.stringify({name,phone,email})
      })

      .then(() => loadFriends());
}

function deleteFriend(id){
     fetch(`${API}/${id}`,{method:"DELETE"})
         .then(() => loadFriends());
}

loadFriends();