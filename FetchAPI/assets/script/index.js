const url = "https://jsonplaceholder.typicode.com/posts"
// const url = `https://api.github.com/users/matheus258`

const loadingElement = document.querySelector('#loading');
const postsContainer = document.querySelector('#posts-container');

const postPage = document.querySelector('#post');
const postContainer = document.querySelector('#posts-container');
const commentsContainer = document.querySelector('#comments-container');

// Query id from URL

const urlSearchParams = new URLSearchParams(window.location.search);
const postId = urlSearchParams.get('id');

// Get All posts

async function getAllPosts() {

    // Mostrar caminho dos dados.
    const respose = await fetch(url);
    console.log(respose);

    // Pegar dados com Json.
    const data = await respose.json();
    console.log(data);

    // setInterval(()=>{
    //     loadingElement.classList.add('hide')
    // },1000);

        loadingElement.classList.add('hide')


    data.map((post) => {
        // console.log(`Post: ${JSON.stringify(post)}`);
        const div = document.createElement('div');
        const title = document.createElement('h2');
        const body = document.createElement('p');
        const link = document.createElement('a');

        title.innerText = post.title;
        body.innerText = post.body;
        link.innerText = 'Ler';
        link.setAttribute("href", `/post.html?id=${post.id}`);

        div.appendChild(title);
        div.appendChild(body);
        div.appendChild(link);

        postsContainer.appendChild(div);
    })
}

// Get individual post

async function getPost(id) {
    const [responsePost, responseComments] = await Promise.all([
        fetch(`${url}/${id}`),
        fetch(`${url}/${id}/comments`)
    ])

    const dataPost = await responsePost.json();

    const dataComments = await responseComments.json();

    loadingElement.classList.add('hide')
    postPage.classList.remove('hide')
}

if(!postId){

    getAllPosts();
} else {
    getPost(postId);
}